package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.ChatProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseChatLeave extends ProtoMessage {

	private RESPONSE_CHAT_LEAVE.Builder builder;

	public ResponseChatLeave(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_CHAT_LEAVE_VALUE, status, sessionId, sender, datas);
		builder = RESPONSE_CHAT_LEAVE.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseChatLeave() {
		super();
		builder = RESPONSE_CHAT_LEAVE.newBuilder();
		messageId = MessageId.MI_RESPONSE_CHAT_LEAVE_VALUE;
	}

	/**
	 * 
	 * @param	channelName
	 * 			<u>do not has any annotate.</u>
	 */
	public void setChannelName(String channelName) {
		builder.setChannelName(channelName);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getChannelName() {
		String ret = builder.getChannelName();
		return ret;
	}

	public RESPONSE_CHAT_LEAVE getResponseChatLeave() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
