package cg.base.io.message;

import net.dipatch.ISender;
import net.io.message.ByteArrayMessage;
import cg.base.io.proto.MapProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseMapIn extends ByteArrayMessage {

	private RESPONSE_MAP_IN.Builder builder;

	public ResponseMapIn(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_MAP_IN_VALUE, status, sessionId, sender, datas);
		builder = RESPONSE_MAP_IN.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseMapIn() {
		super();
		builder = RESPONSE_MAP_IN.newBuilder();
		messageId = MessageId.MI_RESPONSE_MAP_IN_VALUE;
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
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getMapInstanceId() {
		return builder.getMapInstanceId();
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
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getEast() {
		return builder.getEast();
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
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getSouth() {
		return builder.getSouth();
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
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getMaxEast() {
		return builder.getMaxEast();
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
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getMapId() {
		return builder.getMapId();
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
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getMapName() {
		return builder.getMapName();
	}

	/**
	 * 
	 * @param	maxSouth
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMaxSouth(Integer maxSouth) {
		builder.setMaxSouth(maxSouth);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getMaxSouth() {
		return builder.getMaxSouth();
	}

	public RESPONSE_MAP_IN getResponseMapIn() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
