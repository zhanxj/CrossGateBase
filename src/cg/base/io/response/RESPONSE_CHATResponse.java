package cg.base.io.response;

import net.io.protocal.proto.ProtoResponse;
import cg.base.io.proto.ChatProtos.*;
import com.google.protobuf.InvalidProtocolBufferException;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RESPONSE_CHATResponse extends ProtoResponse {

	private RESPONSE_CHAT.Builder builder = RESPONSE_CHAT.newBuilder();

	public RESPONSE_CHAT getRESPONSE_CHAT() {
		return builder.build();
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
	 * @param	channel
	 * 			<u>do not has any annotate.</u>
	 */
	public void setChannel(Integer channel) {
		builder.setChannel(channel);
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
	 * @param	text
	 * 			<u>do not has any annotate.</u>
	 */
	public void setText(String text) {
		builder.setText(text);
	}

	@Override
	public void mergeFrom(byte[] data) throws InvalidProtocolBufferException {
		builder.mergeFrom(data);
	}

	@Override
	public void setError(int errorCode, String errorMsg) {
	}

	@Override
	public boolean hasError() {
		return false;
	}

}
