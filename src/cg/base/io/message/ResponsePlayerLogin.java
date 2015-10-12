package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.PlayerProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponsePlayerLogin extends ProtoMessage {

	private RESPONSE_PLAYER_LOGIN.Builder builder;

	public ResponsePlayerLogin(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_PLAYER_LOGIN_VALUE, status, sessionId, sender, datas);
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponsePlayerLogin() {
		super();
		messageId = MessageId.MI_RESPONSE_PLAYER_LOGIN_VALUE;
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
		VoUnit ret = new VoUnit(builder.getUnitInfo());
		return ret;
	}

	public RESPONSE_PLAYER_LOGIN getResponsePlayerLogin() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
