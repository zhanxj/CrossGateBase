package cg.base.io.message;

import net.io.ISender;
import net.io.message.ByteArrayMessage;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestHeartBeat extends ByteArrayMessage {

	public RequestHeartBeat(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_REQUEST_HEART_BEAT_VALUE, status, sessionId, sender, datas);
	}

	public RequestHeartBeat() {
		super();
		messageId = MessageId.MI_REQUEST_HEART_BEAT_VALUE;
	}

}
