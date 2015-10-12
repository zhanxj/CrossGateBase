package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.MapProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseMapUnitMove extends ProtoMessage {

	private RESPONSE_MAP_UNIT_MOVE.Builder builder;

	public ResponseMapUnitMove(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_MAP_UNIT_MOVE_VALUE, status, sessionId, sender, datas);
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseMapUnitMove() {
		super();
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
		int ret = builder.getUnitType();
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
		int ret = builder.getInstanceId();
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

	public RESPONSE_MAP_UNIT_MOVE getResponseMapUnitMove() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
