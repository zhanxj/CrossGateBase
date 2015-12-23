package cg.base.io.message;

import net.dipatch.ISender;
import net.io.message.ByteArrayMessage;
import cg.base.io.proto.ChatProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestChat extends ByteArrayMessage {

	private REQUEST_CHAT.Builder builder;

	public RequestChat(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_REQUEST_CHAT_VALUE, status, sessionId, sender, datas);
		builder = REQUEST_CHAT.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public RequestChat() {
		super();
		builder = REQUEST_CHAT.newBuilder();
		messageId = MessageId.MI_REQUEST_CHAT_VALUE;
	}

	/**
	 * 
	 * @param	targetId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setTargetId(Integer targetId) {
		if (targetId != null) {
			builder.setTargetId(targetId);
		}
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getTargetId() {
		return builder.getTargetId();
	}

	/**
	 * 
	 * @param	channel
	 * 			<u>do not has any annotate.</u>
	 */
	public void setChannel(Integer channel) {
		builder.setChannel(channel);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getChannel() {
		return builder.getChannel();
	}

	/**
	 * 
	 * @param	text
	 * 			<u>do not has any annotate.</u>
	 */
	public void setText(String text) {
		builder.setText(text);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getText() {
		return builder.getText();
	}

	public REQUEST_CHAT getRequestChat() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
