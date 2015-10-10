package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.BattleProtos.*;
import com.google.common.collect.Lists;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseBattleEnter extends ProtoMessage {

	private RESPONSE_BATTLE_ENTER.Builder builder;

	public ResponseBattleEnter(int messageId, int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(messageId, status, sessionId, sender, datas);
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseBattleEnter() {
		super();
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