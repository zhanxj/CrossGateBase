package cg.base.io.response;

import net.io.protocal.proto.ProtoResponse;
import cg.base.io.proto.MapProtos.*;
import com.google.protobuf.InvalidProtocolBufferException;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseMapIn extends ProtoResponse {

	private RESPONSE_MAP_IN.Builder builder = RESPONSE_MAP_IN.newBuilder();

	public RESPONSE_MAP_IN getRESPONSE_MAP_IN() {
		return builder.build();
	}

	/**
	 * 
	 * @param	mapInstanceId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMapInstanceId(Integer mapInstanceId) {
		builder.setMapInstanceId(mapInstanceId);
	}

	/**
	 * 
	 * @param	east
	 * 			<u>do not has any annotate.</u>
	 */
	public void setEast(Integer east) {
		builder.setEast(east);
	}

	/**
	 * 
	 * @param	south
	 * 			<u>do not has any annotate.</u>
	 */
	public void setSouth(Integer south) {
		builder.setSouth(south);
	}

	/**
	 * 
	 * @param	maxEast
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMaxEast(Integer maxEast) {
		builder.setMaxEast(maxEast);
	}

	/**
	 * 
	 * @param	mapId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMapId(Integer mapId) {
		builder.setMapId(mapId);
	}

	/**
	 * 
	 * @param	mapName
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMapName(String mapName) {
		builder.setMapName(mapName);
	}

	/**
	 * 
	 * @param	maxSouth
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMaxSouth(Integer maxSouth) {
		builder.setMaxSouth(maxSouth);
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
