package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.ScriptProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseScriptError extends ProtoMessage {

	private RESPONSE_SCRIPT_ERROR.Builder builder;

	public ResponseScriptError(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_SCRIPT_ERROR_VALUE, status, sessionId, sender, datas);
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseScriptError() {
		super();
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
		String ret = builder.getTalkType();
		return ret;
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
		int ret = builder.getMessage();
		return ret;
	}

	public RESPONSE_SCRIPT_ERROR getResponseScriptError() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
