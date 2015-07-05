package cg.base.image;

import java.awt.image.BufferedImage;

public interface ImageData {
	
	BufferedImage getBufferedImage();
	
	byte getHeadVersion();
	
	ColorPalette[] getColorPalettes();

}
