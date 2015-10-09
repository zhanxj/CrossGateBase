package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.BattleProtos.*;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseBattleEnter extends ProtoMessage {

	private RESPONSE_BATTLE_ENTER.Builder builder;

	public ResponseBattleEnter(int messageId, int status, String sessionId, ISender sender, RESPONSE_BATTLE_ENTER.Builder builder) {
		super(messageId, status, sessionId, sender, null);
		this.builder = builder;
	}

	/**
	 * 
	 * @param	teamA
	 * 			<u>do not has any annotate.</u>
	 */
	public void setTeamA(Iterable<VO_UNIT_BATTLE_INFO> teamA) {
		builder.addAllTeamA(teamA);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VO_UNIT_BATTLE_INFO> getTeamAList() {
		return builder.getTeamAList();
	}

	/**
	 * 
	 * @param	teamB
	 * 			<u>do not has any annotate.</u>
	 */
	public void setTeamB(Iterable<VO_UNIT_BATTLE_INFO> teamB) {
		builder.addAllTeamB(teamB);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VO_UNIT_BATTLE_INFO> getTeamBList() {
		return builder.getTeamBList();
	}

	public RESPONSE_BATTLE_ENTER getResponseBattleEnter() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
