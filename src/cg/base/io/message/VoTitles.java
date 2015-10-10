package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoTitles {

	private VO_TITLES vo;

	private VO_TITLES.Builder builder;

	public VoTitles(VO_TITLES vo) {
		this.vo = vo;
	}

	public VoTitles() {
		builder = VO_TITLES.newBuilder();
	}

	/**
	 * 
	 * @param	signature
	 * 			<u>do not has any annotate.</u>
	 */
	public void setSignature(String signature) {
		builder.setSignature(signature);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getSignature() {
		return vo.getSignature();
	}

	/**
	 * 
	 * @param	guid
	 * 			<u>do not has any annotate.</u>
	 */
	public void setGuid(String guid) {
		builder.setGuid(guid);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getGuid() {
		return vo.getGuid();
	}

	/**
	 * 
	 * @param	guidTitle
	 * 			<u>do not has any annotate.</u>
	 */
	public void setGuidTitle(String guidTitle) {
		builder.setGuidTitle(guidTitle);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getGuidTitle() {
		return vo.getGuidTitle();
	}

	/**
	 * 
	 * @param	title
	 * 			<u>do not has any annotate.</u>
	 */
	public void setTitle(String title) {
		builder.setTitle(title);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getTitle() {
		return vo.getTitle();
	}

	public VO_TITLES getVO_TITLES() {
		return vo == null ? builder.build() : vo;
	}

}
