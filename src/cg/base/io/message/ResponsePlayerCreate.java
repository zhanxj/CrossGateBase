package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.PlayerProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponsePlayerCreate extends ProtoMessage {

	private RESPONSE_PLAYER_CREATE.Builder builder;

	public ResponsePlayerCreate(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_PLAYER_CREATE_VALUE, status, sessionId, sender, datas);
		builder = RESPONSE_PLAYER_CREATE.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponsePlayerCreate() {
		super();
		builder = RESPONSE_PLAYER_CREATE.newBuilder();
		messageId = MessageId.MI_RESPONSE_PLAYER_CREATE_VALUE;
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

	public RESPONSE_PLAYER_CREATE getResponsePlayerCreate() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
