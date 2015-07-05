package cg.base.reader;

import cg.base.io.ResourceInfo;

public class CAnimationDictionary implements ResourceInfo {
	
	protected int globalId;
	
	protected int resourceId;
	
	protected byte version;
	
	public CAnimationDictionary(int globalId, int resourceId, byte version) {
		this();
		this.globalId = globalId;
		this.resourceId = resourceId;
		this.version = version;
	}
	
	protected CAnimationDictionary() {}

	@Override
	public byte getVersion() {
		return version;
	}

	@Override
	public String toString() {
		return getClass().getName() + " : animationId = " + globalId + " ; index = " + resourceId + " ; version = " + version;
	}

	@Override
	public int getResourceId() {
		return resourceId;
	}

	@Override
	public int getGlobalId() {
		return globalId;
	}

}
