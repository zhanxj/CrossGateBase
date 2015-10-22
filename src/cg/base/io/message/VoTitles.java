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
		String ret = vo.getSignature();
		return ret;
	}

	/**
	 * 
	 * @param	guid
	 * 			<u>do not has any annotate.</u>
	 */
	public void setGuid(String guid) {
		if (guid != null) {
			builder.setGuid(guid);
		}
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getGuid() {
		String ret = vo.getGuid();
		return ret;
	}

	/**
	 * 
	 * @param	guidTitle
	 * 			<u>do not has any annotate.</u>
	 */
	public void setGuidTitle(String guidTitle) {
		if (guidTitle != null) {
			builder.setGuidTitle(guidTitle);
		}
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getGuidTitle() {
		String ret = vo.getGuidTitle();
		return ret;
	}

	/**
	 * 
	 * @param	title
	 * 			<u>do not has any annotate.</u>
	 */
	public void setTitle(String title) {
		if (title != null) {
			builder.setTitle(title);
		}
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getTitle() {
		String ret = vo.getTitle();
		return ret;
	}

	public VO_TITLES getVO_TITLES() {
		return vo == null ? builder.build() : vo;
	}

}
