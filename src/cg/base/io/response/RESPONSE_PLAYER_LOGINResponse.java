package cg.base.io.response;

import net.io.protocal.proto.ProtoResponse;
import cg.base.io.proto.PlayerProtos.*;
import com.google.protobuf.InvalidProtocolBufferException;

import cg.base.io.proto.VOProtos.*;
/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RESPONSE_PLAYER_LOGINResponse extends ProtoResponse {

	private RESPONSE_PLAYER_LOGIN.Builder builder = RESPONSE_PLAYER_LOGIN.newBuilder();

	public RESPONSE_PLAYER_LOGIN getRESPONSE_PLAYER_LOGIN() {
		return builder.build();
	}

	/**
	 * 
	 * @param	baseInfo
	 * 			<u>do not has any annotate.</u>
	 */
	public void setBaseInfo(VO_UNIT_BASE_INFO baseInfo) {
		builder.setBaseInfo(baseInfo);
	}

	/**
	 * 
	 * @param	skillSet
	 * 			<u>do not has any annotate.</u>
	 */
	public void setSkillSet(VO_SKILL_SET skillSet) {
		builder.setSkillSet(skillSet);
	}

	/**
	 * 
	 * @param	bags
	 * 			<u>do not has any annotate.</u>
	 */
	public void setBags(Iterable<VO_BAG> bags) {
		builder.addAllBags(bags);
	}

	/**
	 * 
	 * @param	titles
	 * 			<u>do not has any annotate.</u>
	 */
	public void setTitles(Iterable<VO_TITLE> titles) {
		builder.addAllTitles(titles);
	}

	/**
	 * 
	 * @param	extendInfo
	 * 			<u>do not has any annotate.</u>
	 */
	public void setExtendInfo(VO_UNIT_EXTEND_INFO extendInfo) {
		builder.setExtendInfo(extendInfo);
	}

	/**
	 * 
	 * @param	headTitle
	 * 			<u>do not has any annotate.</u>
	 */
	public void setHeadTitle(VO_TITLES headTitle) {
		builder.setHeadTitle(headTitle);
	}

	/**
	 * 
	 * @param	money
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMoney(Iterable<Integer> money) {
		builder.addAllMoney(money);
	}

	/**
	 * 
	 * @param	elements
	 * 			<u>do not has any annotate.</u>
	 */
	public void setElements(Iterable<Integer> elements) {
		builder.addAllElements(elements);
	}

	/**
	 * 
	 * @param	options
	 * 			<u>do not has any annotate.</u>
	 */
	public void setOptions(Iterable<VO_OPTION> options) {
		builder.addAllOptions(options);
	}

	/**
	 * 
	 * @param	attributes
	 * 			<u>do not has any annotate.</u>
	 */
	public void setAttributes(Iterable<VO_ATTRIBUTES> attributes) {
		builder.addAllAttributes(attributes);
	}

	/**
	 * 
	 * @param	position
	 * 			<u>do not has any annotate.</u>
	 */
	public void setPosition(VO_POSITION position) {
		builder.setPosition(position);
	}

	/**
	 * 
	 * @param	battleLocal
	 * 			<u>do not has any annotate.</u>
	 */
	public void setBattleLocal(Boolean battleLocal) {
		builder.setBattleLocal(battleLocal);
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
	 * @param	battleScore
	 * 			<u>do not has any annotate.</u>
	 */
	public void setBattleScore(Integer battleScore) {
		builder.setBattleScore(battleScore);
	}

	@Override
	public void mergeFrom(byte[] data) throws InvalidProtocolBufferException {
		builder.mergeFrom(data);
	}

	@Override
	public void setError(int errorCode, String errorMsg) {
	}

	@Override
	public boolean hasError() {
		return false;
	}

}
