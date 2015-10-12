package cg.base.io.message;

import cg.base.io.proto.PlayerProtos.*;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoPlayerAnimation {

	private VO_PLAYER_ANIMATION vo;

	private VO_PLAYER_ANIMATION.Builder builder;

	public VoPlayerAnimation(VO_PLAYER_ANIMATION vo) {
		this.vo = vo;
	}

	public VoPlayerAnimation() {
		builder = VO_PLAYER_ANIMATION.newBuilder();
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
	 * @param	globalId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setGlobalId(Iterable<Integer> globalId) {
		builder.addAllGlobalId(globalId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<Integer> getGlobalIdList() {
		return vo.getGlobalIdList();
	}

	/**
	 * 
	 * @param	headGlobalId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setHeadGlobalId(Integer headGlobalId) {
		builder.setHeadGlobalId(headGlobalId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getHeadGlobalId() {
		int ret = vo.getHeadGlobalId();
		return ret;
	}

	public VO_PLAYER_ANIMATION getVO_PLAYER_ANIMATION() {
		return vo == null ? builder.build() : vo;
	}

}
