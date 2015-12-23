package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ByteArrayMessage;
import cg.base.io.proto.BattleProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;
import com.google.common.collect.Lists;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseBattleActions extends ByteArrayMessage {

	private RESPONSE_BATTLE_ACTIONS.Builder builder;

	public ResponseBattleActions(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_BATTLE_ACTIONS_VALUE, status, sessionId, sender, datas);
		builder = RESPONSE_BATTLE_ACTIONS.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseBattleActions() {
		super();
		builder = RESPONSE_BATTLE_ACTIONS.newBuilder();
		messageId = MessageId.MI_RESPONSE_BATTLE_ACTIONS_VALUE;
	}

	/**
	 * 
	 * @param	actions
	 * 			<u>do not has any annotate.</u>
	 */
	public void setActions(Iterable<VoBattleAction> actions) {
		List<VO_BATTLE_ACTION> list = Lists.newLinkedList();
		for (VoBattleAction vo : actions) {
			list.add(vo.getVO_BATTLE_ACTION());
		}
		builder.addAllActions(list);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VoBattleAction> getActionsList() {
		List<VO_BATTLE_ACTION> list = builder.getActionsList();
		List<VoBattleAction> ret = Lists.newArrayListWithCapacity(list.size());
		for (VO_BATTLE_ACTION vo : list) {
			ret.add(new VoBattleAction(vo));
		}
		return ret;
	}

	public RESPONSE_BATTLE_ACTIONS getResponseBattleActions() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
