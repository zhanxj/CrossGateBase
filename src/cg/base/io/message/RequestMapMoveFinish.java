package cg.base.io.message;

import net.dipatch.ISender;
import net.io.message.ByteArrayMessage;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestMapMoveFinish extends ByteArrayMessage {

	public RequestMapMoveFinish(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_REQUEST_MAP_MOVE_FINISH_VALUE, status, sessionId, sender, datas);
	}

	public RequestMapMoveFinish() {
		super();
		messageId = MessageId.MI_REQUEST_MAP_MOVE_FINISH_VALUE;
	}

}
