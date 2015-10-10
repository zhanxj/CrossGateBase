package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.AccountProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseServerSelect extends ProtoMessage {

	private RESPONSE_SERVER_SELECT.Builder builder;

	public ResponseServerSelect(int messageId, int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(messageId, status, sessionId, sender, datas);
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseServerSelect() {
		super();
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

	public RESPONSE_SERVER_SELECT getResponseServerSelect() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
