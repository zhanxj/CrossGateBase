package cg.base.io.message;

import net.io.ISender;
import net.io.message.ByteArrayMessage;
import cg.base.io.proto.AccountProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseServerSelect extends ByteArrayMessage {

	private RESPONSE_SERVER_SELECT.Builder builder;

	public ResponseServerSelect(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_SERVER_SELECT_VALUE, status, sessionId, sender, datas);
		builder = RESPONSE_SERVER_SELECT.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseServerSelect() {
		super();
		builder = RESPONSE_SERVER_SELECT.newBuilder();
		messageId = MessageId.MI_RESPONSE_SERVER_SELECT_VALUE;
	}

	/**
	 * 
	 * @param	url
	 * 			<u>do not has any annotate.</u>
	 */
	public void setUrl(String url) {
		builder.setUrl(url);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getUrl() {
		return builder.getUrl();
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

	public RESPONSE_SERVER_SELECT getResponseServerSelect() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
