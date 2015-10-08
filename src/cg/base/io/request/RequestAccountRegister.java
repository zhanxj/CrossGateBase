package cg.base.io.request;

import java.io.InputStream;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoRequest;
import cg.base.io.proto.AccountProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestAccountRegister extends ProtoRequest {

	private REQUEST_ACCOUNT_REGISTER requestAccountRegister;

	public RequestAccountRegister(int receiveMessageId, byte[] datas, ISender sender, String sessionId, REQUEST_ACCOUNT_REGISTER requestAccountRegister) {
		super(receiveMessageId, datas, sender, sessionId);
		this.requestAccountRegister = requestAccountRegister;
	}

	public RequestAccountRegister(int receiveMessageId, InputStream is, int contentLength, ISender sender, String sessionId, REQUEST_ACCOUNT_REGISTER requestAccountRegister) throws Exception {
		super(receiveMessageId, is, contentLength, sender, sessionId);
		this.requestAccountRegister = requestAccountRegister;
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getPassword() {
		return requestAccountRegister.getPassword();
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getAccount() {
		return requestAccountRegister.getAccount();
	}

	public REQUEST_ACCOUNT_REGISTER getRequestAccountRegister() {
		return requestAccountRegister;
	}

	@Override
	public byte[] getByteArray() {
		return requestAccountRegister.toByteArray();
	}

}
