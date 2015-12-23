package cg.base.io.message;

import net.io.ISender;
import net.io.message.ByteArrayMessage;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestProxySessionDisconnect extends ByteArrayMessage {

	public RequestProxySessionDisconnect(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_REQUEST_PROXY_SESSION_DISCONNECT_VALUE, status, sessionId, sender, datas);
	}

	public RequestProxySessionDisconnect() {
		super();
		messageId = MessageId.MI_REQUEST_PROXY_SESSION_DISCONNECT_VALUE;
	}

}
