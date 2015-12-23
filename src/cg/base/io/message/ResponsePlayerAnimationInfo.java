package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ByteArrayMessage;
import cg.base.io.proto.PlayerProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;
import com.google.common.collect.Lists;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponsePlayerAnimationInfo extends ByteArrayMessage {

	private RESPONSE_PLAYER_ANIMATION_INFO.Builder builder;

	public ResponsePlayerAnimationInfo(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_PLAYER_ANIMATION_INFO_VALUE, status, sessionId, sender, datas);
		builder = RESPONSE_PLAYER_ANIMATION_INFO.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponsePlayerAnimationInfo() {
		super();
		builder = RESPONSE_PLAYER_ANIMATION_INFO.newBuilder();
		messageId = MessageId.MI_RESPONSE_PLAYER_ANIMATION_INFO_VALUE;
	}

	/**
	 * 
	 * @param	animationInfos
	 * 			<u>do not has any annotate.</u>
	 */
	public void setAnimationInfos(Iterable<VoPlayerAnimationInfos> animationInfos) {
		List<VO_PLAYER_ANIMATION_INFOS> list = Lists.newLinkedList();
		for (VoPlayerAnimationInfos vo : animationInfos) {
			list.add(vo.getVO_PLAYER_ANIMATION_INFOS());
		}
		builder.addAllAnimationInfos(list);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VoPlayerAnimationInfos> getAnimationInfosList() {
		List<VO_PLAYER_ANIMATION_INFOS> list = builder.getAnimationInfosList();
		List<VoPlayerAnimationInfos> ret = Lists.newArrayListWithCapacity(list.size());
		for (VO_PLAYER_ANIMATION_INFOS vo : list) {
			ret.add(new VoPlayerAnimationInfos(vo));
		}
		return ret;
	}

	public RESPONSE_PLAYER_ANIMATION_INFO getResponsePlayerAnimationInfo() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
