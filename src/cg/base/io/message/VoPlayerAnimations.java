package cg.base.io.message;

import cg.base.io.proto.PlayerProtos.*;
import com.google.common.collect.Lists;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoPlayerAnimations {

	private VO_PLAYER_ANIMATIONS vo;

	private VO_PLAYER_ANIMATIONS.Builder builder;

	public VoPlayerAnimations(VO_PLAYER_ANIMATIONS vo) {
		this.vo = vo;
	}

	public VoPlayerAnimations() {
		builder = VO_PLAYER_ANIMATIONS.newBuilder();
	}

	/**
	 * 
	 * @param	animations
	 * 			<u>do not has any annotate.</u>
	 */
	public void setAnimations(Iterable<VoPlayerAnimation> animations) {
		List<VO_PLAYER_ANIMATION> list = Lists.newLinkedList();
		for (VoPlayerAnimation vo : animations) {
			list.add(vo.getVO_PLAYER_ANIMATION());
		}
		builder.addAllAnimations(list);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VoPlayerAnimation> getAnimationsList() {
		List<VO_PLAYER_ANIMATION> list = vo.getAnimationsList();
		List<VoPlayerAnimation> ret = Lists.newArrayListWithCapacity(list.size());
		for (VO_PLAYER_ANIMATION vo : list) {
			ret.add(new VoPlayerAnimation(vo));
		}
		return ret;
	}

	public VO_PLAYER_ANIMATIONS getVO_PLAYER_ANIMATIONS() {
		return vo == null ? builder.build() : vo;
	}

}
