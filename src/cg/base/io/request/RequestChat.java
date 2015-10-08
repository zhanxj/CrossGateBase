package cg.base.io.request;

import java.io.InputStream;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoRequest;
import cg.base.io.proto.ChatProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestChat extends ProtoRequest {

	private REQUEST_CHAT requestChat;

	public RequestChat(int receiveMessageId, byte[] datas, ISender sender, String sessionId, REQUEST_CHAT requestChat) {
		super(receiveMessageId, datas, sender, sessionId);
		this.requestChat = requestChat;
	}

	public RequestChat(int receiveMessageId, InputStream is, int contentLength, ISender sender, String sessionId, REQUEST_CHAT requestChat) throws Exception {
		super(receiveMessageId, is, contentLength, sender, sessionId);
		this.requestChat = requestChat;
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Integer getTargetId() {
		return requestChat.getTargetId();
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Integer getChannel() {
		return requestChat.getChannel();
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getText() {
		return requestChat.getText();
	}

	public REQUEST_CHAT getRequestChat() {
		return requestChat;
	}

	@Override
	public byte[] getByteArray() {
		return requestChat.toByteArray();
	}

}
