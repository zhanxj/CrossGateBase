package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.SkillProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseDoubleExpUpdate extends ProtoMessage {

	private RESPONSE_DOUBLE_EXP_UPDATE.Builder builder;

	public ResponseDoubleExpUpdate(int messageId, int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(messageId, status, sessionId, sender, datas);
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseDoubleExpUpdate() {
		super();
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
