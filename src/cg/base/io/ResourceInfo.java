package cg.base.io;

public interface ResourceInfo {
	
	byte UNLIVE_VERSION = -1;
	
	int getResourceId();
	
	int getGlobalId();
	
	byte getVersion();

}
