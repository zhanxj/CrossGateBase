package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoAttachment {

	private VO_ATTACHMENT vo;

	private VO_ATTACHMENT.Builder builder;

	public VoAttachment(VO_ATTACHMENT vo) {
		this.vo = vo;
	}

	public VoAttachment() {
		builder = VO_ATTACHMENT.newBuilder();
	}

	/**
	 * 
	 * @param	item
	 * 			奖励物品
	 */
	public void setItem(VoItem item) {
		if (item != null) {
			builder.setItem(item.getVO_ITEM());
		}
	}

	/**
	 * 
	 * @return	奖励物品
	 */
	public VoItem getItem() {
		return vo.hasItem() ? new VoItem(vo.getItem()) : null;
	}

	/**
	 * 
	 * @param	type
	 * 			奖励类型
	 */
	public void setType(Integer type) {
		if (type != null) {
			builder.setType(type);
		}
	}

	/**
	 * 
	 * @return	奖励类型
	 */
	public int getType() {
		return vo.getType();
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

	public VO_ATTACHMENT getVO_ATTACHMENT() {
		return vo == null ? builder.build() : vo;
	}

}
