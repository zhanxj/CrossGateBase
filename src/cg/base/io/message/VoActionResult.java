package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoActionResult {

	private VO_ACTION_RESULT vo;

	private VO_ACTION_RESULT.Builder builder;

	public VoActionResult(VO_ACTION_RESULT vo) {
		this.vo = vo;
	}

	public VoActionResult() {
		builder = VO_ACTION_RESULT.newBuilder();
	}

	/**
	 * 
	 * @param	tech
	 * 			<u>do not has any annotate.</u>
	 */
	public void setTech(String tech) {
		if (tech != null) {
			builder.setTech(tech);
		}
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getTech() {
		return vo.getTech();
	}

	/**
	 * 
	 * @param	dieInfo
	 * 			<u>do not has any annotate.</u>
	 */
	public void setDieInfo(VoDieInfo dieInfo) {
		if (dieInfo != null) {
			builder.setDieInfo(dieInfo.getVO_DIE_INFO());
		}
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VoDieInfo getDieInfo() {
		return vo.hasDieInfo() ? new VoDieInfo(vo.getDieInfo()) : null;
	}

	/**
	 * 
	 * @param	effectValue
	 * 			<u>do not has any annotate.</u>
	 */
	public void setEffectValue(VoEffectValue effectValue) {
		if (effectValue != null) {
			builder.setEffectValue(effectValue.getVO_EFFECT_VALUE());
		}
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VoEffectValue getEffectValue() {
		return vo.hasEffectValue() ? new VoEffectValue(vo.getEffectValue()) : null;
	}

	public VO_ACTION_RESULT getVO_ACTION_RESULT() {
		return vo == null ? builder.build() : vo;
	}

}
