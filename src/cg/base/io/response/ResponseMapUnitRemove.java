package cg.base.io.response;

import net.io.protocal.proto.ProtoResponse;
import cg.base.io.proto.MapProtos.*;
import com.google.protobuf.InvalidProtocolBufferException;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseMapUnitRemove extends ProtoResponse {

	private RESPONSE_MAP_UNIT_REMOVE.Builder builder = RESPONSE_MAP_UNIT_REMOVE.newBuilder();

	public RESPONSE_MAP_UNIT_REMOVE getRESPONSE_MAP_UNIT_REMOVE() {
		return builder.build();
	}

	/**
	 * 
	 * @param	instanceId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setInstanceId(Integer instanceId) {
		builder.setInstanceId(instanceId);
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
