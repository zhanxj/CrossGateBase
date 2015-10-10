package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoMaterialInfo {

	private VO_MATERIAL_INFO vo;

	private VO_MATERIAL_INFO.Builder builder;

	public VoMaterialInfo(VO_MATERIAL_INFO vo) {
		this.vo = vo;
	}

	public VoMaterialInfo() {
		builder = VO_MATERIAL_INFO.newBuilder();
	}

	/**
	 * 
	 * @param	itemId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setItemId(Integer itemId) {
		builder.setItemId(itemId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getItemId() {
		int ret = vo.getItemId();		return ret;
	}

	/**
	 * 
	 * @param	identifyName
	 * 			<u>do not has any annotate.</u>
	 */
	public void setIdentifyName(String identifyName) {
		builder.setIdentifyName(identifyName);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getIdentifyName() {
		String ret = vo.getIdentifyName();		return ret;
	}

	/**
	 * 
	 * @param	needAmount
	 * 			<u>do not has any annotate.</u>
	 */
	public void setNeedAmount(Integer needAmount) {
		builder.setNeedAmount(needAmount);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getNeedAmount() {
		int ret = vo.getNeedAmount();		return ret;
	}

	public VO_MATERIAL_INFO getVO_MATERIAL_INFO() {
		return vo == null ? builder.build() : vo;
	}

}
