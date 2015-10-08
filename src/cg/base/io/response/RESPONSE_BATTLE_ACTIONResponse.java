package cg.base.io.response;

import net.io.protocal.proto.ProtoResponse;
import cg.base.io.proto.BattleProtos.*;
import com.google.protobuf.InvalidProtocolBufferException;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RESPONSE_BATTLE_ACTIONResponse extends ProtoResponse {

	private RESPONSE_BATTLE_ACTION.Builder builder = RESPONSE_BATTLE_ACTION.newBuilder();

	public RESPONSE_BATTLE_ACTION getRESPONSE_BATTLE_ACTION() {
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
