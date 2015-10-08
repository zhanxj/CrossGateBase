package cg.base.io.request;

import java.io.InputStream;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoRequest;
import cg.base.io.proto.MapProtos.*;
import cg.base.io.proto.VOProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestMapMove extends ProtoRequest {

	private REQUEST_MAP_MOVE requestMapMove;

	public RequestMapMove(int receiveMessageId, byte[] datas, ISender sender, String sessionId, REQUEST_MAP_MOVE requestMapMove) {
		super(receiveMessageId, datas, sender, sessionId);
		this.requestMapMove = requestMapMove;
	}

	public RequestMapMove(int receiveMessageId, InputStream is, int contentLength, ISender sender, String sessionId, REQUEST_MAP_MOVE requestMapMove) throws Exception {
		super(receiveMessageId, is, contentLength, sender, sessionId);
		this.requestMapMove = requestMapMove;
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Boolean getNeedEast() {
		return requestMapMove.getNeedEast();
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Integer getEast() {
		return requestMapMove.getEast();
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Integer getSouth() {
		return requestMapMove.getSouth();
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VO_MAP_AREA getEastArea() {
		return requestMapMove.getEastArea();
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Boolean getNeedSouth() {
		return requestMapMove.getNeedSouth();
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VO_MAP_AREA getSouthArea() {
		return requestMapMove.getSouthArea();
	}

	public REQUEST_MAP_MOVE getRequestMapMove() {
		return requestMapMove;
	}

	@Override
	public byte[] getByteArray() {
		return requestMapMove.toByteArray();
	}

}
