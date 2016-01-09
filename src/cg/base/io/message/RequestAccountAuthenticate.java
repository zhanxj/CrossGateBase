package cg.base.io.message;

import net.io.ISender;
import net.message.ByteArrayMessage;
import cg.base.io.proto.ServerProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestAccountAuthenticate extends ByteArrayMessage {

	private REQUEST_ACCOUNT_AUTHENTICATE.Builder builder;

	public RequestAccountAuthenticate(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_REQUEST_ACCOUNT_AUTHENTICATE_VALUE, status, sessionId, sender, datas);
		builder = REQUEST_ACCOUNT_AUTHENTICATE.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public RequestAccountAuthenticate() {
		super();
		builder = REQUEST_ACCOUNT_AUTHENTICATE.newBuilder();
		messageId = MessageId.MI_REQUEST_ACCOUNT_AUTHENTICATE_VALUE;
	}

	/**
	 * 
	 * @param	accountId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setAccountId(Integer accountId) {
		builder.setAccountId(accountId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getAccountId() {
		return builder.getAccountId();
	}

	/**
	 * 
	 * @param	ip
	 * 			<u>do not has any annotate.</u>
	 */
	public void setIp(String ip) {
		builder.setIp(ip);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getIp() {
		return builder.getIp();
	}

	/**
	 * 
	 * @param	imoney
	 * 			<u>do not has any annotate.</u>
	 */
	public void setImoney(Integer imoney) {
		builder.setImoney(imoney);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getImoney() {
		return builder.getImoney();
	}

	/**
	 * 
	 * @param	key
	 * 			<u>do not has any annotate.</u>
	 */
	public void setKey(String key) {
		builder.setKey(key);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getKey() {
		return builder.getKey();
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

	public REQUEST_ACCOUNT_AUTHENTICATE getRequestAccountAuthenticate() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
