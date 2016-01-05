package cg.base.io.message;

import net.io.ISender;
import net.message.ByteArrayMessage;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestPlayerCreateInfo extends ByteArrayMessage {

	public RequestPlayerCreateInfo(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_REQUEST_PLAYER_CREATE_INFO_VALUE, status, sessionId, sender, datas);
	}

	public RequestPlayerCreateInfo() {
		super();
		messageId = MessageId.MI_REQUEST_PLAYER_CREATE_INFO_VALUE;
	}

}
