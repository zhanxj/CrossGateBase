package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.BattleProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseBattleAction extends ProtoMessage {

	private RESPONSE_BATTLE_ACTION.Builder builder;

	public ResponseBattleAction(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_BATTLE_ACTION_VALUE, status, sessionId, sender, datas);
		builder = RESPONSE_BATTLE_ACTION.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseBattleAction() {
		super();
		builder = RESPONSE_BATTLE_ACTION.newBuilder();
		messageId = MessageId.MI_RESPONSE_BATTLE_ACTION_VALUE;
	}

	/**
	 * 
	 * @param	targetId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setTargetId(Integer targetId) {
		builder.setTargetId(targetId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getTargetId() {
		int ret = builder.getTargetId();
		return ret;
	}

	public RESPONSE_BATTLE_ACTION getResponseBattleAction() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
