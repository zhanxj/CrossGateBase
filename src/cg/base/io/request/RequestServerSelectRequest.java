package cg.base.io.request;

import java.io.InputStream;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoRequest;
import cg.base.io.proto.AccountProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestServerSelectRequest extends ProtoRequest {

	private REQUEST_SERVER_SELECT requestServerSelect;

	public RequestServerSelectRequest(int receiveMessageId, byte[] datas, ISender sender, String sessionId, REQUEST_SERVER_SELECT requestServerSelect) {
		super(receiveMessageId, datas, sender, sessionId);
		this.requestServerSelect = requestServerSelect;
	}

	public RequestServerSelectRequest(int receiveMessageId, InputStream is, int contentLength, ISender sender, String sessionId, REQUEST_SERVER_SELECT requestServerSelect) throws Exception {
		super(receiveMessageId, is, contentLength, sender, sessionId);
		this.requestServerSelect = requestServerSelect;
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Integer getId() {
		return requestServerSelect.getId();
	}

	public REQUEST_SERVER_SELECT getRequestServerSelect() {
		return requestServerSelect;
	}

	@Override
	public byte[] getByteArray() {
		return requestServerSelect.toByteArray();
	}

}
