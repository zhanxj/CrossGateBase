package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.PlayerProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestPlayerAnimationInfo extends ProtoMessage {

	private REQUEST_PLAYER_ANIMATION_INFO.Builder builder;

	public RequestPlayerAnimationInfo(int messageId, int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(messageId, status, sessionId, sender, datas);
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public RequestPlayerAnimationInfo() {
		super();
	}

	/**
	 * 
	 * @param	page
	 * 			<u>do not has any annotate.</u>
	 */
	public void setPage(Integer page) {
		builder.setPage(page);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getPage() {
		return builder.getPage();
	}

	public REQUEST_PLAYER_ANIMATION_INFO getRequestPlayerAnimationInfo() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
