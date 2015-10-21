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
		builder.setTech(tech);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getTech() {
		String ret = vo.getTech();
		return ret;
	}

	/**
	 * 
	 * @param	dieInfo
	 * 			<u>do not has any annotate.</u>
	 */
	public void setDieInfo(VoDieInfo dieInfo) {
		builder.setDieInfo(dieInfo.getVO_DIE_INFO());
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VoDieInfo getDieInfo() {
		VoDieInfo ret = null;
		VO_DIE_INFO vo = this.vo.getDieInfo();
		ret = vo == null ? null : new VoDieInfo(vo);
		return ret;
	}

	/**
	 * 
	 * @param	effectValue
	 * 			<u>do not has any annotate.</u>
	 */
	public void setEffectValue(VoEffectValue effectValue) {
		builder.setEffectValue(effectValue.getVO_EFFECT_VALUE());
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VoEffectValue getEffectValue() {
		VoEffectValue ret = null;
		VO_EFFECT_VALUE vo = this.vo.getEffectValue();
		ret = vo == null ? null : new VoEffectValue(vo);
		return ret;
	}

	public VO_ACTION_RESULT getVO_ACTION_RESULT() {
		return vo == null ? builder.build() : vo;
	}

}
