package cg.base.io.response;

import net.io.protocal.proto.ProtoResponse;
import cg.base.io.proto.PlayerProtos.*;
import com.google.protobuf.InvalidProtocolBufferException;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RESPONSE_PLAYER_CREATE_INFOResponse extends ProtoResponse {

	private RESPONSE_PLAYER_CREATE_INFO.Builder builder = RESPONSE_PLAYER_CREATE_INFO.newBuilder();

	public RESPONSE_PLAYER_CREATE_INFO getRESPONSE_PLAYER_CREATE_INFO() {
		return builder.build();
	}

	/**
	 * 
	 * @param	animations
	 * 			<u>do not has any annotate.</u>
	 */
	public void setAnimations(Iterable<VO_PLAYER_ANIMATIONS> animations) {
		builder.addAllAnimations(animations);
	}

	/**
	 * 
	 * @param	bp
	 * 			<u>do not has any annotate.</u>
	 */
	public void setBp(Integer bp) {
		builder.setBp(bp);
	}

	/**
	 * 
	 * @param	pageMax
	 * 			<u>do not has any annotate.</u>
	 */
	public void setPageMax(Integer pageMax) {
		builder.setPageMax(pageMax);
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
