package cg.base.io.message;

import net.dipatch.ISender;
import net.io.message.ByteArrayMessage;
import cg.base.io.proto.CommonProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseExecuteError extends ByteArrayMessage {

	private RESPONSE_EXECUTE_ERROR.Builder builder;

	public ResponseExecuteError(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_EXECUTE_ERROR_VALUE, status, sessionId, sender, datas);
		builder = RESPONSE_EXECUTE_ERROR.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseExecuteError() {
		super();
		builder = RESPONSE_EXECUTE_ERROR.newBuilder();
		messageId = MessageId.MI_RESPONSE_EXECUTE_ERROR_VALUE;
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
