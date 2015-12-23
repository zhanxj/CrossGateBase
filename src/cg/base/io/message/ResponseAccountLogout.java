package cg.base.io.message;

import net.io.ISender;
import net.io.message.ByteArrayMessage;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseAccountLogout extends ByteArrayMessage {

	public ResponseAccountLogout(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_ACCOUNT_LOGOUT_VALUE, status, sessionId, sender, datas);
	}

	public ResponseAccountLogout() {
		super();
		messageId = MessageId.MI_RESPONSE_ACCOUNT_LOGOUT_VALUE;
	}

}
