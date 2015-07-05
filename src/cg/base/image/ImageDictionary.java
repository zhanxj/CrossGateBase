package cg.base.image;

import java.awt.image.BufferedImage;

import cg.base.io.ResourceInfo;

public interface ImageDictionary extends ResourceInfo, PositionPaintable {
	
	byte HEAD_VERSION_BITMAP = 0;
	
	byte HEAD_VERSION_RLE = 1;
	
	byte HEAD_VERSION_RLE_COLOR_PALETTES = 3;
	
	byte DATA_HEAD_LENGTH = 40;
	
	byte STREAM_RESOURCE_ID = 0;
	
	byte STREAM_ADDRESS = 4;
	
	byte STREAM_SIZE = 8;
	
	byte STREAM_OFFSET_X = 12;
	
	byte STREAM_OFFSET_Y = 16;
	
	byte STREAM_WIDTH = 20;
	
	byte STREAM_HEIGHT = 24;
	
	byte STREAM_USE_EAST = 28;
	
	byte STREAM_USE_SOUTH = 29;
	
	byte STREAM_MARK = 30;
	
	byte STREAM_GLOBAL_ID = 36;
	
	int getOffsetX();
	
	int getOffsetY();
	
	int getWidth();
	
	int getHeight();
	
	int getSize();
	
	long getAddress();
	
	byte getUseEast();
	
	byte getUseSouth();
	
	byte getMark();
	
	boolean hasColorPalettes();
	
	BufferedImage bufferedImage();

}
