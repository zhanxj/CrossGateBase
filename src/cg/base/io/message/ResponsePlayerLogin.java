package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.PlayerProtos.*;
import cg.base.io.proto.VOProtos.*;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponsePlayerLogin extends ProtoMessage {

	private RESPONSE_PLAYER_LOGIN.Builder builder;

	public ResponsePlayerLogin(int messageId, int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(messageId, status, sessionId, sender, datas);
		if (datas != null) {
			builder.mergeFrom(datas);
		}
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
	 * @return	<u>do not has any annotate.</u>
	 */
	public VO_UNIT_BASE_INFO getBaseInfo() {
		return builder.getBaseInfo();
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
	 * @return	<u>do not has any annotate.</u>
	 */
	public VO_SKILL_SET getSkillSet() {
		return builder.getSkillSet();
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
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VO_BAG> getBagsList() {
		return builder.getBagsList();
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
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VO_TITLE> getTitlesList() {
		return builder.getTitlesList();
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
	 * @return	<u>do not has any annotate.</u>
	 */
	public VO_UNIT_EXTEND_INFO getExtendInfo() {
		return builder.getExtendInfo();
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
	 * @return	<u>do not has any annotate.</u>
	 */
	public VO_TITLES getHeadTitle() {
		return builder.getHeadTitle();
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
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<Integer> getMoneyList() {
		return builder.getMoneyList();
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
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<Integer> getElementsList() {
		return builder.getElementsList();
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
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VO_OPTION> getOptionsList() {
		return builder.getOptionsList();
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
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VO_ATTRIBUTES> getAttributesList() {
		return builder.getAttributesList();
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
	 * @return	<u>do not has any annotate.</u>
	 */
	public VO_POSITION getPosition() {
		return builder.getPosition();
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
	 * @return	<u>do not has any annotate.</u>
	 */
	public Boolean getBattleLocal() {
		return builder.getBattleLocal();
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
		return builder.getJob();
	}

	/**
	 * 
	 * @param	battleScore
	 * 			<u>do not has any annotate.</u>
	 */
	public void setBattleScore(Integer battleScore) {
		builder.setBattleScore(battleScore);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getBattleScore() {
		return builder.getBattleScore();
	}

	public RESPONSE_PLAYER_LOGIN getResponsePlayerLogin() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
