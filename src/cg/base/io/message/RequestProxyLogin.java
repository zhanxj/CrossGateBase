package cg.base.io.message;

import net.dipatch.ISender;
import net.io.message.ByteArrayMessage;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestProxyLogin extends ByteArrayMessage {

	public RequestProxyLogin(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_REQUEST_PROXY_LOGIN_VALUE, status, sessionId, sender, datas);
	}

	public RequestProxyLogin() {
		super();
		messageId = MessageId.MI_REQUEST_PROXY_LOGIN_VALUE;
	}

}
