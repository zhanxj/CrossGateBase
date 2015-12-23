package cg.base.io.message;

import net.dipatch.ISender;
import net.io.message.ByteArrayMessage;
import cg.base.io.proto.MapProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseMapUnitRemove extends ByteArrayMessage {

	private RESPONSE_MAP_UNIT_REMOVE.Builder builder;

	public ResponseMapUnitRemove(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_MAP_UNIT_REMOVE_VALUE, status, sessionId, sender, datas);
		builder = RESPONSE_MAP_UNIT_REMOVE.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseMapUnitRemove() {
		super();
		builder = RESPONSE_MAP_UNIT_REMOVE.newBuilder();
		messageId = MessageId.MI_RESPONSE_MAP_UNIT_REMOVE_VALUE;
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

	public RESPONSE_MAP_UNIT_REMOVE getResponseMapUnitRemove() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
