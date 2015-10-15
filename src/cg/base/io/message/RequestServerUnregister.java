package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.ServerProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestServerUnregister extends ProtoMessage {

	private REQUEST_SERVER_UNREGISTER.Builder builder;

	public RequestServerUnregister(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_REQUEST_SERVER_UNREGISTER_VALUE, status, sessionId, sender, datas);
		builder = REQUEST_SERVER_UNREGISTER.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public RequestServerUnregister() {
		super();
		builder = REQUEST_SERVER_UNREGISTER.newBuilder();
		messageId = MessageId.MI_REQUEST_SERVER_UNREGISTER_VALUE;
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

	public REQUEST_SERVER_UNREGISTER getRequestServerUnregister() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
