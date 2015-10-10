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
		return vo.getName();
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
		return vo.getState();
	}

	public VO_OPTION getVO_OPTION() {
		return vo == null ? builder.build() : vo;
	}

}
