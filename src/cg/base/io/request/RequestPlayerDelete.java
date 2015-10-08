package cg.base.io.request;

import java.io.InputStream;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoRequest;
import cg.base.io.proto.PlayerProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestPlayerDelete extends ProtoRequest {

	private REQUEST_PLAYER_DELETE requestPlayerDelete;

	public RequestPlayerDelete(int receiveMessageId, byte[] datas, ISender sender, String sessionId, REQUEST_PLAYER_DELETE requestPlayerDelete) {
		super(receiveMessageId, datas, sender, sessionId);
		this.requestPlayerDelete = requestPlayerDelete;
	}

	public RequestPlayerDelete(int receiveMessageId, InputStream is, int contentLength, ISender sender, String sessionId, REQUEST_PLAYER_DELETE requestPlayerDelete) throws Exception {
		super(receiveMessageId, is, contentLength, sender, sessionId);
		this.requestPlayerDelete = requestPlayerDelete;
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Integer getRoleId() {
		return requestPlayerDelete.getRoleId();
	}

	public REQUEST_PLAYER_DELETE getRequestPlayerDelete() {
		return requestPlayerDelete;
	}

	@Override
	public byte[] getByteArray() {
		return requestPlayerDelete.toByteArray();
	}

}
