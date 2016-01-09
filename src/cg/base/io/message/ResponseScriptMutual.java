package cg.base.io.message;

import net.io.ISender;
import net.message.ByteArrayMessage;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseScriptMutual extends ByteArrayMessage {

	public ResponseScriptMutual(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_SCRIPT_MUTUAL_VALUE, status, sessionId, sender, datas);
	}

	public ResponseScriptMutual() {
		super();
		messageId = MessageId.MI_RESPONSE_SCRIPT_MUTUAL_VALUE;
	}

}
