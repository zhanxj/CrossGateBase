package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseDoubleExpEnd extends ProtoMessage {

	public ResponseDoubleExpEnd(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_DOUBLE_EXP_END_VALUE, status, sessionId, sender, datas);
	}

	public ResponseDoubleExpEnd() {
		super();
		messageId = MessageId.MI_RESPONSE_DOUBLE_EXP_END_VALUE;
	}

}
