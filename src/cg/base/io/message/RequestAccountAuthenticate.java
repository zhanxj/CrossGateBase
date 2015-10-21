package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.ServerProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestAccountAuthenticate extends ProtoMessage {

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
		int ret = builder.getAccountId();
		return ret;
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
		String ret = builder.getIp();
		return ret;
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
		int ret = builder.getImoney();
		return ret;
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
		String ret = builder.getKey();
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

	public REQUEST_ACCOUNT_AUTHENTICATE getRequestAccountAuthenticate() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}