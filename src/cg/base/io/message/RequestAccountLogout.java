package cg.base.io.message;

import net.io.ISender;
import net.io.message.ByteArrayMessage;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestAccountLogout extends ByteArrayMessage {

	public RequestAccountLogout(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_REQUEST_ACCOUNT_LOGOUT_VALUE, status, sessionId, sender, datas);
	}

	public RequestAccountLogout() {
		super();
		messageId = MessageId.MI_REQUEST_ACCOUNT_LOGOUT_VALUE;
	}

}
