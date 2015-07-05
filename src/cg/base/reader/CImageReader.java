package cg.base.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import cg.base.image.ImageData;
import cg.base.image.ImageDictionary;
import cg.base.image.ImageManager;
import cg.base.image.ImageReader;
import cg.base.io.ImageResource;
import cg.base.log.Log;

public class CImageReader implements ImageReader {
	
	private CRunLengthImageReader[] runLengthImageReaders;
	
	protected Map<Integer, Integer> globalIds;
	
	protected ImageDictionary[][] imageDictionaries;
	
	protected ImageManager imageManager;
	
	protected Log log;
	
	public CImageReader(ImageManager imageManager, Log log, String clientFilePath) {
		this.imageManager = imageManager;
		this.log = log;
		List<ImageResource> list = imageManager.getImageResources(RESOURCE_TYPE);
		
		int size = list.size();
		imageDictionaries = new ImageDictionary[size][];
		globalIds = new TreeMap<Integer, Integer>();
		runLengthImageReaders = new CRunLengthImageReader[size];
		File dir = new File(clientFilePath);
		for (byte i = 0;i < size;i++) {
			ImageResource resource = list.get(i);
			File file = new File(dir, resource.getInfoFile()); 
			try {
				FileInputStream fis = new FileInputStream(file);
				runLengthImageReaders[i] = new CRunLengthImageReader(new File(dir, resource.getDataFile()), log, imageManager);
				imageDictionaries[i] = load((int) (fis.getChannel().size() / ImageDictionary.DATA_HEAD_LENGTH), resource, fis);
				log.info(getClass().getSimpleName() + " : load " + resource.getDataFile() + ".");
			} catch (IOException e) {
				log.error(getClass().getName(), e);
			}
		}
	}
	
	protected void addRunLengthImageReader(byte version, File file) {
		if (version >= runLengthImageReaders.length) {
			CRunLengthImageReader[] runLengthImageReaders = new CRunLengthImageReader[version + 1];
			for (int i = 0;i < this.runLengthImageReaders.length;i++) {
				runLengthImageReaders[i] = this.runLengthImageReaders[i];
			}
			runLengthImageReaders[version] = new CRunLengthImageReader(file, log, imageManager);
			this.runLengthImageReaders = runLengthImageReaders;
		}
	}
	
	protected ImageDictionary[] load(int size, ImageResource resource, FileInputStream fis) {
		ImageDictionary[] imageDictionaries = new ImageDictionary[size];
		for (int imageId = 0;imageId < size;imageId++) {
			try {
				fis.getChannel().position(imageId * CImageDictionary.DATA_HEAD_LENGTH);
				byte version = resource.getVersion();
				imageDictionaries[imageId] = createImageDictionary(resource, fis);
				if (imageDictionaries[imageId].getGlobalId() > 0) {
					globalIds.put(imageDictionaries[imageId].getGlobalId(), version << 24 | imageId);
				}
//				read(version, imageDictionary.getImageId(), imageManager.GLOBAL_COLOR);
			} catch (IOException e) {
				log.error(getClass().getName(), e);
			}
		}
		return imageDictionaries;
	}
	
	protected ImageDictionary createImageDictionary(ImageResource resource, FileInputStream fis) throws IOException {
		return new CImageDictionary(fis, resource, imageManager);
	}

	@Override
	public ImageData read(byte version, int imageId, String colorPalette) throws IOException {
		ImageDictionary imageDictionary = getImageDictionary(version, imageId);
		return imageDictionary == null ? null : runLengthImageReaders[version].read(imageDictionary, imageManager.getColorPalettes(colorPalette));
	}

	@Override
	public ImageData read(byte version, int imageId) throws IOException {
		ImageDictionary imageDictionary = getImageDictionary(version, imageId);
		return imageDictionary == null ? null : runLengthImageReaders[version].read(imageDictionary);
	}

	@Override
	public ImageData read(int imageGlobalId, String colorPalette) throws IOException {
		ImageDictionary imageDictionary = getImageDictionary(imageGlobalId);
		return imageDictionary == null ? null : runLengthImageReaders[imageDictionary.getVersion()].read(imageDictionary, imageManager.getColorPalettes(colorPalette));
	}

	@Override
	public ImageData read(int imageGlobalId) throws IOException {
		ImageDictionary imageDictionary = getImageDictionary(imageGlobalId);
		byte version = imageDictionary.getVersion();
		return imageDictionary == null ? null : imageDictionary.hasColorPalettes() ? runLengthImageReaders[version].read(imageDictionary, imageManager.getGlobalColorPalette()) : runLengthImageReaders[version].read(imageDictionary);
	}

	@Override
	public ImageDictionary getImageDictionary(int imageGlobalId) {
		if (globalIds.containsKey(imageGlobalId)) {
			int id = globalIds.get(imageGlobalId);
			return getImageDictionary((byte) (id >> 24), id & 0x7FFFFF);
		} else {
			return null;
		}
	}

	@Override
	public ImageDictionary getImageDictionary(byte version, int imageId) {
		return imageDictionaries[version][imageId];
	}

	@Override
	public ImageDictionary[] getImageDictionaries(int[] imageGlobalIds) {
		ImageDictionary[] imageDictionaries = new ImageDictionary[imageGlobalIds.length];
		for (int i = 0;i < imageDictionaries.length;i++) {
			imageDictionaries[i] = getImageDictionary(imageGlobalIds[i]);
		}
		return imageDictionaries;
	}

	@Override
	public int getCount(byte version) {
		return version < imageDictionaries.length ? imageDictionaries[version].length : 0;
	}

	@Override
	public long getSize(byte version) {
		return version < runLengthImageReaders.length ? runLengthImageReaders[version].getSize() : 0;
	}

}
