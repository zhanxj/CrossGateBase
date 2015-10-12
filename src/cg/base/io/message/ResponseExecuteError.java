package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.CommonProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseExecuteError extends ProtoMessage {

	private RESPONSE_EXECUTE_ERROR.Builder builder;

	public ResponseExecuteError(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_EXECUTE_ERROR_VALUE, status, sessionId, sender, datas);
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseExecuteError() {
		super();
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
		int ret = builder.getMessageId();
		return ret;
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
		int ret = builder.getErrorCode();
		return ret;
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
		String ret = builder.getMessage();
		return ret;
	}

	public RESPONSE_EXECUTE_ERROR getResponseExecuteError() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
