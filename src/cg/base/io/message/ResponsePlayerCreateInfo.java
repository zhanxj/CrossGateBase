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
public class ResponsePlayerCreateInfo extends ProtoMessage {

	private RESPONSE_PLAYER_CREATE_INFO.Builder builder;

	public ResponsePlayerCreateInfo(int messageId, int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(messageId, status, sessionId, sender, datas);
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponsePlayerCreateInfo() {
		super();
	}

	/**
	 * 
	 * @param	animations
	 * 			<u>do not has any annotate.</u>
	 */
	public void setAnimations(Iterable<VoPlayerAnimations> animations) {
		List<VO_PLAYER_ANIMATIONS> list = Lists.newLinkedList();
		for (VoPlayerAnimations vo : animations) {
			list.add(vo.getVO_PLAYER_ANIMATIONS());
		}
		builder.addAllAnimations(list);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VoPlayerAnimations> getAnimationsList() {
		List<VO_PLAYER_ANIMATIONS> list = builder.getAnimationsList();
		List<VoPlayerAnimations> ret = Lists.newArrayListWithCapacity(list.size());
		for (VO_PLAYER_ANIMATIONS vo : list) {
			ret.add(new VoPlayerAnimations(vo));
		}
		return ret;
	}

	/**
	 * 
	 * @param	bp
	 * 			<u>do not has any annotate.</u>
	 */
	public void setBp(Integer bp) {
		builder.setBp(bp);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getBp() {
		int ret = builder.getBp();
		return ret;
	}

	/**
	 * 
	 * @param	pageMax
	 * 			<u>do not has any annotate.</u>
	 */
	public void setPageMax(Integer pageMax) {
		builder.setPageMax(pageMax);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getPageMax() {
		int ret = builder.getPageMax();
		return ret;
	}

	public RESPONSE_PLAYER_CREATE_INFO getResponsePlayerCreateInfo() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
