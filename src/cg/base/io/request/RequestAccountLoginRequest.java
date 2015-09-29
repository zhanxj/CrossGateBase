package cg.base.io.request;

import java.io.InputStream;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoRequest;
import cg.base.io.proto.AccountProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestAccountLoginRequest extends ProtoRequest {

	private REQUEST_ACCOUNT_LOGIN requestAccountLogin;

	public RequestAccountLoginRequest(int receiveMessageId, byte[] datas, ISender sender, String sessionId, REQUEST_ACCOUNT_LOGIN requestAccountLogin) {
		super(receiveMessageId, datas, sender, sessionId);
		this.requestAccountLogin = requestAccountLogin;
	}

	public RequestAccountLoginRequest(int receiveMessageId, InputStream is, int contentLength, ISender sender, String sessionId, REQUEST_ACCOUNT_LOGIN requestAccountLogin) throws Exception {
		super(receiveMessageId, is, contentLength, sender, sessionId);
		this.requestAccountLogin = requestAccountLogin;
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getPassword() {
		return requestAccountLogin.getPassword();
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getAccount() {
		return requestAccountLogin.getAccount();
	}

	public REQUEST_ACCOUNT_LOGIN getRequestAccountLogin() {
		return requestAccountLogin;
	}

	@Override
	public byte[] getByteArray() {
		return requestAccountLogin.toByteArray();
	}

}
