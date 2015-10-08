package cg.base.io.response;

import net.io.protocal.proto.ProtoResponse;
import cg.base.io.proto.AccountProtos.*;
import com.google.protobuf.InvalidProtocolBufferException;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RESPONSE_SERVER_SELECTResponse extends ProtoResponse {

	private RESPONSE_SERVER_SELECT.Builder builder = RESPONSE_SERVER_SELECT.newBuilder();

	public RESPONSE_SERVER_SELECT getRESPONSE_SERVER_SELECT() {
		return builder.build();
	}

	/**
	 * 
	 * @param	url
	 * 			<u>do not has any annotate.</u>
	 */
	public void setUrl(String url) {
		builder.setUrl(url);
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
