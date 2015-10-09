package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.PlayerProtos.*;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponsePlayerCreateInfo extends ProtoMessage {

	private RESPONSE_PLAYER_CREATE_INFO.Builder builder;

	public ResponsePlayerCreateInfo(int messageId, int status, String sessionId, ISender sender, RESPONSE_PLAYER_CREATE_INFO.Builder builder) {
		super(messageId, status, sessionId, sender, null);
		this.builder = builder;
	}

	/**
	 * 
	 * @param	animations
	 * 			<u>do not has any annotate.</u>
	 */
	public void setAnimations(Iterable<VO_PLAYER_ANIMATIONS> animations) {
		builder.addAllAnimations(animations);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VO_PLAYER_ANIMATIONS> getAnimationsList() {
		return builder.getAnimationsList();
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
		return builder.getBp();
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
		return builder.getPageMax();
	}

	public RESPONSE_PLAYER_CREATE_INFO getResponsePlayerCreateInfo() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
