package cg.base.image;

import java.io.IOException;

public interface ImageReader {
	
	String RESOURCE_TYPE = "Graphic";
	
	ImageDictionary getImageDictionary(byte version, int imageId);
	
	ImageDictionary getImageDictionary(int imageGlobalId);
	
	ImageDictionary[] getImageDictionaries(int[] imageGlobalIds);
	
	ImageData read(byte version, int imageId, String colorPalette) throws IOException;
	
	ImageData read(byte version, int imageId) throws IOException;
	
	ImageData read(int imageGlobalId, String colorPalette) throws IOException;
	
	ImageData read(int imageGlobalId) throws IOException;
	
	int getCount(byte version);
	
	long getSize(byte version);

}
