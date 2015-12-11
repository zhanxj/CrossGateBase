package cg.base.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Maps;

import cg.base.animation.Animation;
import cg.base.animation.AnimationInfos;
import cg.base.animation.AnimationInfos.AnimationInfo;
import cg.base.animation.AnimationInfos.FrameInfo;
import cg.base.animation.AnimationReader;
import cg.base.animation.CAnimation;
import cg.base.animation.ImageAnimation;
import cg.base.animation.SpriteAnimation;
import cg.base.image.ImageDictionary;
import cg.base.image.ImageManager;
import cg.base.image.ImageReader;
import cg.base.io.ImageResource;
import cg.base.io.ResourceInfo;
import cg.base.loader.Version;
import cg.base.time.Time;
import cg.base.util.MathUtil;
import cg.base.util.UnitUtil;

public class CAnimationReader implements AnimationReader, Version {
	
	protected static final Logger log = LoggerFactory.getLogger(CAnimationReader.class);
	
	protected static final short ANIMATION_TURE_INDEX = 2375;
	
	protected static final byte HEAD_LENGTH = 12;
	
	protected FileInputStream[] fis, fis0;
	
	protected Map<Integer, ResourceInfo> animationDictionarys;
	
	protected ImageReader imageReader;
	
	protected Time timer;
	
	public CAnimationReader(String clientFilePath, ImageManager imageManager, Time timer) {
		this.timer = timer;
		imageReader = imageManager.getImageReader();
		List<ImageResource> list = imageManager.getImageResources(RESOURCE_TYPE);
		
		int size = list.size();
		fis = new FileInputStream[size];
		fis0 = new FileInputStream[size];
		animationDictionarys = Maps.newHashMap();
		File dir = new File(clientFilePath);
		for (byte i = 0;i < size;i++) {
			ImageResource resource = list.get(i);
			try {
				fis[i] = new FileInputStream(new File(dir, resource.getInfoFile()));
				fis0[i] = new FileInputStream(new File(dir, resource.getDataFile()));
				
				for (int index = 0, loop = (int) (fis[i].getChannel().size() / HEAD_LENGTH);index < loop;index++) {
					if (i == VERSION_20 && index < ANIMATION_TURE_INDEX) {
						continue;
					}
					int animationId = readAnimationId(i, index);
					saveAnimationDictionary(new CAnimationDictionary(animationId, i == VERSION_20 ? index - ANIMATION_TURE_INDEX : index, i));
				}
				log.info("{} : load {}.", getClass().getSimpleName(), resource.getDataFile());
			} catch (IOException e) {
				log.error("", e);
			}
		}
	}
	
	protected int readAnimationId(byte version, int index) throws IOException {
		fis[version].getChannel().position((index) * HEAD_LENGTH);
		byte[] bytes = new byte[HEAD_LENGTH];
		fis[version].read(bytes);
		return MathUtil.bytesToInt(bytes, 0);
	}
	
	protected void saveAnimationDictionary(ResourceInfo resourceInfo) {
		animationDictionarys.put(resourceInfo.getGlobalId(), resourceInfo);
	}
	
	@Override
	public AnimationInfos read(int globalId) throws IOException {
		if (animationDictionarys.containsKey(globalId)) {
			ResourceInfo animationDictionary = animationDictionarys.get(globalId);
			return read(animationDictionary.getVersion(), animationDictionary.getResourceId());
		} else {
			throw new IOException(getClass().getName() + " animation not found animationId = " + globalId);
		}
	}

	@Override
	public AnimationInfos read(byte version, int resourceId) throws IOException {
		resourceId = version == VERSION_20 ? resourceId + ANIMATION_TURE_INDEX : resourceId;
		fis[version].getChannel().position((resourceId) * HEAD_LENGTH);
		return new CAnimationInfos(fis[version], version, fis0[version], imageReader);
	}

	@Override
	public Animation createAnimation(int globalId) throws IOException {
		return animationDictionarys.containsKey(globalId) ? new SpriteAnimation(read(globalId), timer) : 
			new ImageAnimation(imageReader.getImageDictionary(globalId));
	}

	@Override
	public Animation createAnimation(byte version, int resourceId) throws IOException {
		return new SpriteAnimation(read(version, resourceId), timer);
	}

	@Override
	public Animation createAnimation(int[] imageIds, int time) throws IOException {
		ImageDictionary[] images = new ImageDictionary[imageIds.length];
		for (int i = 0;i < imageIds.length;i++) {
			images[i] = imageReader.getImageDictionary(imageIds[i]);
		}
		return new CAnimation(images, time, timer);
	}
	
	private static class CFrameInfo implements FrameInfo {
		
		private int imageId;
		
		private char[] unknow;
		
		public CFrameInfo(FileInputStream fis) throws IOException {
			byte[] bytes = new byte[10];
			fis.read(bytes);
			imageId = MathUtil.bytesToInt(bytes, 0);
			unknow = new char[6];
			for (int i = 0;i < unknow.length;i++) {
				unknow[i] = (char) bytes[i + 4];
			}
		}

		@Override
		public int getImageId() {
			return imageId;
		}

		@Override
		public char[] getUnknow() {
			return unknow;
		}
		
	}
	
	protected static class SpriteAnimationInfo implements AnimationInfo {
		
		public static final byte[] SIZES = new byte[]{12, 12, 12, 12, 20, 20, 20, 20};
		
		protected byte dir;
		
		protected byte actionId;
		
		protected int time;
		
		protected int frame;
		
		protected ImageDictionary[] images;
		
		protected boolean isMirror;
		
		protected FrameInfo[] frameInfos;
		
		public SpriteAnimationInfo(FileInputStream fin, byte version, ImageReader imageReader) throws IOException {
			byte[] bytes = new byte[SIZES[version]];
			fin.read(bytes);
			dir = (byte) MathUtil.bytesToShort(bytes, 0);
			actionId = (byte) MathUtil.bytesToShort(bytes, 2);
			time = MathUtil.bytesToInt(bytes, 4);
			frame = MathUtil.bytesToInt(bytes, 8);
			frameInfos = new FrameInfo[frame];
			isMirror = version < VERSION_PUK_2 ? false : MathUtil.bytesToShort(bytes, 14) % 2 == 1;
			images = new ImageDictionary[frame];
			for (int i = 0;i < frame;i++) {
				frameInfos[i] = new CFrameInfo(fin);
				images[i] = imageReader.getImageDictionary(version, frameInfos[i].getImageId());
			}
		}
		
		protected SpriteAnimationInfo() {}

		@Override
		public byte getDir() {
			return dir;
		}

		@Override
		public byte getActionId() {
			return actionId;
		}

		@Override
		public int getTime() {
			return time;
		}

		@Override
		public int getFrame() {
			return frame;
		}

		@Override
		public ImageDictionary getImageDictionary(int index) {
			return images[index];
		}

		@Override
		public String toString() {
			return getClass().getName() + " : actionId = " + actionId + " ; dir = " + dir + " ; time = " + time + " ; frame = " + frame;
		}

		@Override
		public boolean getIsMirror() {
			return isMirror;
		}
		
	}
	
	protected static class CAnimationInfos implements AnimationInfos {
		
		protected static final byte[] bytes = new byte[HEAD_LENGTH];
		
		protected int id;
		
		protected int address;
		
		protected short actionCount;
		
		protected Map<Integer, AnimationInfo> animationInfos;
		
		public CAnimationInfos(FileInputStream fin, byte version, FileInputStream fis0, ImageReader imageReader) throws IOException {
			fin.read(bytes);
			id = MathUtil.bytesToInt(bytes, 0);
			address = MathUtil.bytesToInt(bytes, 4);
			actionCount = MathUtil.bytesToShort(bytes, 8);
			
			animationInfos = Maps.newHashMap();
			fis0.getChannel().position(address);
			for (int i = 0;i < actionCount;i++) {
				AnimationInfo animationInfo = new SpriteAnimationInfo(fis0, version, imageReader);
				animationInfos.put(UnitUtil.makeAnimationActionId(animationInfo.getDir(), animationInfo.getActionId()), animationInfo);
			}
		}
		
		protected CAnimationInfos() {}

		@Override
		public int getId() {
			return id;
		}

		@Override
		public int getSize() {
			return actionCount;
		}

		@Override
		public AnimationInfo getAnimationInfo(int id) {
			return animationInfos.get(id);
		}
		
	}

	@Override
	public ResourceInfo getResourceInfo(int globalId) {
		return animationDictionarys.get(globalId);
	}

	@Override
	public ResourceInfo[] getResourceInfos(int[] globalIds) {
		ResourceInfo[] resourceInfos = new ResourceInfo[globalIds.length];
		for (int i = 0;i < globalIds.length;i++) {
			resourceInfos[i] = getResourceInfo(globalIds[i]);
		}
		return resourceInfos;
	}

}
