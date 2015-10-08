package cg.base.io.response;

import net.io.protocal.proto.ProtoResponse;
import cg.base.io.proto.OptionProtos.*;
import com.google.protobuf.InvalidProtocolBufferException;

import cg.base.io.proto.VOProtos.*;
/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseOptionsSet extends ProtoResponse {

	private RESPONSE_OPTIONS_SET.Builder builder = RESPONSE_OPTIONS_SET.newBuilder();

	public RESPONSE_OPTIONS_SET getRESPONSE_OPTIONS_SET() {
		return builder.build();
	}

	/**
	 * 
	 * @param	name
	 * 			<u>do not has any annotate.</u>
	 */
	public void setName(String name) {
		builder.setName(name);
	}

	/**
	 * 
	 * @param	option
	 * 			<u>do not has any annotate.</u>
	 */
	public void setOption(VO_OPTION option) {
		builder.setOption(option);
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
