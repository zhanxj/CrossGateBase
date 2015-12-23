package cg.base.io.message;

import net.dipatch.ISender;
import net.io.message.ByteArrayMessage;
import cg.base.io.proto.MapProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseMapUnitMove extends ByteArrayMessage {

	private RESPONSE_MAP_UNIT_MOVE.Builder builder;

	public ResponseMapUnitMove(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_MAP_UNIT_MOVE_VALUE, status, sessionId, sender, datas);
		builder = RESPONSE_MAP_UNIT_MOVE.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseMapUnitMove() {
		super();
		builder = RESPONSE_MAP_UNIT_MOVE.newBuilder();
		messageId = MessageId.MI_RESPONSE_MAP_UNIT_MOVE_VALUE;
	}

	/**
	 * 
	 * @param	unitType
	 * 			<u>do not has any annotate.</u>
	 */
	public void setUnitType(Integer unitType) {
		builder.setUnitType(unitType);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getUnitType() {
		return builder.getUnitType();
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
	 * @param	instanceId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setInstanceId(Integer instanceId) {
		builder.setInstanceId(instanceId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getInstanceId() {
		return builder.getInstanceId();
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

	public RESPONSE_MAP_UNIT_MOVE getResponseMapUnitMove() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
