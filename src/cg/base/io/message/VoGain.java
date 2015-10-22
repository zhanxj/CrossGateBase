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
		if (itemName != null) {
			builder.setItemName(itemName);
		}
	}

	/**
	 * 
	 * @return	奖励物品名称
	 */
	public String getItemName() {
		return vo.getItemName();
	}

	/**
	 * 
	 * @param	value
	 * 			奖励数值
	 */
	public void setValue(Integer value) {
		if (value != null) {
			builder.setValue(value);
		}
	}

	/**
	 * 
	 * @return	奖励数值
	 */
	public int getValue() {
		return vo.getValue();
	}

	/**
	 * 
	 * @param	itemIconId
	 * 			奖励物品的图标id
	 */
	public void setItemIconId(Integer itemIconId) {
		if (itemIconId != null) {
			builder.setItemIconId(itemIconId);
		}
	}

	/**
	 * 
	 * @return	奖励物品的图标id
	 */
	public int getItemIconId() {
		return vo.getItemIconId();
	}

	/**
	 * 
	 * @param	itemCount
	 * 			奖励物品数量
	 */
	public void setItemCount(Integer itemCount) {
		if (itemCount != null) {
			builder.setItemCount(itemCount);
		}
	}

	/**
	 * 
	 * @return	奖励物品数量
	 */
	public int getItemCount() {
		return vo.getItemCount();
	}

	public VO_GAIN getVO_GAIN() {
		return vo == null ? builder.build() : vo;
	}

}
