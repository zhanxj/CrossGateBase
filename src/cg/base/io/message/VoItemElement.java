package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoItemElement {

	private VO_ITEM_ELEMENT vo;

	private VO_ITEM_ELEMENT.Builder builder;

	public VoItemElement(VO_ITEM_ELEMENT vo) {
		this.vo = vo;
	}

	public VoItemElement() {
		builder = VO_ITEM_ELEMENT.newBuilder();
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
		int ret = vo.getType();
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

	public VO_ITEM_ELEMENT getVO_ITEM_ELEMENT() {
		return vo == null ? builder.build() : vo;
	}

}
