package cg.base.io.message;

import cg.base.io.proto.PlayerProtos.*;
import com.google.common.collect.Lists;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoPlayerAnimationInfos {

	private VO_PLAYER_ANIMATION_INFOS vo;

	private VO_PLAYER_ANIMATION_INFOS.Builder builder;

	public VoPlayerAnimationInfos(VO_PLAYER_ANIMATION_INFOS vo) {
		this.vo = vo;
	}

	public VoPlayerAnimationInfos() {
		builder = VO_PLAYER_ANIMATION_INFOS.newBuilder();
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
		List<VO_PLAYER_ANIMATION_INFO> list = vo.getAnimationInfosList();
		List<VoPlayerAnimationInfo> ret = Lists.newArrayListWithCapacity(list.size());
		for (VO_PLAYER_ANIMATION_INFO vo : list) {
			ret.add(new VoPlayerAnimationInfo(vo));
		}
		return ret;
	}

	public VO_PLAYER_ANIMATION_INFOS getVO_PLAYER_ANIMATION_INFOS() {
		return vo == null ? builder.build() : vo;
	}

}
