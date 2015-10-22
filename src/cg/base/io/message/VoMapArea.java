package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoMapArea {

	private VO_MAP_AREA vo;

	private VO_MAP_AREA.Builder builder;

	public VoMapArea(VO_MAP_AREA vo) {
		this.vo = vo;
	}

	public VoMapArea() {
		builder = VO_MAP_AREA.newBuilder();
	}

	/**
	 * 
	 * @param	east
	 * 			<u>do not has any annotate.</u>
	 */
	public void setEast(Integer east) {
		builder.setEast(east);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getEast() {
		return vo.getEast();
	}

	/**
	 * 
	 * @param	south
	 * 			<u>do not has any annotate.</u>
	 */
	public void setSouth(Integer south) {
		builder.setSouth(south);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getSouth() {
		return vo.getSouth();
	}

	/**
	 * 
	 * @param	north
	 * 			<u>do not has any annotate.</u>
	 */
	public void setNorth(Integer north) {
		builder.setNorth(north);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getNorth() {
		return vo.getNorth();
	}

	/**
	 * 
	 * @param	west
	 * 			<u>do not has any annotate.</u>
	 */
	public void setWest(Integer west) {
		builder.setWest(west);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getWest() {
		return vo.getWest();
	}

	public VO_MAP_AREA getVO_MAP_AREA() {
		return vo == null ? builder.build() : vo;
	}

}
