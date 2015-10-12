package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestSkillUse extends ProtoMessage {

	public RequestSkillUse(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_REQUEST_SKILL_USE_VALUE, status, sessionId, sender, datas);
	}

	public RequestSkillUse() {
		super();
		messageId = MessageId.MI_REQUEST_SKILL_USE_VALUE;
	}

}
