package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoGain {

	private VO_GAIN vo;

	private VO_GAIN.Builder builder;

	public VoGain(VO_GAIN vo) {
		this.vo = vo;
	}

	public VoGain() {
		builder = VO_GAIN.newBuilder();
	}

	/**
	 * 
	 * @param	itemName
	 * 			奖励物品名称
	 */
	public void setItemName(String itemName) {
		builder.setItemName(itemName);
	}

	/**
	 * 
	 * @return	奖励物品名称
	 */
	public String getItemName() {
		String ret = vo.getItemName();
		return ret;
	}

	/**
	 * 
	 * @param	value
	 * 			奖励数值
	 */
	public void setValue(Integer value) {
		builder.setValue(value);
	}

	/**
	 * 
	 * @return	奖励数值
	 */
	public int getValue() {
		int ret = vo.getValue();
		return ret;
	}

	/**
	 * 
	 * @param	itemIconId
	 * 			奖励物品的图标id
	 */
	public void setItemIconId(Integer itemIconId) {
		builder.setItemIconId(itemIconId);
	}

	/**
	 * 
	 * @return	奖励物品的图标id
	 */
	public int getItemIconId() {
		int ret = vo.getItemIconId();
		return ret;
	}

	/**
	 * 
	 * @param	itemCount
	 * 			奖励物品数量
	 */
	public void setItemCount(Integer itemCount) {
		builder.setItemCount(itemCount);
	}

	/**
	 * 
	 * @return	奖励物品数量
	 */
	public int getItemCount() {
		int ret = vo.getItemCount();
		return ret;
	}

	public VO_GAIN getVO_GAIN() {
		return vo == null ? builder.build() : vo;
	}

}
