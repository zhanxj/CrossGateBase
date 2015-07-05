package cg.base.image;

import cg.base.io.ImageResource;

public interface ResourceListener {
	
	void addResource(ImageResource resource);
	
	void reload(ImageResource resource) throws Exception;

}
