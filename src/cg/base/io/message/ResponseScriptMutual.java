package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseScriptMutual extends ProtoMessage {

	public ResponseScriptMutual(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_SCRIPT_MUTUAL_VALUE, status, sessionId, sender, datas);
	}

	public ResponseScriptMutual() {
		super();
		messageId = MessageId.MI_RESPONSE_SCRIPT_MUTUAL_VALUE;
	}

}
