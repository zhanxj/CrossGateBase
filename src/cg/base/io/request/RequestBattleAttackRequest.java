package cg.base.io.request;

import java.io.InputStream;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoRequest;
import cg.base.io.proto.BattleProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestBattleAttackRequest extends ProtoRequest {

	private REQUEST_BATTLE_ATTACK requestBattleAttack;

	public RequestBattleAttackRequest(int receiveMessageId, byte[] datas, ISender sender, String sessionId, REQUEST_BATTLE_ATTACK requestBattleAttack) {
		super(receiveMessageId, datas, sender, sessionId);
		this.requestBattleAttack = requestBattleAttack;
	}

	public RequestBattleAttackRequest(int receiveMessageId, InputStream is, int contentLength, ISender sender, String sessionId, REQUEST_BATTLE_ATTACK requestBattleAttack) throws Exception {
		super(receiveMessageId, is, contentLength, sender, sessionId);
		this.requestBattleAttack = requestBattleAttack;
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Integer getTargetId() {
		return requestBattleAttack.getTargetId();
	}

	public REQUEST_BATTLE_ATTACK getRequestBattleAttack() {
		return requestBattleAttack;
	}

	@Override
	public byte[] getByteArray() {
		return requestBattleAttack.toByteArray();
	}

}
