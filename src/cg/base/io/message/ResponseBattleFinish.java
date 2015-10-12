package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.BattleProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;
import cg.base.io.proto.VOProtos.*;
import com.google.common.collect.Lists;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseBattleFinish extends ProtoMessage {

	private RESPONSE_BATTLE_FINISH.Builder builder;

	public ResponseBattleFinish(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_BATTLE_FINISH_VALUE, status, sessionId, sender, datas);
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseBattleFinish() {
		super();
		messageId = MessageId.MI_RESPONSE_BATTLE_FINISH_VALUE;
	}

	/**
	 * 
	 * @param	gains
	 * 			<u>do not has any annotate.</u>
	 */
	public void setGains(Iterable<VoGains> gains) {
		List<VO_GAINS> list = Lists.newLinkedList();
		for (VoGains vo : gains) {
			list.add(vo.getVO_GAINS());
		}
		builder.addAllGains(list);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VoGains> getGainsList() {
		List<VO_GAINS> list = builder.getGainsList();
		List<VoGains> ret = Lists.newArrayListWithCapacity(list.size());
		for (VO_GAINS vo : list) {
			ret.add(new VoGains(vo));
		}
		return ret;
	}

	/**
	 * 
	 * @param	isWin
	 * 			<u>do not has any annotate.</u>
	 */
	public void setIsWin(Boolean isWin) {
		builder.setIsWin(isWin);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Boolean getIsWin() {
		Boolean ret = builder.getIsWin();
		return ret;
	}

	public RESPONSE_BATTLE_FINISH getResponseBattleFinish() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
