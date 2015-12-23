package cg.base.io.message;

import net.io.ISender;
import net.io.message.ByteArrayMessage;
import cg.base.io.proto.PlayerProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestPlayerQuery extends ByteArrayMessage {

	private REQUEST_PLAYER_QUERY.Builder builder;

	public RequestPlayerQuery(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_REQUEST_PLAYER_QUERY_VALUE, status, sessionId, sender, datas);
		builder = REQUEST_PLAYER_QUERY.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public RequestPlayerQuery() {
		super();
		builder = REQUEST_PLAYER_QUERY.newBuilder();
		messageId = MessageId.MI_REQUEST_PLAYER_QUERY_VALUE;
	}

	/**
	 * 
	 * @param	roleId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setRoleId(Integer roleId) {
		builder.setRoleId(roleId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getRoleId() {
		return builder.getRoleId();
	}

	public REQUEST_PLAYER_QUERY getRequestPlayerQuery() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
