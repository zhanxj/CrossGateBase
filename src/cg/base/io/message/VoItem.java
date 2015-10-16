package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoItem {

	private VO_ITEM vo;

	private VO_ITEM.Builder builder;

	public VoItem(VO_ITEM vo) {
		this.vo = vo;
	}

	public VoItem() {
		builder = VO_ITEM.newBuilder();
	}

	/**
	 * 
	 * @param	iconId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setIconId(Integer iconId) {
		builder.setIconId(iconId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getIconId() {
		int ret = vo.getIconId();
		return ret;
	}

	/**
	 * 
	 * @param	dropDispear
	 * 			<u>do not has any annotate.</u>
	 */
	public void setDropDispear(Boolean dropDispear) {
		builder.setDropDispear(dropDispear);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Boolean getDropDispear() {
		Boolean ret = vo.getDropDispear();
		return ret;
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
	 * @param	groupSize
	 * 			<u>do not has any annotate.</u>
	 */
	public void setGroupSize(Integer groupSize) {
		builder.setGroupSize(groupSize);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getGroupSize() {
		int ret = vo.getGroupSize();
		return ret;
	}

	/**
	 * 
	 * @param	templateId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setTemplateId(Integer templateId) {
		builder.setTemplateId(templateId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getTemplateId() {
		int ret = vo.getTemplateId();
		return ret;
	}

	/**
	 * 
	 * @param	logoutDispear
	 * 			<u>do not has any annotate.</u>
	 */
	public void setLogoutDispear(Boolean logoutDispear) {
		builder.setLogoutDispear(logoutDispear);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Boolean getLogoutDispear() {
		Boolean ret = vo.getLogoutDispear();
		return ret;
	}

	/**
	 * 
	 * @param	identifyInfo
	 * 			<u>do not has any annotate.</u>
	 */
	public void setIdentifyInfo(VoItemIdentify identifyInfo) {
		builder.setIdentifyInfo(identifyInfo.getVO_ITEM_IDENTIFY());
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VoItemIdentify getIdentifyInfo() {
		VoItemIdentify ret = null;
		VO_ITEM_IDENTIFY vo = this.vo.getIdentifyInfo();
		ret = vo == null ? null : new VoItemIdentify(vo);
		return ret;
	}

	public VO_ITEM getVO_ITEM() {
		return vo == null ? builder.build() : vo;
	}

}
