package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.AccountProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestServerSelect extends ProtoMessage {

	private REQUEST_SERVER_SELECT.Builder builder;

	public RequestServerSelect(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_REQUEST_SERVER_SELECT_VALUE, status, sessionId, sender, datas);
		builder = REQUEST_SERVER_SELECT.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public RequestServerSelect() {
		super();
		builder = REQUEST_SERVER_SELECT.newBuilder();
		messageId = MessageId.MI_REQUEST_SERVER_SELECT_VALUE;
	}

	/**
	 * 
	 * @param	id
	 * 			<u>do not has any annotate.</u>
	 */
	public void setId(Integer id) {
		builder.setId(id);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getId() {
		int ret = builder.getId();
		return ret;
	}

	public REQUEST_SERVER_SELECT getRequestServerSelect() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
