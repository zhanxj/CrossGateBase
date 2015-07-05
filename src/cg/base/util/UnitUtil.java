package cg.base.util;

import static cg.base.sprite.Unit.DIR_AMOUNT;
import static cg.base.sprite.Unit.DIR_EAST;
import static cg.base.sprite.Unit.DIR_NORTH;
import static cg.base.sprite.Unit.DIR_NORTH_EAST;
import static cg.base.sprite.Unit.DIR_NORTH_WEST;
import static cg.base.sprite.Unit.DIR_SOUTH;
import static cg.base.sprite.Unit.DIR_SOUTH_EAST;
import static cg.base.sprite.Unit.DIR_SOUTH_WEST;
import static cg.base.sprite.Unit.DIR_WEST;

public class UnitUtil {
	
	public static final byte SOUTH = 1, EAST = 0;
	
	public static final byte[][] DIR = new byte[][]{
		{0, -1, 0, -2}, // north
		{1, -1}, // north east
		{1, 0, 2, 0}, // east
		{1, 1}, // south east
		{0, 1, 0, 2}, // south
		{-1, 1}, // south west
		{-1, 0, -2, 0}, // west
		{-1, -1} // north west
	};
	
	public static byte calcDir(int sourceEast, int sourceSouth, int targetEast, int targetSouth) {
		if (sourceSouth == targetSouth) {
			return sourceEast > targetEast ? DIR_WEST : DIR_EAST;
		} else if (sourceSouth > targetSouth) {
			return sourceEast == targetEast ? DIR_NORTH : sourceEast > targetEast ? DIR_NORTH_WEST : DIR_NORTH_EAST;
		} else {
			return sourceEast == targetEast ? DIR_SOUTH : sourceEast > targetEast ? DIR_SOUTH_WEST : DIR_SOUTH_EAST;
		}
	}
	
	public static byte calcDir(int angle) {
		if (angle >= 202 && angle < 247) { // 225 = NORTH
			return DIR_NORTH;
		} else if (angle >= 247 && angle < 292) { // 270 = DIR_NORTH_EAST
			return DIR_NORTH_EAST;
		} else if (angle >= 292 && angle < 337) { // 315 = DIR_EAST
			return DIR_EAST;
		} else if (angle >= 337 && angle <= 360 || angle >= 0 && angle < 22) { // 0, 360 = DIR_SOUTH_EAST
			return DIR_SOUTH_EAST;
		} else if (angle >= 22 && angle < 67) { // 45 = DIR_SOUTH
			return DIR_SOUTH;
		} else if (angle >= 67 && angle < 112) { // 90 = DIR_SOUTH_WEST
			return DIR_SOUTH_WEST;
		} else if (angle >= 112 && angle < 157) { // 135 = DIR_WEST
			return DIR_WEST;
		} else { // 180 = DIR_NORTH_WEST
			return DIR_NORTH_WEST;
		}
	}
	
	public static byte getOppositeDir(byte dir) {
		return (byte) ((dir + (DIR_AMOUNT >> 1)) % DIR_AMOUNT);
	}
	
	public static int makeAnimationActionId(byte dir, byte actionId) {
		return dir << 16 | actionId;
	}
	
}
