package cg.base.io.message;

import cg.base.io.proto.AccountProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoServer {

	private VO_SERVER vo;

	private VO_SERVER.Builder builder;

	public VoServer(VO_SERVER vo) {
		this.vo = vo;
	}

	public VoServer() {
		builder = VO_SERVER.newBuilder();
	}

	/**
	 * 
	 * @param	connectTime
	 * 			<u>do not has any annotate.</u>
	 */
	public void setConnectTime(Integer connectTime) {
		builder.setConnectTime(connectTime);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getConnectTime() {
		int ret = vo.getConnectTime();		return ret;
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
		String ret = vo.getName();		return ret;
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
		int ret = vo.getId();		return ret;
	}

	public VO_SERVER getVO_SERVER() {
		return vo == null ? builder.build() : vo;
	}

}
