package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoMapCell {

	private VO_MAP_CELL vo;

	private VO_MAP_CELL.Builder builder;

	public VoMapCell(VO_MAP_CELL vo) {
		this.vo = vo;
	}

	public VoMapCell() {
		builder = VO_MAP_CELL.newBuilder();
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
		int ret = vo.getEast();
		return ret;
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
		int ret = vo.getSouth();
		return ret;
	}

	/**
	 * 
	 * @param	objectId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setObjectId(Integer objectId) {
		builder.setObjectId(objectId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getObjectId() {
		int ret = vo.getObjectId();
		return ret;
	}

	/**
	 * 
	 * @param	mark
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMark(Integer mark) {
		builder.setMark(mark);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getMark() {
		int ret = vo.getMark();
		return ret;
	}

	/**
	 * 
	 * @param	imageGlobalId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setImageGlobalId(Integer imageGlobalId) {
		builder.setImageGlobalId(imageGlobalId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getImageGlobalId() {
		int ret = vo.getImageGlobalId();
		return ret;
	}

	public VO_MAP_CELL getVO_MAP_CELL() {
		return vo == null ? builder.build() : vo;
	}

}
