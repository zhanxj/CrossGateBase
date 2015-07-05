package cg.base.io;

public interface ImageResource {

	byte getVersion();

	String getType();

	String getPath();

	String getSuffix();

	String getDecription();

	boolean isColorPalette();
	
	String getInfoFile();
	
	String getDataFile();
	
}
