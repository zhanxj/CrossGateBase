package cg.base.io.request;

import java.io.InputStream;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoRequest;
import cg.base.io.proto.ScriptProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestScriptMutual extends ProtoRequest {

	private REQUEST_SCRIPT_MUTUAL requestScriptMutual;

	public RequestScriptMutual(int receiveMessageId, byte[] datas, ISender sender, String sessionId, REQUEST_SCRIPT_MUTUAL requestScriptMutual) {
		super(receiveMessageId, datas, sender, sessionId);
		this.requestScriptMutual = requestScriptMutual;
	}

	public RequestScriptMutual(int receiveMessageId, InputStream is, int contentLength, ISender sender, String sessionId, REQUEST_SCRIPT_MUTUAL requestScriptMutual) throws Exception {
		super(receiveMessageId, is, contentLength, sender, sessionId);
		this.requestScriptMutual = requestScriptMutual;
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Integer getOp() {
		return requestScriptMutual.getOp();
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Integer getDir() {
		return requestScriptMutual.getDir();
	}

	public REQUEST_SCRIPT_MUTUAL getRequestScriptMutual() {
		return requestScriptMutual;
	}

	@Override
	public byte[] getByteArray() {
		return requestScriptMutual.toByteArray();
	}

}
