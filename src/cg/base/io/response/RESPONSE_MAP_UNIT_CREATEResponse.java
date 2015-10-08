package cg.base.io.response;

import net.io.protocal.proto.ProtoResponse;
import cg.base.io.proto.MapProtos.*;
import com.google.protobuf.InvalidProtocolBufferException;

import cg.base.io.proto.VOProtos.*;
/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RESPONSE_MAP_UNIT_CREATEResponse extends ProtoResponse {

	private RESPONSE_MAP_UNIT_CREATE.Builder builder = RESPONSE_MAP_UNIT_CREATE.newBuilder();

	public RESPONSE_MAP_UNIT_CREATE getRESPONSE_MAP_UNIT_CREATE() {
		return builder.build();
	}

	/**
	 * 
	 * @param	baseInfo
	 * 			<u>do not has any annotate.</u>
	 */
	public void setBaseInfo(VO_UNIT_BASE_INFO baseInfo) {
		builder.setBaseInfo(baseInfo);
	}

	/**
	 * 
	 * @param	position
	 * 			<u>do not has any annotate.</u>
	 */
	public void setPosition(VO_POSITION position) {
		builder.setPosition(position);
	}

	/**
	 * 
	 * @param	extendInfo
	 * 			<u>do not has any annotate.</u>
	 */
	public void setExtendInfo(VO_MAP_UNIT_EXTEND extendInfo) {
		builder.setExtendInfo(extendInfo);
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
