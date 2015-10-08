package cg.base.io.response;

import net.io.protocal.proto.ProtoResponse;
import cg.base.io.proto.SkillProtos.*;
import com.google.protobuf.InvalidProtocolBufferException;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RESPONSE_DOUBLE_EXP_UPDATEResponse extends ProtoResponse {

	private RESPONSE_DOUBLE_EXP_UPDATE.Builder builder = RESPONSE_DOUBLE_EXP_UPDATE.newBuilder();

	public RESPONSE_DOUBLE_EXP_UPDATE getRESPONSE_DOUBLE_EXP_UPDATE() {
		return builder.build();
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
	 * @param	isDouble
	 * 			<u>do not has any annotate.</u>
	 */
	public void setIsDouble(Boolean isDouble) {
		builder.setIsDouble(isDouble);
	}

	@Override
	public void mergeFrom(byte[] data) throws InvalidProtocolBufferException {
		builder.mergeFrom(data);
	}

	@Override
	public void setError(int errorCode, String errorMsg) {
	}

	@Override
	public boolean hasError() {
		return false;
	}

}
