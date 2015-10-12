package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestSkillLearn extends ProtoMessage {

	public RequestSkillLearn(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_REQUEST_SKILL_LEARN_VALUE, status, sessionId, sender, datas);
	}

	public RequestSkillLearn() {
		super();
		messageId = MessageId.MI_REQUEST_SKILL_LEARN_VALUE;
	}

}
