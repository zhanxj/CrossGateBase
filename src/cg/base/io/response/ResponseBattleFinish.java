package cg.base.io.response;

import net.io.protocal.proto.ProtoResponse;
import cg.base.io.proto.BattleProtos.*;
import com.google.protobuf.InvalidProtocolBufferException;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseBattleFinish extends ProtoResponse {

	private RESPONSE_BATTLE_FINISH.Builder builder = RESPONSE_BATTLE_FINISH.newBuilder();

	public RESPONSE_BATTLE_FINISH getRESPONSE_BATTLE_FINISH() {
		return builder.build();
	}

	/**
	 * 
	 * @param	targetId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setTargetId(Integer targetId) {
		builder.setTargetId(targetId);
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
