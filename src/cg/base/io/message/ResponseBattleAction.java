package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.BattleProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;
import cg.base.io.proto.VOProtos.*;
import com.google.common.collect.Lists;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseBattleAction extends ProtoMessage {

	private RESPONSE_BATTLE_ACTION.Builder builder;

	public ResponseBattleAction(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_BATTLE_ACTION_VALUE, status, sessionId, sender, datas);
		builder = RESPONSE_BATTLE_ACTION.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseBattleAction() {
		super();
		builder = RESPONSE_BATTLE_ACTION.newBuilder();
		messageId = MessageId.MI_RESPONSE_BATTLE_ACTION_VALUE;
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
		int ret = builder.getSourceId();
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
		String ret = builder.getTech();
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
		int ret = builder.getSkillId();
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
		int ret = builder.getSkillType();
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
		List<VO_ACTION_PROCESS> list = builder.getActionProcessesList();
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
		int ret = builder.getType();
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
		String ret = builder.getMessage();
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
		int ret = builder.getSkillLevel();
		return ret;
	}

	/**
	 * 
	 * @param	buffEffects
	 * 			<u>do not has any annotate.</u>
	 */
	public void setBuffEffects(Iterable<VoBuffeffectinfo> buffEffects) {
		List<VO_BuffEffectInfo> list = Lists.newLinkedList();
		for (VoBuffeffectinfo vo : buffEffects) {
			list.add(vo.getVO_BuffEffectInfo());
		}
		builder.addAllBuffEffects(list);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VoBuffeffectinfo> getBuffEffectsList() {
		List<VO_BuffEffectInfo> list = builder.getBuffEffectsList();
		List<VoBuffeffectinfo> ret = Lists.newArrayListWithCapacity(list.size());
		for (VO_BuffEffectInfo vo : list) {
			ret.add(new VoBuffeffectinfo(vo));
		}
		return ret;
	}

	public RESPONSE_BATTLE_ACTION getResponseBattleAction() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
