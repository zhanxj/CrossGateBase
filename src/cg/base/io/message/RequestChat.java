package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.ChatProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestChat extends ProtoMessage {

	private REQUEST_CHAT.Builder builder;

	public RequestChat(int messageId, int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(messageId, status, sessionId, sender, datas);
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	/**
	 * 
	 * @param	targetId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setTargetId(Integer targetId) {
		builder.setTargetId(targetId);
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
