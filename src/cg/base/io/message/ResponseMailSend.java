package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseMailSend extends ProtoMessage {

	public ResponseMailSend(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_MAIL_SEND_VALUE, status, sessionId, sender, datas);
	}

	public ResponseMailSend() {
		super();
		messageId = MessageId.MI_RESPONSE_MAIL_SEND_VALUE;
	}

}
