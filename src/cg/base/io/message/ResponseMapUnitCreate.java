package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ByteArrayMessage;
import cg.base.io.proto.MapProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseMapUnitCreate extends ByteArrayMessage {

	private RESPONSE_MAP_UNIT_CREATE.Builder builder;

	public ResponseMapUnitCreate(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_MAP_UNIT_CREATE_VALUE, status, sessionId, sender, datas);
		builder = RESPONSE_MAP_UNIT_CREATE.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseMapUnitCreate() {
		super();
		builder = RESPONSE_MAP_UNIT_CREATE.newBuilder();
		messageId = MessageId.MI_RESPONSE_MAP_UNIT_CREATE_VALUE;
	}

	/**
	 * 
	 * @param	unitInfo
	 * 			<u>do not has any annotate.</u>
	 */
	public void setUnitInfo(VoUnit unitInfo) {
		builder.setUnitInfo(unitInfo.getVO_UNIT());
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VoUnit getUnitInfo() {
		return new VoUnit(builder.getUnitInfo());
	}

	public RESPONSE_MAP_UNIT_CREATE getResponseMapUnitCreate() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
