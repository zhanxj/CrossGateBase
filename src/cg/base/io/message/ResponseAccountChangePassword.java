package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ByteArrayMessage;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseAccountChangePassword extends ByteArrayMessage {

	public ResponseAccountChangePassword(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_ACCOUNT_CHANGE_PASSWORD_VALUE, status, sessionId, sender, datas);
	}

	public ResponseAccountChangePassword() {
		super();
		messageId = MessageId.MI_RESPONSE_ACCOUNT_CHANGE_PASSWORD_VALUE;
	}

}
