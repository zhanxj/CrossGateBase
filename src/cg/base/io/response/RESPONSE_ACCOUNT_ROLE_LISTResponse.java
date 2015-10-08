package cg.base.io.response;

import net.io.protocal.proto.ProtoResponse;
import cg.base.io.proto.AccountProtos.*;
import com.google.protobuf.InvalidProtocolBufferException;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RESPONSE_ACCOUNT_ROLE_LISTResponse extends ProtoResponse {

	private RESPONSE_ACCOUNT_ROLE_LIST.Builder builder = RESPONSE_ACCOUNT_ROLE_LIST.newBuilder();

	public RESPONSE_ACCOUNT_ROLE_LIST getRESPONSE_ACCOUNT_ROLE_LIST() {
		return builder.build();
	}

	/**
	 * 
	 * @param	players
	 * 			<u>do not has any annotate.</u>
	 */
	public void setPlayers(Iterable<VO_ACCOUNT_PLAYER_INFO> players) {
		builder.addAllPlayers(players);
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
