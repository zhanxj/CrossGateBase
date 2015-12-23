package cg.base.io.message;

import net.dipatch.ISender;
import net.io.message.ByteArrayMessage;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseAccountLogin extends ByteArrayMessage {

	public ResponseAccountLogin(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_ACCOUNT_LOGIN_VALUE, status, sessionId, sender, datas);
	}

	public ResponseAccountLogin() {
		super();
		messageId = MessageId.MI_RESPONSE_ACCOUNT_LOGIN_VALUE;
	}

}
