package cg.base.io.request;

import java.io.InputStream;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoRequest;
import cg.base.io.proto.OptionProtos.REQUEST_OPTIONS_SET;
import cg.base.io.proto.VOProtos.VO_OPTION;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestOptionsSetRequest extends ProtoRequest {

	private REQUEST_OPTIONS_SET requestOptionsSet;

	public RequestOptionsSetRequest(int receiveMessageId, byte[] datas, ISender sender, String sessionId, REQUEST_OPTIONS_SET requestOptionsSet) {
		super(receiveMessageId, datas, sender, sessionId);
		this.requestOptionsSet = requestOptionsSet;
	}

	public RequestOptionsSetRequest(int receiveMessageId, InputStream is, int contentLength, ISender sender, String sessionId, REQUEST_OPTIONS_SET requestOptionsSet) throws Exception {
		super(receiveMessageId, is, contentLength, sender, sessionId);
		this.requestOptionsSet = requestOptionsSet;
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VO_OPTION getOption() {
		return requestOptionsSet.getOption();
	}

	public REQUEST_OPTIONS_SET getRequestOptionsSet() {
		return requestOptionsSet;
	}

	@Override
	public byte[] getByteArray() {
		return requestOptionsSet.toByteArray();
	}

}
