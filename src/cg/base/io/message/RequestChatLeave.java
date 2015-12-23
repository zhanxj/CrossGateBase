package cg.base.io.message;

import net.dipatch.ISender;
import net.io.message.ByteArrayMessage;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestChatLeave extends ByteArrayMessage {

	public RequestChatLeave(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_REQUEST_CHAT_LEAVE_VALUE, status, sessionId, sender, datas);
	}

	public RequestChatLeave() {
		super();
		messageId = MessageId.MI_REQUEST_CHAT_LEAVE_VALUE;
	}

}
