package cg.base.io.response;

import net.io.protocal.proto.ProtoResponse;
import cg.base.io.proto.AccountProtos.*;
import com.google.protobuf.InvalidProtocolBufferException;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseServerList extends ProtoResponse {

	private RESPONSE_SERVER_LIST.Builder builder = RESPONSE_SERVER_LIST.newBuilder();

	public RESPONSE_SERVER_LIST getRESPONSE_SERVER_LIST() {
		return builder.build();
	}

	/**
	 * 
	 * @param	servers
	 * 			<u>do not has any annotate.</u>
	 */
	public void setServers(Iterable<VO_SERVER> servers) {
		builder.addAllServers(servers);
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
