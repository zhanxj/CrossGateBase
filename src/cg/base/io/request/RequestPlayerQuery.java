package cg.base.io.request;

import java.io.InputStream;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoRequest;
import cg.base.io.proto.PlayerProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestPlayerQuery extends ProtoRequest {

	private REQUEST_PLAYER_QUERY requestPlayerQuery;

	public RequestPlayerQuery(int receiveMessageId, byte[] datas, ISender sender, String sessionId, REQUEST_PLAYER_QUERY requestPlayerQuery) {
		super(receiveMessageId, datas, sender, sessionId);
		this.requestPlayerQuery = requestPlayerQuery;
	}

	public RequestPlayerQuery(int receiveMessageId, InputStream is, int contentLength, ISender sender, String sessionId, REQUEST_PLAYER_QUERY requestPlayerQuery) throws Exception {
		super(receiveMessageId, is, contentLength, sender, sessionId);
		this.requestPlayerQuery = requestPlayerQuery;
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Integer getRoleId() {
		return requestPlayerQuery.getRoleId();
	}

	public REQUEST_PLAYER_QUERY getRequestPlayerQuery() {
		return requestPlayerQuery;
	}

	@Override
	public byte[] getByteArray() {
		return requestPlayerQuery.toByteArray();
	}

}
