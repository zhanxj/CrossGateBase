package cg.base.sprite;

import cg.base.util.Values;

public interface Unit extends UnitListenerCode {
	
	byte UNI_TYPE_BASE = 0;
	
	byte NO_TEMPORARY_ID = -1;
	
	byte DIR_NORTH = 0;
	
	byte DIR_NORTH_EAST = 1;
	
	byte DIR_EAST = 2;
	
	byte DIR_SOUTH_EAST = 3;
	
	byte DIR_SOUTH = 4;
	
	byte DIR_SOUTH_WEST = 5;
	
	byte DIR_WEST = 6;
	
	byte DIR_NORTH_WEST = 7;
	
	byte DIR_AMOUNT = 8;
	
	byte ELEMENT_EARTH = 0;
	
	byte ELEMENT_WATER = 1;
	
	byte ELEMENT_FIRE = 2;
	
	byte ELEMENT_WIND = 3;
	
	byte ELEMENT_MAX = 10;
	
	byte SEX_NONE = -1;
	
	byte SEX_MALE = 0;
	
	byte SEX_FEMALE = 1;
	
	int getInstanceId();
	
	void setInstanceId(int instanceId);
	
	byte getDir();
	
	void setDir(byte dir);
	
	int getEast();
	
	int getSouth();
	
	void move(int east, int south);
	
	String getName();
	
	void setName(String name);
	
	int getFaceModel();
	
	void setFaceModel(int faceModel);
	
	int getTempFaceModel();
	
	void setTempFaceModel(int tempFaceModel);
	
	void addUnitListener(UnitListener listener);
	
	void removeUnitListener(UnitListener listener);
	
	byte getUnitType();
	
	Values getValues();
	
	byte getSex();

}
