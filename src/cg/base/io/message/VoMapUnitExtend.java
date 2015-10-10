package cg.base.io.message;

import cg.base.io.proto.MapProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoMapUnitExtend {

	private VO_MAP_UNIT_EXTEND vo;

	private VO_MAP_UNIT_EXTEND.Builder builder;

	public VoMapUnitExtend(VO_MAP_UNIT_EXTEND vo) {
		this.vo = vo;
	}

	public VoMapUnitExtend() {
		builder = VO_MAP_UNIT_EXTEND.newBuilder();
	}

	/**
	 * 
	 * @param	talkType
	 * 			npc
	 */
	public void setTalkType(String talkType) {
		builder.setTalkType(talkType);
	}

	/**
	 * 
	 * @return	npc
	 */
	public String getTalkType() {
		return vo.getTalkType();
	}

	/**
	 * 
	 * @param	state
	 * 			pet
	 */
	public void setState(Integer state) {
		builder.setState(state);
	}

	/**
	 * 
	 * @return	pet
	 */
	public int getState() {
		return vo.getState();
	}

	/**
	 * 
	 * @param	ownerInstanceId
	 * 			pet
	 */
	public void setOwnerInstanceId(Integer ownerInstanceId) {
		builder.setOwnerInstanceId(ownerInstanceId);
	}

	/**
	 * 
	 * @return	pet
	 */
	public int getOwnerInstanceId() {
		return vo.getOwnerInstanceId();
	}

	public VO_MAP_UNIT_EXTEND getVO_MAP_UNIT_EXTEND() {
		return vo == null ? builder.build() : vo;
	}

}
