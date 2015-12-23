package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ByteArrayMessage;
import cg.base.io.proto.PlayerProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestPlayerAnimationInfo extends ByteArrayMessage {

	private REQUEST_PLAYER_ANIMATION_INFO.Builder builder;

	public RequestPlayerAnimationInfo(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_REQUEST_PLAYER_ANIMATION_INFO_VALUE, status, sessionId, sender, datas);
		builder = REQUEST_PLAYER_ANIMATION_INFO.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public RequestPlayerAnimationInfo() {
		super();
		builder = REQUEST_PLAYER_ANIMATION_INFO.newBuilder();
		messageId = MessageId.MI_REQUEST_PLAYER_ANIMATION_INFO_VALUE;
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
