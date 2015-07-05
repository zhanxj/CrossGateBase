package cg.base.image;

import java.awt.image.BufferedImage;
import java.util.List;

import cg.base.io.ImageResource;

public interface ImageManager {
	
	String DEFAULT_COLOR_PALETTE_NAME = "DEFAULT";
	
	BufferedImage getCImage(byte version, int imageId, String colorPalette);
	
	BufferedImage getCImage(byte version, int imageId);
	
	BufferedImage getCImage(int imageGlobalId, String colorPalette);
	
	BufferedImage getCImage(int imageGlobalId);
	
	ImageData getImageData(byte version, int imageId, String colorPalette);
	
	ImageData getImageData(byte version, int imageId);
	
	ImageData getImageData(int imageGlobalId, String colorPalette);
	
	ImageData getImageData(int imageGlobalId);
	
	void clear();
	
	void release(byte version, int imageId);
	
	List<ImageResource> getImageResources(String type);
	
	void addResource(ImageResource resource);
	
	void reloadResource(ImageResource resource) throws Exception;
	
	void addResourceListener(ResourceListener listener, String type);
	
	ColorPalette[] getColorPalettes(String name);
	
	void setGlobalColorPaletteName(String name);
	
	ColorPalette[] getGlobalColorPalette();
	
	ColorPalette[] getDefaultColorPalette();
	
	ImageReader getImageReader();

}
