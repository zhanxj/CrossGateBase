package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ByteArrayMessage;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestDoubleExpBegin extends ByteArrayMessage {

	public RequestDoubleExpBegin(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_REQUEST_DOUBLE_EXP_BEGIN_VALUE, status, sessionId, sender, datas);
	}

	public RequestDoubleExpBegin() {
		super();
		messageId = MessageId.MI_REQUEST_DOUBLE_EXP_BEGIN_VALUE;
	}

}
