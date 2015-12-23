package cg.base.io.message;

import net.dipatch.ISender;
import net.io.message.ByteArrayMessage;
import cg.base.io.proto.SkillProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseDoubleExpUpdate extends ByteArrayMessage {

	private RESPONSE_DOUBLE_EXP_UPDATE.Builder builder;

	public ResponseDoubleExpUpdate(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_DOUBLE_EXP_UPDATE_VALUE, status, sessionId, sender, datas);
		builder = RESPONSE_DOUBLE_EXP_UPDATE.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseDoubleExpUpdate() {
		super();
		builder = RESPONSE_DOUBLE_EXP_UPDATE.newBuilder();
		messageId = MessageId.MI_RESPONSE_DOUBLE_EXP_UPDATE_VALUE;
	}

	/**
	 * 
	 * @param	time
	 * 			<u>do not has any annotate.</u>
	 */
	public void setTime(Integer time) {
		builder.setTime(time);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getTime() {
		return builder.getTime();
	}

	/**
	 * 
	 * @param	isDouble
	 * 			<u>do not has any annotate.</u>
	 */
	public void setIsDouble(Boolean isDouble) {
		builder.setIsDouble(isDouble);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Boolean getIsDouble() {
		return builder.getIsDouble();
	}

	public RESPONSE_DOUBLE_EXP_UPDATE getResponseDoubleExpUpdate() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
