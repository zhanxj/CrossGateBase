package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.AccountProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestAccountRoleList extends ProtoMessage {

	private REQUEST_ACCOUNT_ROLE_LIST.Builder builder;

	public RequestAccountRoleList(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_REQUEST_ACCOUNT_ROLE_LIST_VALUE, status, sessionId, sender, datas);
		builder = REQUEST_ACCOUNT_ROLE_LIST.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public RequestAccountRoleList() {
		super();
		builder = REQUEST_ACCOUNT_ROLE_LIST.newBuilder();
		messageId = MessageId.MI_REQUEST_ACCOUNT_ROLE_LIST_VALUE;
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

	public REQUEST_ACCOUNT_ROLE_LIST getRequestAccountRoleList() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
