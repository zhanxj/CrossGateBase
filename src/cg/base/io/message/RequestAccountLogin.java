package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.AccountProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestAccountLogin extends ProtoMessage {

	private REQUEST_ACCOUNT_LOGIN.Builder builder;

	public RequestAccountLogin(int messageId, int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(messageId, status, sessionId, sender, datas);
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	/**
	 * 
	 * @param	password
	 * 			<u>do not has any annotate.</u>
	 */
	public void setPassword(String password) {
		builder.setPassword(password);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getPassword() {
		return builder.getPassword();
	}

	/**
	 * 
	 * @param	account
	 * 			<u>do not has any annotate.</u>
	 */
	public void setAccount(String account) {
		builder.setAccount(account);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getAccount() {
		return builder.getAccount();
	}

	public REQUEST_ACCOUNT_LOGIN getRequestAccountLogin() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
