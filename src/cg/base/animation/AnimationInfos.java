package cg.base.animation;

import cg.base.image.ImageDictionary;

public interface AnimationInfos {
	
	byte ANIMATION_WEAPON_CLASS = 6;
	
	byte ANIMATION_ROLE_COLOR = 4;
	
	byte ANIMATION_DIR = 8;
	
	byte ANIMATION_ROLE_ACTION = 21;
	
	byte ANIMATION_CREATURE_ACTION = 10;
	
	int getId();
	
	int getSize();
	
	AnimationInfo getAnimationInfo(int id);
	
	public interface AnimationInfo {
		
		byte getDir();
		
		byte getActionId();
		
		int getTime();
		
		int getFrame();
		
		ImageDictionary getImageDictionary(int index);
		
		boolean getIsMirror();
		
	}
	
	public interface FrameInfo {

		public int getImageId();

		public char[] getUnknow();
		
	}

}
