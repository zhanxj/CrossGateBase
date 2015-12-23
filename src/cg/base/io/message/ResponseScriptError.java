package cg.base.io.message;

import net.io.ISender;
import net.io.message.ByteArrayMessage;
import cg.base.io.proto.ScriptProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseScriptError extends ByteArrayMessage {

	private RESPONSE_SCRIPT_ERROR.Builder builder;

	public ResponseScriptError(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_SCRIPT_ERROR_VALUE, status, sessionId, sender, datas);
		builder = RESPONSE_SCRIPT_ERROR.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseScriptError() {
		super();
		builder = RESPONSE_SCRIPT_ERROR.newBuilder();
		messageId = MessageId.MI_RESPONSE_SCRIPT_ERROR_VALUE;
	}

	/**
	 * 
	 * @param	talkType
	 * 			<u>do not has any annotate.</u>
	 */
	public void setTalkType(String talkType) {
		builder.setTalkType(talkType);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getTalkType() {
		return builder.getTalkType();
	}

	/**
	 * 
	 * @param	message
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMessage(Integer message) {
		builder.setMessage(message);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getMessage() {
		return builder.getMessage();
	}

	public RESPONSE_SCRIPT_ERROR getResponseScriptError() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
