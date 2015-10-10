package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoAttribute {

	private VO_ATTRIBUTE vo;

	private VO_ATTRIBUTE.Builder builder;

	public VoAttribute(VO_ATTRIBUTE vo) {
		this.vo = vo;
	}

	public VoAttribute() {
		builder = VO_ATTRIBUTE.newBuilder();
	}

	/**
	 * 
	 * @param	type
	 * 			<u>do not has any annotate.</u>
	 */
	public void setType(Integer type) {
		builder.setType(type);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getType() {
		int ret = vo.getType();		return ret;
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
		int ret = vo.getValue();		return ret;
	}

	public VO_ATTRIBUTE getVO_ATTRIBUTE() {
		return vo == null ? builder.build() : vo;
	}

}
