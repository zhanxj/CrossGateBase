package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;
import com.google.common.collect.Lists;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoUnit {

	private VO_UNIT vo;

	private VO_UNIT.Builder builder;

	public VoUnit(VO_UNIT vo) {
		this.vo = vo;
	}

	public VoUnit() {
		builder = VO_UNIT.newBuilder();
	}

	/**
	 * 
	 * @param	baseInfo
	 * 			基础信息
	 */
	public void setBaseInfo(VoUnitBaseInfo baseInfo) {
		builder.setBaseInfo(baseInfo.getVO_UNIT_BASE_INFO());
	}

	/**
	 * 
	 * @return	基础信息
	 */
	public VoUnitBaseInfo getBaseInfo() {
		VoUnitBaseInfo ret = new VoUnitBaseInfo(vo.getBaseInfo());
		return ret;
	}

	/**
	 * 
	 * @param	skillSet
	 * 			技能组[玩家自己及其宠物专有]
	 */
	public void setSkillSet(VoSkillSet skillSet) {
		builder.setSkillSet(skillSet.getVO_SKILL_SET());
	}

	/**
	 * 
	 * @return	技能组[玩家自己及其宠物专有]
	 */
	public VoSkillSet getSkillSet() {
		VoSkillSet ret = null;
		VO_SKILL_SET vo = builder.getSkillSet();
		ret = vo == null ? null : new VoSkillSet(vo);
		return ret;
	}

	/**
	 * 
	 * @param	bags
	 * 			背包组[玩家自己专有]
	 */
	public void setBags(Iterable<VoBag> bags) {
		List<VO_BAG> list = Lists.newLinkedList();
		for (VoBag vo : bags) {
			list.add(vo.getVO_BAG());
		}
		builder.addAllBags(list);
	}

	/**
	 * 
	 * @return	背包组[玩家自己专有]
	 */
	public List<VoBag> getBagsList() {
		List<VO_BAG> list = vo.getBagsList();
		List<VoBag> ret = Lists.newArrayListWithCapacity(list.size());
		for (VO_BAG vo : list) {
			ret.add(new VoBag(vo));
		}
		return ret;
	}

	/**
	 * 
	 * @param	loyal
	 * 			忠诚[玩家自己的宠物专有]
	 */
	public void setLoyal(Integer loyal) {
		builder.setLoyal(loyal);
	}

	/**
	 * 
	 * @return	忠诚[玩家自己的宠物专有]
	 */
	public int getLoyal() {
		int ret = vo.getLoyal();
		return ret;
	}

	/**
	 * 
	 * @param	petSet
	 * 			宠物组[玩家自己专有]
	 */
	public void setPetSet(VoPetSet petSet) {
		builder.setPetSet(petSet.getVO_PET_SET());
	}

	/**
	 * 
	 * @return	宠物组[玩家自己专有]
	 */
	public VoPetSet getPetSet() {
		VoPetSet ret = null;
		VO_PET_SET vo = builder.getPetSet();
		ret = vo == null ? null : new VoPetSet(vo);
		return ret;
	}

	/**
	 * 
	 * @param	index
	 * 			宠物在宠物栏的位置索引[宠物专有]
	 */
	public void setIndex(Integer index) {
		builder.setIndex(index);
	}

	/**
	 * 
	 * @return	宠物在宠物栏的位置索引[宠物专有]
	 */
	public int getIndex() {
		int ret = vo.getIndex();
		return ret;
	}

	/**
	 * 
	 * @param	titles
	 * 			称号组
	 */
	public void setTitles(Iterable<VoTitle> titles) {
		List<VO_TITLE> list = Lists.newLinkedList();
		for (VoTitle vo : titles) {
			list.add(vo.getVO_TITLE());
		}
		builder.addAllTitles(list);
	}

	/**
	 * 
	 * @return	称号组
	 */
	public List<VoTitle> getTitlesList() {
		List<VO_TITLE> list = vo.getTitlesList();
		List<VoTitle> ret = Lists.newArrayListWithCapacity(list.size());
		for (VO_TITLE vo : list) {
			ret.add(new VoTitle(vo));
		}
		return ret;
	}

	/**
	 * 
	 * @param	extendInfo
	 * 			扩展信息
	 */
	public void setExtendInfo(VoUnitExtendInfo extendInfo) {
		builder.setExtendInfo(extendInfo.getVO_UNIT_EXTEND_INFO());
	}

	/**
	 * 
	 * @return	扩展信息
	 */
	public VoUnitExtendInfo getExtendInfo() {
		VoUnitExtendInfo ret = null;
		VO_UNIT_EXTEND_INFO vo = builder.getExtendInfo();
		ret = vo == null ? null : new VoUnitExtendInfo(vo);
		return ret;
	}

	/**
	 * 
	 * @param	headTitle
	 * 			头顶信息
	 */
	public void setHeadTitle(VoTitles headTitle) {
		builder.setHeadTitle(headTitle.getVO_TITLES());
	}

	/**
	 * 
	 * @return	头顶信息
	 */
	public VoTitles getHeadTitle() {
		VoTitles ret = null;
		VO_TITLES vo = builder.getHeadTitle();
		ret = vo == null ? null : new VoTitles(vo);
		return ret;
	}

	/**
	 * 
	 * @param	ownerInstanceId
	 * 			主人实例id[宠物专有]
	 */
	public void setOwnerInstanceId(Integer ownerInstanceId) {
		builder.setOwnerInstanceId(ownerInstanceId);
	}

	/**
	 * 
	 * @return	主人实例id[宠物专有]
	 */
	public int getOwnerInstanceId() {
		int ret = vo.getOwnerInstanceId();
		return ret;
	}

	/**
	 * 
	 * @param	money
	 * 			游戏币[玩家自己专有]
	 */
	public void setMoney(Integer money) {
		builder.setMoney(money);
	}

	/**
	 * 
	 * @return	游戏币[玩家自己专有]
	 */
	public int getMoney() {
		int ret = vo.getMoney();
		return ret;
	}

	/**
	 * 
	 * @param	elements
	 * 			元素属性组
	 */
	public void setElements(Iterable<Integer> elements) {
		builder.addAllElements(elements);
	}

	/**
	 * 
	 * @return	元素属性组
	 */
	public List<Integer> getElementsList() {
		return vo.getElementsList();
	}

	/**
	 * 
	 * @param	options
	 * 			游戏选项组[玩家自己专有]
	 */
	public void setOptions(Iterable<VoOption> options) {
		List<VO_OPTION> list = Lists.newLinkedList();
		for (VoOption vo : options) {
			list.add(vo.getVO_OPTION());
		}
		builder.addAllOptions(list);
	}

	/**
	 * 
	 * @return	游戏选项组[玩家自己专有]
	 */
	public List<VoOption> getOptionsList() {
		List<VO_OPTION> list = vo.getOptionsList();
		List<VoOption> ret = Lists.newArrayListWithCapacity(list.size());
		for (VO_OPTION vo : list) {
			ret.add(new VoOption(vo));
		}
		return ret;
	}

	/**
	 * 
	 * @param	attributes
	 * 			属性组
	 */
	public void setAttributes(Iterable<VoAttributes> attributes) {
		List<VO_ATTRIBUTES> list = Lists.newLinkedList();
		for (VoAttributes vo : attributes) {
			list.add(vo.getVO_ATTRIBUTES());
		}
		builder.addAllAttributes(list);
	}

	/**
	 * 
	 * @return	属性组
	 */
	public List<VoAttributes> getAttributesList() {
		List<VO_ATTRIBUTES> list = vo.getAttributesList();
		List<VoAttributes> ret = Lists.newArrayListWithCapacity(list.size());
		for (VO_ATTRIBUTES vo : list) {
			ret.add(new VoAttributes(vo));
		}
		return ret;
	}

	/**
	 * 
	 * @param	talkType
	 * 			对话类型[NPC专有]
	 */
	public void setTalkType(String talkType) {
		builder.setTalkType(talkType);
	}

	/**
	 * 
	 * @return	对话类型[NPC专有]
	 */
	public String getTalkType() {
		String ret = vo.getTalkType();
		return ret;
	}

	/**
	 * 
	 * @param	position
	 * 			地图位置信息[地图场景专有]
	 */
	public void setPosition(VoPosition position) {
		builder.setPosition(position.getVO_POSITION());
	}

	/**
	 * 
	 * @return	地图位置信息[地图场景专有]
	 */
	public VoPosition getPosition() {
		VoPosition ret = null;
		VO_POSITION vo = builder.getPosition();
		ret = vo == null ? null : new VoPosition(vo);
		return ret;
	}

	/**
	 * 
	 * @param	battleLocal
	 * 			战斗时位置[玩家自己专有]
	 */
	public void setBattleLocal(Boolean battleLocal) {
		builder.setBattleLocal(battleLocal);
	}

	/**
	 * 
	 * @return	战斗时位置[玩家自己专有]
	 */
	public Boolean getBattleLocal() {
		Boolean ret = vo.getBattleLocal();
		return ret;
	}

	/**
	 * 
	 * @param	state
	 * 			状态[玩家自己的宠物专有]
	 */
	public void setState(Integer state) {
		builder.setState(state);
	}

	/**
	 * 
	 * @return	状态[玩家自己的宠物专有]
	 */
	public int getState() {
		int ret = vo.getState();
		return ret;
	}

	/**
	 * 
	 * @param	job
	 * 			职业[玩家自己专有]
	 */
	public void setJob(String job) {
		builder.setJob(job);
	}

	/**
	 * 
	 * @return	职业[玩家自己专有]
	 */
	public String getJob() {
		String ret = vo.getJob();
		return ret;
	}

	/**
	 * 
	 * @param	battleScore
	 * 			战绩[玩家角色专有]
	 */
	public void setBattleScore(Integer battleScore) {
		builder.setBattleScore(battleScore);
	}

	/**
	 * 
	 * @return	战绩[玩家角色专有]
	 */
	public int getBattleScore() {
		int ret = vo.getBattleScore();
		return ret;
	}

	public VO_UNIT getVO_UNIT() {
		return vo == null ? builder.build() : vo;
	}

}
