package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.AccountProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestAccountRegister extends ProtoMessage {

	private REQUEST_ACCOUNT_REGISTER.Builder builder;

	public RequestAccountRegister(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_REQUEST_ACCOUNT_REGISTER_VALUE, status, sessionId, sender, datas);
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public RequestAccountRegister() {
		super();
		messageId = MessageId.MI_REQUEST_ACCOUNT_REGISTER_VALUE;
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
		String ret = builder.getPassword();
		return ret;
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
		String ret = builder.getAccount();
		return ret;
	}

	public REQUEST_ACCOUNT_REGISTER getRequestAccountRegister() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
