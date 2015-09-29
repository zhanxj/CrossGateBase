package cg.base.io.request;

import java.io.InputStream;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoRequest;
import cg.base.io.proto.PlayerProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestPlayerLoginRequest extends ProtoRequest {

	private REQUEST_PLAYER_LOGIN requestPlayerLogin;

	public RequestPlayerLoginRequest(int receiveMessageId, byte[] datas, ISender sender, String sessionId, REQUEST_PLAYER_LOGIN requestPlayerLogin) {
		super(receiveMessageId, datas, sender, sessionId);
		this.requestPlayerLogin = requestPlayerLogin;
	}

	public RequestPlayerLoginRequest(int receiveMessageId, InputStream is, int contentLength, ISender sender, String sessionId, REQUEST_PLAYER_LOGIN requestPlayerLogin) throws Exception {
		super(receiveMessageId, is, contentLength, sender, sessionId);
		this.requestPlayerLogin = requestPlayerLogin;
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Integer getRoleId() {
		return requestPlayerLogin.getRoleId();
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Integer getHeadVersion() {
		return requestPlayerLogin.getHeadVersion();
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Integer getEyeShot() {
		return requestPlayerLogin.getEyeShot();
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Integer getAnimationVersion() {
		return requestPlayerLogin.getAnimationVersion();
	}

	public REQUEST_PLAYER_LOGIN getRequestPlayerLogin() {
		return requestPlayerLogin;
	}

	@Override
	public byte[] getByteArray() {
		return requestPlayerLogin.toByteArray();
	}

}
