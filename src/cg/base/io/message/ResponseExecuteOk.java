package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.CommonProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseExecuteOk extends ProtoMessage {

	private RESPONSE_EXECUTE_OK.Builder builder;

	public ResponseExecuteOk(int messageId, int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(messageId, status, sessionId, sender, datas);
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseExecuteOk() {
		super();
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

	public RESPONSE_EXECUTE_OK getResponseExecuteOk() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
