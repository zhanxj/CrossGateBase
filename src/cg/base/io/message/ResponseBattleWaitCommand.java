package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.BattleProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseBattleWaitCommand extends ProtoMessage {

	private RESPONSE_BATTLE_WAIT_COMMAND.Builder builder;

	public ResponseBattleWaitCommand(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_BATTLE_WAIT_COMMAND_VALUE, status, sessionId, sender, datas);
		builder = RESPONSE_BATTLE_WAIT_COMMAND.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseBattleWaitCommand() {
		super();
		builder = RESPONSE_BATTLE_WAIT_COMMAND.newBuilder();
		messageId = MessageId.MI_RESPONSE_BATTLE_WAIT_COMMAND_VALUE;
	}

	/**
	 * 
	 * @param	actionCount
	 * 			<u>do not has any annotate.</u>
	 */
	public void setActionCount(Integer actionCount) {
		builder.setActionCount(actionCount);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getActionCount() {
		return builder.getActionCount();
	}

	public RESPONSE_BATTLE_WAIT_COMMAND getResponseBattleWaitCommand() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
