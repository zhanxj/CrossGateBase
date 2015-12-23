package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ByteArrayMessage;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestDoubleExpEnd extends ByteArrayMessage {

	public RequestDoubleExpEnd(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_REQUEST_DOUBLE_EXP_END_VALUE, status, sessionId, sender, datas);
	}

	public RequestDoubleExpEnd() {
		super();
		messageId = MessageId.MI_REQUEST_DOUBLE_EXP_END_VALUE;
	}

}
