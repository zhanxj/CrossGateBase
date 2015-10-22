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
		if (injured != null) {
			builder.setInjured(injured);
		}
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getInjured() {
		return vo.getInjured();
	}

	/**
	 * 
	 * @param	isFly
	 * 			<u>do not has any annotate.</u>
	 */
	public void setIsFly(Boolean isFly) {
		if (isFly != null) {
			builder.setIsFly(isFly);
		}
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Boolean getIsFly() {
		return vo.getIsFly();
	}

	/**
	 * 
	 * @param	soul
	 * 			<u>do not has any annotate.</u>
	 */
	public void setSoul(Integer soul) {
		if (soul != null) {
			builder.setSoul(soul);
		}
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getSoul() {
		return vo.getSoul();
	}

	/**
	 * 
	 * @param	isSource
	 * 			<u>do not has any annotate.</u>
	 */
	public void setIsSource(Boolean isSource) {
		if (isSource != null) {
			builder.setIsSource(isSource);
		}
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Boolean getIsSource() {
		return vo.getIsSource();
	}

	/**
	 * 
	 * @param	isDisappear
	 * 			<u>do not has any annotate.</u>
	 */
	public void setIsDisappear(Boolean isDisappear) {
		if (isDisappear != null) {
			builder.setIsDisappear(isDisappear);
		}
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Boolean getIsDisappear() {
		return vo.getIsDisappear();
	}

	public VO_DIE_INFO getVO_DIE_INFO() {
		return vo == null ? builder.build() : vo;
	}

}
