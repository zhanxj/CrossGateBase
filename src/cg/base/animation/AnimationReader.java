package cg.base.animation;

import java.io.IOException;

import cg.base.io.ResourceInfo;

public interface AnimationReader {
	
	String RESOURCE_TYPE = "Anime";
	
	ResourceInfo getResourceInfo(int globalId);
	
	ResourceInfo[] getResourceInfos(int[] globalIds);
	
	AnimationInfos read(int globalId) throws IOException;
	
	AnimationInfos read(byte version, int resourceId) throws IOException;
	
	Animation createAnimation(int globalId) throws IOException;
	
	Animation createAnimation(byte version, int resourceId) throws IOException;
	
	Animation createAnimation(int[] imageIds, int time) throws IOException;

}
