package cg.base.io.response;

import net.io.protocal.proto.ProtoResponse;
import cg.base.io.proto.BattleProtos.*;
import com.google.protobuf.InvalidProtocolBufferException;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseBattleEnter extends ProtoResponse {

	private RESPONSE_BATTLE_ENTER.Builder builder = RESPONSE_BATTLE_ENTER.newBuilder();

	public RESPONSE_BATTLE_ENTER getRESPONSE_BATTLE_ENTER() {
		return builder.build();
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
	 * @param	teamB
	 * 			<u>do not has any annotate.</u>
	 */
	public void setTeamB(Iterable<VO_UNIT_BATTLE_INFO> teamB) {
		builder.addAllTeamB(teamB);
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
