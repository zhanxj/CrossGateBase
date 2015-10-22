package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoUnitExtendInfo {

	private VO_UNIT_EXTEND_INFO vo;

	private VO_UNIT_EXTEND_INFO.Builder builder;

	public VoUnitExtendInfo(VO_UNIT_EXTEND_INFO vo) {
		this.vo = vo;
	}

	public VoUnitExtendInfo() {
		builder = VO_UNIT_EXTEND_INFO.newBuilder();
	}

	/**
	 * 
	 * @param	race
	 * 			<u>do not has any annotate.</u>
	 */
	public void setRace(Integer race) {
		if (race != null) {
			builder.setRace(race);
		}
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getRace() {
		return vo.getRace();
	}

	/**
	 * 
	 * @param	level
	 * 			<u>do not has any annotate.</u>
	 */
	public void setLevel(Integer level) {
		builder.setLevel(level);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getLevel() {
		return vo.getLevel();
	}

	/**
	 * 
	 * @param	exp
	 * 			<u>do not has any annotate.</u>
	 */
	public void setExp(Integer exp) {
		if (exp != null) {
			builder.setExp(exp);
		}
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getExp() {
		return vo.getExp();
	}

	public VO_UNIT_EXTEND_INFO getVO_UNIT_EXTEND_INFO() {
		return vo == null ? builder.build() : vo;
	}

}
