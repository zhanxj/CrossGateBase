package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ByteArrayMessage;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseSkillUnlearn extends ByteArrayMessage {

	public ResponseSkillUnlearn(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_SKILL_UNLEARN_VALUE, status, sessionId, sender, datas);
	}

	public ResponseSkillUnlearn() {
		super();
		messageId = MessageId.MI_RESPONSE_SKILL_UNLEARN_VALUE;
	}

}
