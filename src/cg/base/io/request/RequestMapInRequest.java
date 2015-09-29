package cg.base.io.request;

import java.io.InputStream;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoRequest;
import cg.base.io.proto.MapProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestMapInRequest extends ProtoRequest {

	private REQUEST_MAP_IN requestMapIn;

	public RequestMapInRequest(int receiveMessageId, byte[] datas, ISender sender, String sessionId, REQUEST_MAP_IN requestMapIn) {
		super(receiveMessageId, datas, sender, sessionId);
		this.requestMapIn = requestMapIn;
	}

	public RequestMapInRequest(int receiveMessageId, InputStream is, int contentLength, ISender sender, String sessionId, REQUEST_MAP_IN requestMapIn) throws Exception {
		super(receiveMessageId, is, contentLength, sender, sessionId);
		this.requestMapIn = requestMapIn;
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Integer getEast() {
		return requestMapIn.getEast();
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Integer getSouth() {
		return requestMapIn.getSouth();
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Integer getMapId() {
		return requestMapIn.getMapId();
	}

	public REQUEST_MAP_IN getRequestMapIn() {
		return requestMapIn;
	}

	@Override
	public byte[] getByteArray() {
		return requestMapIn.toByteArray();
	}

}
