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
	 * @param	key
	 * 			<u>do not has any annotate.</u>
	 */
	public void setKey(String key) {
		builder.setKey(key);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getKey() {
		String ret = vo.getKey();
		return ret;
	}

	/**
	 * 
	 * @param	url
	 * 			<u>do not has any annotate.</u>
	 */
	public void setUrl(String url) {
		builder.setUrl(url);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getUrl() {
		String ret = vo.getUrl();
		return ret;
	}

	public VO_SERVER getVO_SERVER() {
		return vo == null ? builder.build() : vo;
	}

}
