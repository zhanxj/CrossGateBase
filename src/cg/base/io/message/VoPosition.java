package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoPosition {

	private VO_POSITION vo;

	private VO_POSITION.Builder builder;

	public VoPosition(VO_POSITION vo) {
		this.vo = vo;
	}

	public VoPosition() {
		builder = VO_POSITION.newBuilder();
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
	 * @param	dir
	 * 			<u>do not has any annotate.</u>
	 */
	public void setDir(Integer dir) {
		builder.setDir(dir);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getDir() {
		int ret = vo.getDir();
		return ret;
	}

	public VO_POSITION getVO_POSITION() {
		return vo == null ? builder.build() : vo;
	}

}
