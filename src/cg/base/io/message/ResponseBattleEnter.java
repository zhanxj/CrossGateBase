package cg.base.io.message;

import net.io.ISender;
import net.message.ByteArrayMessage;
import cg.base.io.proto.BattleProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;
import com.google.common.collect.Lists;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseBattleEnter extends ByteArrayMessage {

	private RESPONSE_BATTLE_ENTER.Builder builder;

	public ResponseBattleEnter(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_BATTLE_ENTER_VALUE, status, sessionId, sender, datas);
		builder = RESPONSE_BATTLE_ENTER.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseBattleEnter() {
		super();
		builder = RESPONSE_BATTLE_ENTER.newBuilder();
		messageId = MessageId.MI_RESPONSE_BATTLE_ENTER_VALUE;
	}

	/**
	 * 
	 * @param	battleId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setBattleId(Integer battleId) {
		builder.setBattleId(battleId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getBattleId() {
		return builder.getBattleId();
	}

	/**
	 * 
	 * @param	teamA
	 * 			<u>do not has any annotate.</u>
	 */
	public void setTeamA(Iterable<VoUnitBattleInfo> teamA) {
		List<VO_UNIT_BATTLE_INFO> list = Lists.newLinkedList();
		for (VoUnitBattleInfo vo : teamA) {
			list.add(vo.getVO_UNIT_BATTLE_INFO());
		}
		builder.addAllTeamA(list);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VoUnitBattleInfo> getTeamAList() {
		List<VO_UNIT_BATTLE_INFO> list = builder.getTeamAList();
		List<VoUnitBattleInfo> ret = Lists.newArrayListWithCapacity(list.size());
		for (VO_UNIT_BATTLE_INFO vo : list) {
			ret.add(new VoUnitBattleInfo(vo));
		}
		return ret;
	}

	/**
	 * 
	 * @param	teamB
	 * 			<u>do not has any annotate.</u>
	 */
	public void setTeamB(Iterable<VoUnitBattleInfo> teamB) {
		List<VO_UNIT_BATTLE_INFO> list = Lists.newLinkedList();
		for (VoUnitBattleInfo vo : teamB) {
			list.add(vo.getVO_UNIT_BATTLE_INFO());
		}
		builder.addAllTeamB(list);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VoUnitBattleInfo> getTeamBList() {
		List<VO_UNIT_BATTLE_INFO> list = builder.getTeamBList();
		List<VoUnitBattleInfo> ret = Lists.newArrayListWithCapacity(list.size());
		for (VO_UNIT_BATTLE_INFO vo : list) {
			ret.add(new VoUnitBattleInfo(vo));
		}
		return ret;
	}

	public RESPONSE_BATTLE_ENTER getResponseBattleEnter() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
