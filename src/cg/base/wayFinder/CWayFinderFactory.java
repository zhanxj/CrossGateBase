package cg.base.wayFinder;

public final class CWayFinderFactory {
	
	private static class SingletonHolder {
		public static CWayFinderFactory instance = new CWayFinderFactory();
	}
	
	public static CWayFinderFactory getInstance() {
		return SingletonHolder.instance;
	}
	
	private CWayFinderFactory() {}
	
	public WayFinder createSimpleWayFinder() {
		return new SimpleWayFinder();
	}

}
