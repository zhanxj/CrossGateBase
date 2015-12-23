package cg.base.io.message;

import net.io.ISender;
import net.io.message.ByteArrayMessage;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestChatJoin extends ByteArrayMessage {

	public RequestChatJoin(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_REQUEST_CHAT_JOIN_VALUE, status, sessionId, sender, datas);
	}

	public RequestChatJoin() {
		super();
		messageId = MessageId.MI_REQUEST_CHAT_JOIN_VALUE;
	}

}
