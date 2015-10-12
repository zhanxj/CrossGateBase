package cg.base.io.message;

import cg.base.io.proto.PlayerProtos.*;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoPlayerAnimationInfo {

	private VO_PLAYER_ANIMATION_INFO vo;

	private VO_PLAYER_ANIMATION_INFO.Builder builder;

	public VoPlayerAnimationInfo(VO_PLAYER_ANIMATION_INFO vo) {
		this.vo = vo;
	}

	public VoPlayerAnimationInfo() {
		builder = VO_PLAYER_ANIMATION_INFO.newBuilder();
	}

	/**
	 * 
	 * @param	roleId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setRoleId(Integer roleId) {
		builder.setRoleId(roleId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getRoleId() {
		int ret = vo.getRoleId();
		return ret;
	}

	/**
	 * 
	 * @param	animationId2
	 * 			<u>do not has any annotate.</u>
	 */
	public void setAnimationId2(Iterable<Integer> animationId2) {
		builder.addAllAnimationId2(animationId2);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<Integer> getAnimationId2List() {
		return vo.getAnimationId2List();
	}

	/**
	 * 
	 * @param	headId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setHeadId(Integer headId) {
		builder.setHeadId(headId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getHeadId() {
		int ret = vo.getHeadId();
		return ret;
	}

	public VO_PLAYER_ANIMATION_INFO getVO_PLAYER_ANIMATION_INFO() {
		return vo == null ? builder.build() : vo;
	}

}
