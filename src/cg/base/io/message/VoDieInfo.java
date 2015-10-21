package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoDieInfo {

	private VO_DIE_INFO vo;

	private VO_DIE_INFO.Builder builder;

	public VoDieInfo(VO_DIE_INFO vo) {
		this.vo = vo;
	}

	public VoDieInfo() {
		builder = VO_DIE_INFO.newBuilder();
	}

	/**
	 * 
	 * @param	injured
	 * 			<u>do not has any annotate.</u>
	 */
	public void setInjured(Integer injured) {
		builder.setInjured(injured);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getInjured() {
		int ret = vo.getInjured();
		return ret;
	}

	/**
	 * 
	 * @param	isFly
	 * 			<u>do not has any annotate.</u>
	 */
	public void setIsFly(Boolean isFly) {
		builder.setIsFly(isFly);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Boolean getIsFly() {
		Boolean ret = vo.getIsFly();
		return ret;
	}

	/**
	 * 
	 * @param	soul
	 * 			<u>do not has any annotate.</u>
	 */
	public void setSoul(Integer soul) {
		builder.setSoul(soul);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getSoul() {
		int ret = vo.getSoul();
		return ret;
	}

	/**
	 * 
	 * @param	isSource
	 * 			<u>do not has any annotate.</u>
	 */
	public void setIsSource(Boolean isSource) {
		builder.setIsSource(isSource);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Boolean getIsSource() {
		Boolean ret = vo.getIsSource();
		return ret;
	}

	/**
	 * 
	 * @param	isDisappear
	 * 			<u>do not has any annotate.</u>
	 */
	public void setIsDisappear(Boolean isDisappear) {
		builder.setIsDisappear(isDisappear);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Boolean getIsDisappear() {
		Boolean ret = vo.getIsDisappear();
		return ret;
	}

	public VO_DIE_INFO getVO_DIE_INFO() {
		return vo == null ? builder.build() : vo;
	}

}
