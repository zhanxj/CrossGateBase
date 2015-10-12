package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseScript extends ProtoMessage {

	public ResponseScript(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_SCRIPT_VALUE, status, sessionId, sender, datas);
	}

	public ResponseScript() {
		super();
		messageId = MessageId.MI_RESPONSE_SCRIPT_VALUE;
	}

}
