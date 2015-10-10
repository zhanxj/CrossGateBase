package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.PlayerProtos.*;
import com.google.common.collect.Lists;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponsePlayerAnimationInfo extends ProtoMessage {

	private RESPONSE_PLAYER_ANIMATION_INFO.Builder builder;

	public ResponsePlayerAnimationInfo(int messageId, int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(messageId, status, sessionId, sender, datas);
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponsePlayerAnimationInfo() {
		super();
	}

	/**
	 * 
	 * @param	animationInfos
	 * 			<u>do not has any annotate.</u>
	 */
	public void setAnimationInfos(Iterable<VoPlayerAnimationInfo> animationInfos) {
		List<VO_PLAYER_ANIMATION_INFO> list = Lists.newLinkedList();
		for (VoPlayerAnimationInfo vo : animationInfos) {
			list.add(vo.getVO_PLAYER_ANIMATION_INFO());
		}
		builder.addAllAnimationInfos(list);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VoPlayerAnimationInfo> getAnimationInfosList() {
		List<VO_PLAYER_ANIMATION_INFO> list = builder.getAnimationInfosList();
		List<VoPlayerAnimationInfo> ret = Lists.newArrayListWithCapacity(list.size());
		for (VO_PLAYER_ANIMATION_INFO vo : list) {
			ret.add(new VoPlayerAnimationInfo(vo));
		}
		return ret;
	}

	/**
	 * 
	 * @param	totalPage
	 * 			<u>do not has any annotate.</u>
	 */
	public void setTotalPage(Integer totalPage) {
		builder.setTotalPage(totalPage);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getTotalPage() {
		int ret = builder.getTotalPage();		return ret;
	}

	public RESPONSE_PLAYER_ANIMATION_INFO getResponsePlayerAnimationInfo() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
