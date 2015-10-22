package cg.base.io.message;

import cg.base.io.proto.BattleProtos.*;
import cg.base.io.proto.VOProtos.*;
import com.google.common.collect.Lists;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoBattleAction {

	private VO_BATTLE_ACTION vo;

	private VO_BATTLE_ACTION.Builder builder;

	public VoBattleAction(VO_BATTLE_ACTION vo) {
		this.vo = vo;
	}

	public VoBattleAction() {
		builder = VO_BATTLE_ACTION.newBuilder();
	}

	/**
	 * 
	 * @param	sourceId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setSourceId(Integer sourceId) {
		builder.setSourceId(sourceId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getSourceId() {
		int ret = vo.getSourceId();
		return ret;
	}

	/**
	 * 
	 * @param	tech
	 * 			<u>do not has any annotate.</u>
	 */
	public void setTech(String tech) {
		builder.setTech(tech);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getTech() {
		String ret = vo.getTech();
		return ret;
	}

	/**
	 * 
	 * @param	skillId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setSkillId(Integer skillId) {
		builder.setSkillId(skillId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getSkillId() {
		int ret = vo.getSkillId();
		return ret;
	}

	/**
	 * 
	 * @param	skillType
	 * 			<u>do not has any annotate.</u>
	 */
	public void setSkillType(Integer skillType) {
		builder.setSkillType(skillType);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getSkillType() {
		int ret = vo.getSkillType();
		return ret;
	}

	/**
	 * 
	 * @param	actionProcesses
	 * 			<u>do not has any annotate.</u>
	 */
	public void setActionProcesses(Iterable<VoActionProcess> actionProcesses) {
		List<VO_ACTION_PROCESS> list = Lists.newLinkedList();
		for (VoActionProcess vo : actionProcesses) {
			list.add(vo.getVO_ACTION_PROCESS());
		}
		builder.addAllActionProcesses(list);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VoActionProcess> getActionProcessesList() {
		List<VO_ACTION_PROCESS> list = vo.getActionProcessesList();
		List<VoActionProcess> ret = Lists.newArrayListWithCapacity(list.size());
		for (VO_ACTION_PROCESS vo : list) {
			ret.add(new VoActionProcess(vo));
		}
		return ret;
	}

	/**
	 * 
	 * @param	type
	 * 			<u>do not has any annotate.</u>
	 */
	public void setType(Integer type) {
		builder.setType(type);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getType() {
		int ret = vo.getType();
		return ret;
	}

	/**
	 * 
	 * @param	message
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMessage(String message) {
		builder.setMessage(message);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getMessage() {
		String ret = vo.getMessage();
		return ret;
	}

	/**
	 * 
	 * @param	skillLevel
	 * 			<u>do not has any annotate.</u>
	 */
	public void setSkillLevel(Integer skillLevel) {
		builder.setSkillLevel(skillLevel);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getSkillLevel() {
		int ret = vo.getSkillLevel();
		return ret;
	}

	/**
	 * 
	 * @param	buffEffects
	 * 			<u>do not has any annotate.</u>
	 */
	public void setBuffEffects(Iterable<VoBuffEffectInfo> buffEffects) {
		List<VO_BUFF_EFFECT_INFO> list = Lists.newLinkedList();
		for (VoBuffEffectInfo vo : buffEffects) {
			list.add(vo.getVO_BUFF_EFFECT_INFO());
		}
		builder.addAllBuffEffects(list);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VoBuffEffectInfo> getBuffEffectsList() {
		List<VO_BUFF_EFFECT_INFO> list = vo.getBuffEffectsList();
		List<VoBuffEffectInfo> ret = Lists.newArrayListWithCapacity(list.size());
		for (VO_BUFF_EFFECT_INFO vo : list) {
			ret.add(new VoBuffEffectInfo(vo));
		}
		return ret;
	}

	public VO_BATTLE_ACTION getVO_BATTLE_ACTION() {
		return vo == null ? builder.build() : vo;
	}

}
