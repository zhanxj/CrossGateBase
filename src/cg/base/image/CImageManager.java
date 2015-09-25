package cg.base.image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cg.base.io.ImageResource;
import cg.base.log.Log;
import cg.base.reader.CColorPaletteReader;
import cg.base.util.IOUtils;

import com.google.common.collect.Lists;

public abstract class CImageManager implements ImageManager {
	
	private Map<Byte, Map<Integer, BufferedImage>> versionCImages;
	
	private Map<String, List<ResourceListener>> listeners;
	
	private Map<String, ColorPalette[]> colorPalettes;
	
	private String globalColorPaletteName;
	
	protected Map<String, List<ImageResource>> resources;
	
	protected ImageReader imageReader;
	
	protected Log log;
	
	public CImageManager(Log log, String clientFilePath) {
		this.log = log;
		versionCImages = new HashMap<Byte, Map<Integer, BufferedImage>>();
		listeners = new HashMap<String, List<ResourceListener>>();
		resources = new HashMap<String, List<ImageResource>>();
		loadColorPalette(clientFilePath);
		setGlobalColorPaletteName("palet_00.cgp");
		imageReader = createImageReader(clientFilePath);
	}
	
	protected abstract ImageReader createImageReader(String clientFilePath);
	
	protected void loadColorPalette(String clientFilePath) {
		CColorPaletteReader colorPaletteReader = new CColorPaletteReader();
		File file = new File(clientFilePath);
		colorPalettes = colorPaletteReader.read(new File(file, "bin" + IOUtils.PATH_SPLIT + "pal"));
		
		ColorPalette[] colorPalettes = new ColorPalette[32];
		short[][] colors = new short[][]{{0, 0, 0}, {0, 0, 0x80}, {00, 0x80, 0}, {0, 0x80, 0x80}, 
				{0x80, 0, 0}, {0x80, 0, 0x80}, {0x80, 0x80, 0}, {0xC0, 0xC0, 0xC0}, 
				{0xC0, 0xDC, 0xC0}, {0xF0, 0xCA, 0xA6}, {0, 0, 0xDE}, {00, 0x5F, 0xFF}, 
				{0xA0, 0xFF, 0xFF}, {0xD2, 0x5F, 0}, {0xFF, 0xD2, 0x50}, {0x28, 0xE1, 0x28}};
		for (int i = 0;i < colors.length;i++) {
			colorPalettes[i] = CColorPaletteReader.createColorPalette(colors[i][0], colors[i][1], colors[i][2]);
		}
		
		colors = new short[][]{{0x96, 0xC3, 0xF5}, {0x5F, 0xA0, 0x1E}, {0x46, 0x7D, 0xC3}, 
				{0x1E, 0x55, 0x9B}, {0x37, 0x41, 0x46}, {0x1E, 0x23, 0x28}, {0xF0, 0xFB, 0xFF}, 
				{0xA5, 0x6E, 0x3A}, {0x80, 0x80, 0x80}, {00, 00, 0xFF}, {00, 0xFF, 00}, 
				{00, 0xFF, 0xFF}, {0xFF, 00, 00}, {0xFF, 0x80, 0xFF}, {0xFF, 0xFF, 00}, 
				{0xFF, 0xFF, 0xFF}};
		for (int i = 0;i < colors.length;i++) {
			colorPalettes[i + 16] = CColorPaletteReader.createColorPalette(colors[i][0], colors[i][1], colors[i][2]);
		}
		
		this.colorPalettes.put(DEFAULT_COLOR_PALETTE_NAME, colorPalettes);
	}

	@Override
	public BufferedImage getCImage(byte version, int imageId, String colorPalette) {
		Map<Integer, BufferedImage> images = versionCImages.get(version);
		if (images == null) {
			images = new HashMap<Integer, BufferedImage>();
			versionCImages.put(version, images);
		}
		
		BufferedImage image = images.get(imageId);
		if (image == null) {
			try {
				image = imageReader.read(version, imageId, colorPalette).getBufferedImage();
				images.put(imageId, image);
			} catch (IOException e) {
				log.error(getClass().getName(), e);
			}
//		} else {
//			CrossGateBase.log.info(getClass() + ".getCImage() find hit! version = " + version + " ; id = " + id);
		}
		
		return image;
	}

	@Override
	public BufferedImage getCImage(byte version, int imageId) {
		Map<Integer, BufferedImage> images = versionCImages.get(version);
		if (images == null) {
			images = new HashMap<Integer, BufferedImage>();
			versionCImages.put(version, images);
		}
		
		BufferedImage image = images.get(imageId);
		if (image == null) {
			try {
				image = imageReader.read(version, imageId).getBufferedImage();
				images.put(imageId, image);
			} catch (Exception e) {
				log.error(getClass().getName(), e);
			}
//		} else {
//			CrossGateBase.log.info(getClass() + ".getCImage() find hit! version = " + version + " ; id = " + id);
		}
		
		return image;
	}

	@Override
	public void clear() {
		versionCImages.clear();
	}

	@Override
	public void release(byte version, int imageId) {
		Map<Integer, BufferedImage> images = versionCImages.get(version);
		if (images != null) {
			images.remove(imageId);
			if (images.size() == 0) {
				versionCImages.remove(version);
			}
		}
	}

	@Override
	public BufferedImage getCImage(int imageGlobalId, String colorPalette) {
		ImageDictionary imageDictionary = imageReader.getImageDictionary(imageGlobalId);
		return imageDictionary == null ? null : getCImage(imageDictionary.getVersion(), imageDictionary.getResourceId(), colorPalette);
	}

	@Override
	public BufferedImage getCImage(int imageGlobalId) {
		ImageDictionary imageDictionary = imageReader.getImageDictionary(imageGlobalId);
		return imageDictionary == null ? null : getCImage(imageDictionary.getVersion(), imageDictionary.getResourceId());
	}

	@Override
	public List<ImageResource> getImageResources(String type) {
		return resources.get(type);
	}

	@Override
	public ImageData getImageData(byte version, int imageId, String colorPalette) {
		try {
			return imageReader.read(version, imageId, colorPalette);
		} catch (IOException e) {
			log.error(getClass().getName(), e);
			return null;
		}
	}

	@Override
	public ImageData getImageData(byte version, int imageId) {
		try {
			return imageReader.read(version, imageId);
		} catch (IOException e) {
			log.error(getClass().getName(), e);
			return null;
		}
	}

	@Override
	public ImageData getImageData(int imageGlobalId, String colorPalette) {
		ImageDictionary imageDictionary = imageReader.getImageDictionary(imageGlobalId);
		return imageDictionary == null ? null : getImageData(imageDictionary.getVersion(), imageDictionary.getResourceId(), colorPalette);
	}

	@Override
	public ImageData getImageData(int imageGlobalId) {
		ImageDictionary imageDictionary = imageReader.getImageDictionary(imageGlobalId);
		return imageDictionary == null ? null : getImageData(imageDictionary.getVersion(), imageDictionary.getResourceId());
	}

	@Override
	public void addResource(ImageResource resource) {
		if (!resources.containsKey(resource.getType())) {
			resources.put(resource.getType(), Lists.newLinkedList());
			listeners.put(resource.getType(), Lists.newLinkedList());
		}
		resources.get(resource.getType()).add(resource);
		if (listeners.containsKey(resource.getType())) {
			for (ResourceListener listener : listeners.get(resource.getType())) {
				listener.addResource(resource);
			}
		}
	}

	@Override
	public void reloadResource(ImageResource resource) throws Exception {
		for (ResourceListener listener : listeners.get(resource.getType())) {
			listener.reload(resource);
		}
	}

	@Override
	public void addResourceListener(ResourceListener listener, String type) {
		listeners.get(type).add(listener);
	}

	@Override
	public ColorPalette[] getColorPalettes(String name) {
		return colorPalettes.get(name);
	}

	@Override
	public void setGlobalColorPaletteName(String name) {
		globalColorPaletteName = name;
	}

	@Override
	public ColorPalette[] getGlobalColorPalette() {
		return colorPalettes.get(globalColorPaletteName);
	}

	@Override
	public ColorPalette[] getDefaultColorPalette() {
		return colorPalettes.get(DEFAULT_COLOR_PALETTE_NAME);
	}

	@Override
	public ImageReader getImageReader() {
		return imageReader;
	}

}
