package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ByteArrayMessage;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponsePlayerQuery extends ByteArrayMessage {

	public ResponsePlayerQuery(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_PLAYER_QUERY_VALUE, status, sessionId, sender, datas);
	}

	public ResponsePlayerQuery() {
		super();
		messageId = MessageId.MI_RESPONSE_PLAYER_QUERY_VALUE;
	}

}
