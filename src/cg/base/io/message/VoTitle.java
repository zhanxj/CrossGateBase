package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoTitle {

	private VO_TITLE vo;

	private VO_TITLE.Builder builder;

	public VoTitle(VO_TITLE vo) {
		this.vo = vo;
	}

	public VoTitle() {
		builder = VO_TITLE.newBuilder();
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

	public VO_TITLE getVO_TITLE() {
		return vo == null ? builder.build() : vo;
	}

}
