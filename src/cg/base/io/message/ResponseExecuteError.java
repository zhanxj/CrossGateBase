package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.CommonProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseExecuteError extends ProtoMessage {

	private RESPONSE_EXECUTE_ERROR.Builder builder;

	public ResponseExecuteError(int messageId, int status, String sessionId, ISender sender, RESPONSE_EXECUTE_ERROR.Builder builder) {
		super(messageId, status, sessionId, sender, null);
		this.builder = builder;
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
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getMessageId() {
		return builder.getMessageId();
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
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getErrorCode() {
		return builder.getErrorCode();
	}

	/**
	 * 
	 * @param	message
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMessage(String message) {
		builder.setMessage(message);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getMessage() {
		return builder.getMessage();
	}

	public RESPONSE_EXECUTE_ERROR getResponseExecuteError() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
