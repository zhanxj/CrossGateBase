package cg.base.animation;

import cg.base.animation.AnimationInfos.AnimationInfo;
import cg.base.image.ImageDictionary;
import cg.base.time.Time;

public final class Animations {
	
	private Animations() {}
	
	public static Animation createSingleImageAnimation(ImageDictionary image) {
		return new SingleImageAnimation(image);
	}
	
	public static Animation createMultiImageAnimation(ImageDictionary[] images, int time, Time timer) {
		return new MultiImageAnimation(images, time, timer);
	}
	
	public static Animation createMultiImageAnimation(AnimationInfo animationInfo, Time timer) {
		return new MultiImageAnimation(animationInfo, timer);
	}
	
	public static Animation createDataAnimation(AnimationInfos animationInfos, Time timer) {
		return new DataAnimation(animationInfos, timer);
	}

}
