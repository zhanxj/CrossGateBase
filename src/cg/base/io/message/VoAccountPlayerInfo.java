package cg.base.io.message;

import cg.base.io.proto.AccountProtos.*;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoAccountPlayerInfo {

	private VO_ACCOUNT_PLAYER_INFO vo;

	private VO_ACCOUNT_PLAYER_INFO.Builder builder;

	public VoAccountPlayerInfo(VO_ACCOUNT_PLAYER_INFO vo) {
		this.vo = vo;
	}

	public VoAccountPlayerInfo() {
		builder = VO_ACCOUNT_PLAYER_INFO.newBuilder();
	}

	/**
	 * 
	 * @param	roleVersion
	 * 			<u>do not has any annotate.</u>
	 */
	public void setRoleVersion(Integer roleVersion) {
		builder.setRoleVersion(roleVersion);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getRoleVersion() {
		return vo.getRoleVersion();
	}

	/**
	 * 
	 * @param	roleIndex
	 * 			<u>do not has any annotate.</u>
	 */
	public void setRoleIndex(Integer roleIndex) {
		builder.setRoleIndex(roleIndex);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getRoleIndex() {
		return vo.getRoleIndex();
	}

	/**
	 * 
	 * @param	instanceId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setInstanceId(Integer instanceId) {
		builder.setInstanceId(instanceId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getInstanceId() {
		return vo.getInstanceId();
	}

	/**
	 * 
	 * @param	headGloabId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setHeadGloabId(Iterable<Integer> headGloabId) {
		builder.addAllHeadGloabId(headGloabId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<Integer> getHeadGloabIdList() {
		return vo.getHeadGloabIdList();
	}

	/**
	 * 
	 * @param	level
	 * 			<u>do not has any annotate.</u>
	 */
	public void setLevel(Integer level) {
		builder.setLevel(level);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getLevel() {
		return vo.getLevel();
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
		return vo.getName();
	}

	/**
	 * 
	 * @param	loginTimes
	 * 			<u>do not has any annotate.</u>
	 */
	public void setLoginTimes(Integer loginTimes) {
		builder.setLoginTimes(loginTimes);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getLoginTimes() {
		return vo.getLoginTimes();
	}

	/**
	 * 
	 * @param	animationGloabId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setAnimationGloabId(Iterable<Integer> animationGloabId) {
		builder.addAllAnimationGloabId(animationGloabId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<Integer> getAnimationGloabIdList() {
		return vo.getAnimationGloabIdList();
	}

	/**
	 * 
	 * @param	headVersion
	 * 			<u>do not has any annotate.</u>
	 */
	public void setHeadVersion(Integer headVersion) {
		builder.setHeadVersion(headVersion);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getHeadVersion() {
		return vo.getHeadVersion();
	}

	/**
	 * 
	 * @param	job
	 * 			<u>do not has any annotate.</u>
	 */
	public void setJob(String job) {
		builder.setJob(job);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getJob() {
		return vo.getJob();
	}

	public VO_ACCOUNT_PLAYER_INFO getVO_ACCOUNT_PLAYER_INFO() {
		return vo == null ? builder.build() : vo;
	}

}
