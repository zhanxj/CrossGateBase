package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.MapProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestMapIn extends ProtoMessage {

	private REQUEST_MAP_IN.Builder builder;

	public RequestMapIn(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_REQUEST_MAP_IN_VALUE, status, sessionId, sender, datas);
		builder = REQUEST_MAP_IN.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public RequestMapIn() {
		super();
		builder = REQUEST_MAP_IN.newBuilder();
		messageId = MessageId.MI_REQUEST_MAP_IN_VALUE;
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

	public REQUEST_MAP_IN getRequestMapIn() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
