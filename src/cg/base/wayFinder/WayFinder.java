package cg.base.wayFinder;

import java.util.List;

import cg.base.map.MapCell;
import cg.base.map.MapCellContainer;

public interface WayFinder {
	
	void setMapCellContainer(MapCellContainer mapCellContainer);
	
	List<MapCell> find(int sourceEast, int sourceSouth, int targetEast, int targetSouth);

}
