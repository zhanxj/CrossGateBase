package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.AccountProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestAccountChangePassword extends ProtoMessage {

	private REQUEST_ACCOUNT_CHANGE_PASSWORD.Builder builder;

	public RequestAccountChangePassword(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_REQUEST_ACCOUNT_CHANGE_PASSWORD_VALUE, status, sessionId, sender, datas);
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public RequestAccountChangePassword() {
		super();
		messageId = MessageId.MI_REQUEST_ACCOUNT_CHANGE_PASSWORD_VALUE;
	}

	/**
	 * 
	 * @param	oldPassword
	 * 			<u>do not has any annotate.</u>
	 */
	public void setOldPassword(String oldPassword) {
		builder.setOldPassword(oldPassword);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getOldPassword() {
		String ret = builder.getOldPassword();
		return ret;
	}

	/**
	 * 
	 * @param	newPassword
	 * 			<u>do not has any annotate.</u>
	 */
	public void setNewPassword(String newPassword) {
		builder.setNewPassword(newPassword);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getNewPassword() {
		String ret = builder.getNewPassword();
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

	public REQUEST_ACCOUNT_CHANGE_PASSWORD getRequestAccountChangePassword() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
