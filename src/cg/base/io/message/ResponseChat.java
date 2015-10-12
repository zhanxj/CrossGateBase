package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.ChatProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseChat extends ProtoMessage {

	private RESPONSE_CHAT.Builder builder;

	public ResponseChat(int messageId, int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(messageId, status, sessionId, sender, datas);
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseChat() {
		super();
	}

	/**
	 * 
	 * @param	sourceId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setSourceId(Integer sourceId) {
		builder.setSourceId(sourceId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getSourceId() {
		int ret = builder.getSourceId();
		return ret;
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
		int ret = builder.getChannel();
		return ret;
	}

	/**
	 * 
	 * @param	souceName
	 * 			<u>do not has any annotate.</u>
	 */
	public void setSouceName(String souceName) {
		builder.setSouceName(souceName);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getSouceName() {
		String ret = builder.getSouceName();
		return ret;
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
		String ret = builder.getText();
		return ret;
	}

	public RESPONSE_CHAT getResponseChat() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
