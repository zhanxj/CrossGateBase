package cg.base.wayFinder;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Lists;

import cg.base.map.MapCell;
import cg.base.map.MapCellContainer;

abstract class CWayFinder implements WayFinder {
	
	protected static final Logger log = LoggerFactory.getLogger(CWayFinder.class);
	
	protected MapCellContainer map;
	
	protected List<MapCell> createWayList() {
		return Lists.newLinkedList();
	}

	@Override
	public List<MapCell> find(int sourceEast, int sourceSouth, int targetEast, int targetSouth) {
		List<MapCell> way = createWayList();
		find0(sourceEast, sourceSouth, targetEast, targetSouth, way);
//		printWay(sourceEast, sourceSouth, targetEast, targetSouth, way);
		return way;
	}

	protected abstract void find0(int sourceEast, int sourceSouth, int targetEast, int targetSouth, List<MapCell> way);
	
	protected static MapCell checkBeveled(MapCell southMapCell, MapCell eastMapCell, MapCell beveledMapCell) {
		return canGo(southMapCell) ? (canGo(eastMapCell) ? (canGo(beveledMapCell) ? beveledMapCell : eastMapCell) : southMapCell) : eastMapCell;
	}
	
	protected static boolean canGo(MapCell mapCell) {
		return mapCell != null && mapCell.getMark() != MapCell.MARK_OBSTACLE;
	}
	
	protected void printWay(int sourceEast, int sourceSouth, int targetEast, int targetSouth, List<MapCell> way) {
		log.info("Way source({}, {}) - target({}, {})", sourceEast, sourceSouth, targetEast, targetSouth);
		for (MapCell point : way) {
			log.info("Way point({}, {})", point.getEast(), point.getSouth());
		}
	}

	@Override
	public void setMapCellContainer(MapCellContainer mapCellContainer) {
		map = mapCellContainer;
	}

}
