package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoEffectValue {

	private VO_EFFECT_VALUE vo;

	private VO_EFFECT_VALUE.Builder builder;

	public VoEffectValue(VO_EFFECT_VALUE vo) {
		this.vo = vo;
	}

	public VoEffectValue() {
		builder = VO_EFFECT_VALUE.newBuilder();
	}

	/**
	 * 
	 * @param	isCritical
	 * 			<u>do not has any annotate.</u>
	 */
	public void setIsCritical(Boolean isCritical) {
		builder.setIsCritical(isCritical);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Boolean getIsCritical() {
		Boolean ret = vo.getIsCritical();
		return ret;
	}

	/**
	 * 
	 * @param	message
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMessage(String message) {
		builder.setMessage(message);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getMessage() {
		String ret = vo.getMessage();
		return ret;
	}

	/**
	 * 
	 * @param	value
	 * 			<u>do not has any annotate.</u>
	 */
	public void setValue(Integer value) {
		builder.setValue(value);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getValue() {
		int ret = vo.getValue();
		return ret;
	}

	/**
	 * 
	 * @param	effectType
	 * 			<u>do not has any annotate.</u>
	 */
	public void setEffectType(Integer effectType) {
		builder.setEffectType(effectType);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getEffectType() {
		int ret = vo.getEffectType();
		return ret;
	}

	public VO_EFFECT_VALUE getVO_EFFECT_VALUE() {
		return vo == null ? builder.build() : vo;
	}

}
