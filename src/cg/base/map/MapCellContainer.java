package cg.base.map;

public interface MapCellContainer {
	
	byte CELL_WIDTH = 64;
	
	byte CELL_HEIGHT = 48;
	
	byte CELL_HALF_WIDTH = CELL_WIDTH >> 1;
	
	byte CELL_HALF_HEIGHT = CELL_HEIGHT >> 1;
	
	MapCell getMapCell(int east, int south);

}
