package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoOption {

	private VO_OPTION vo;

	private VO_OPTION.Builder builder;

	public VoOption(VO_OPTION vo) {
		this.vo = vo;
	}

	public VoOption() {
		builder = VO_OPTION.newBuilder();
	}

	/**
	 * 
	 * @param	name
	 * 			<u>do not has any annotate.</u>
	 */
	public void setName(String name) {
		builder.setName(name);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getName() {
		String ret = vo.getName();
		return ret;
	}

	/**
	 * 
	 * @param	state
	 * 			<u>do not has any annotate.</u>
	 */
	public void setState(Integer state) {
		builder.setState(state);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getState() {
		int ret = vo.getState();
		return ret;
	}

	/**
	 * 
	 * @param	value
	 * 			<u>do not has any annotate.</u>
	 */
	public void setValue(String value) {
		builder.setValue(value);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getValue() {
		String ret = vo.getValue();
		return ret;
	}

	public VO_OPTION getVO_OPTION() {
		return vo == null ? builder.build() : vo;
	}

}
