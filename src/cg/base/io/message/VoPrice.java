package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoPrice {

	private VO_PRICE vo;

	private VO_PRICE.Builder builder;

	public VoPrice(VO_PRICE vo) {
		this.vo = vo;
	}

	public VoPrice() {
		builder = VO_PRICE.newBuilder();
	}

	/**
	 * 
	 * @param	id
	 * 			<u>do not has any annotate.</u>
	 */
	public void setId(Integer id) {
		builder.setId(id);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getId() {
		int ret = vo.getId();
		return ret;
	}

	/**
	 * 
	 * @param	type
	 * 			<u>do not has any annotate.</u>
	 */
	public void setType(String type) {
		builder.setType(type);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getType() {
		String ret = vo.getType();
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

	public VO_PRICE getVO_PRICE() {
		return vo == null ? builder.build() : vo;
	}

}
