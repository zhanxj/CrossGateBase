package cg.base.io.response;

import net.io.protocal.proto.ProtoResponse;
import cg.base.io.proto.PlayerProtos.*;
import com.google.protobuf.InvalidProtocolBufferException;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponsePlayerAnimationInfo extends ProtoResponse {

	private RESPONSE_PLAYER_ANIMATION_INFO.Builder builder = RESPONSE_PLAYER_ANIMATION_INFO.newBuilder();

	public RESPONSE_PLAYER_ANIMATION_INFO getRESPONSE_PLAYER_ANIMATION_INFO() {
		return builder.build();
	}

	/**
	 * 
	 * @param	animationInfos
	 * 			<u>do not has any annotate.</u>
	 */
	public void setAnimationInfos(Iterable<VO_PLAYER_ANIMATION_INFO> animationInfos) {
		builder.addAllAnimationInfos(animationInfos);
	}

	/**
	 * 
	 * @param	totalPage
	 * 			<u>do not has any annotate.</u>
	 */
	public void setTotalPage(Integer totalPage) {
		builder.setTotalPage(totalPage);
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
