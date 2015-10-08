package cg.base.io.response;

import net.io.protocal.proto.ProtoResponse;
import cg.base.io.proto.MapProtos.*;
import com.google.protobuf.InvalidProtocolBufferException;

import cg.base.io.proto.VOProtos.*;
/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RESPONSE_MAP_MOVEResponse extends ProtoResponse {

	private RESPONSE_MAP_MOVE.Builder builder = RESPONSE_MAP_MOVE.newBuilder();

	public RESPONSE_MAP_MOVE getRESPONSE_MAP_MOVE() {
		return builder.build();
	}

	/**
	 * 
	 * @param	mapCells
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMapCells(Iterable<VO_MAP_CELL> mapCells) {
		builder.addAllMapCells(mapCells);
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
