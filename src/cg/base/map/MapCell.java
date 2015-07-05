package cg.base.map;

public interface MapCell {
	
	byte MARK_WARP = -2;
	
	byte MARK_NULL = -1;
	
	byte MARK_OBSTACLE = 0;
	
	byte MARK_NOMARL = 1;
	
	int getEast();
	
	int getSouth();
	
	int getImageGlobalId();
	
	int getObjectId();
	
	byte getMark();

}
