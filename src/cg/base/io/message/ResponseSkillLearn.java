package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ByteArrayMessage;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseSkillLearn extends ByteArrayMessage {

	public ResponseSkillLearn(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_SKILL_LEARN_VALUE, status, sessionId, sender, datas);
	}

	public ResponseSkillLearn() {
		super();
		messageId = MessageId.MI_RESPONSE_SKILL_LEARN_VALUE;
	}

}
