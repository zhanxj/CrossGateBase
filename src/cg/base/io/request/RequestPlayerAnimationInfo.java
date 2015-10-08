package cg.base.io.request;

import java.io.InputStream;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoRequest;
import cg.base.io.proto.PlayerProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestPlayerAnimationInfo extends ProtoRequest {

	private REQUEST_PLAYER_ANIMATION_INFO requestPlayerAnimationInfo;

	public RequestPlayerAnimationInfo(int receiveMessageId, byte[] datas, ISender sender, String sessionId, REQUEST_PLAYER_ANIMATION_INFO requestPlayerAnimationInfo) {
		super(receiveMessageId, datas, sender, sessionId);
		this.requestPlayerAnimationInfo = requestPlayerAnimationInfo;
	}

	public RequestPlayerAnimationInfo(int receiveMessageId, InputStream is, int contentLength, ISender sender, String sessionId, REQUEST_PLAYER_ANIMATION_INFO requestPlayerAnimationInfo) throws Exception {
		super(receiveMessageId, is, contentLength, sender, sessionId);
		this.requestPlayerAnimationInfo = requestPlayerAnimationInfo;
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Integer getPage() {
		return requestPlayerAnimationInfo.getPage();
	}

	public REQUEST_PLAYER_ANIMATION_INFO getRequestPlayerAnimationInfo() {
		return requestPlayerAnimationInfo;
	}

	@Override
	public byte[] getByteArray() {
		return requestPlayerAnimationInfo.toByteArray();
	}

}
