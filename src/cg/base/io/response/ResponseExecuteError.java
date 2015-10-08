package cg.base.io.response;

import net.io.protocal.proto.ProtoResponse;
import cg.base.io.proto.CommonProtos.*;
import com.google.protobuf.InvalidProtocolBufferException;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseExecuteError extends ProtoResponse {

	private RESPONSE_EXECUTE_ERROR.Builder builder = RESPONSE_EXECUTE_ERROR.newBuilder();

	public RESPONSE_EXECUTE_ERROR getRESPONSE_EXECUTE_ERROR() {
		return builder.build();
	}

	/**
	 * 
	 * @param	messageId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMessageId(Integer messageId) {
		builder.setMessageId(messageId);
	}

	/**
	 * 
	 * @param	errorCode
	 * 			<u>do not has any annotate.</u>
	 */
	public void setErrorCode(Integer errorCode) {
		builder.setErrorCode(errorCode);
	}

	/**
	 * 
	 * @param	message
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMessage(String message) {
		builder.setMessage(message);
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
