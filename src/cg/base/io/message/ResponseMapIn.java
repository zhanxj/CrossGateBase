package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.MapProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseMapIn extends ProtoMessage {

	private RESPONSE_MAP_IN.Builder builder;

	public ResponseMapIn(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_MAP_IN_VALUE, status, sessionId, sender, datas);
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseMapIn() {
		super();
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
		int ret = builder.getMapInstanceId();
		return ret;
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
		int ret = builder.getEast();
		return ret;
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
		int ret = builder.getSouth();
		return ret;
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
		int ret = builder.getMaxEast();
		return ret;
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
		int ret = builder.getMapId();
		return ret;
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
		String ret = builder.getMapName();
		return ret;
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
		int ret = builder.getMaxSouth();
		return ret;
	}

	public RESPONSE_MAP_IN getResponseMapIn() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
