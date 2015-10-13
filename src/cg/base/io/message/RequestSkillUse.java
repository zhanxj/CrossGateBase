package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.SkillProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestSkillUse extends ProtoMessage {

	private REQUEST_SKILL_USE.Builder builder;

	public RequestSkillUse(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_REQUEST_SKILL_USE_VALUE, status, sessionId, sender, datas);
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public RequestSkillUse() {
		super();
		messageId = MessageId.MI_REQUEST_SKILL_USE_VALUE;
	}

	/**
	 * 
	 * @param	targetId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setTargetId(Integer targetId) {
		builder.setTargetId(targetId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getTargetId() {
		int ret = builder.getTargetId();
		return ret;
	}

	/**
	 * 
	 * @param	skillCode
	 * 			<u>do not has any annotate.</u>
	 */
	public void setSkillCode(Integer skillCode) {
		builder.setSkillCode(skillCode);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getSkillCode() {
		int ret = builder.getSkillCode();
		return ret;
	}

	public REQUEST_SKILL_USE getRequestSkillUse() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
