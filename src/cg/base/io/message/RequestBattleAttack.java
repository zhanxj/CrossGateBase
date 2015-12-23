package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ByteArrayMessage;
import cg.base.io.proto.BattleProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestBattleAttack extends ByteArrayMessage {

	private REQUEST_BATTLE_ATTACK.Builder builder;

	public RequestBattleAttack(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_REQUEST_BATTLE_ATTACK_VALUE, status, sessionId, sender, datas);
		builder = REQUEST_BATTLE_ATTACK.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public RequestBattleAttack() {
		super();
		builder = REQUEST_BATTLE_ATTACK.newBuilder();
		messageId = MessageId.MI_REQUEST_BATTLE_ATTACK_VALUE;
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
		return builder.getTargetId();
	}

	public REQUEST_BATTLE_ATTACK getRequestBattleAttack() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
