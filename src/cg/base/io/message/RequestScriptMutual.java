package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.ScriptProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestScriptMutual extends ProtoMessage {

	private REQUEST_SCRIPT_MUTUAL.Builder builder;

	public RequestScriptMutual(int messageId, int status, String sessionId, ISender sender, REQUEST_SCRIPT_MUTUAL.Builder builder) {
		super(messageId, status, sessionId, sender, null);
		this.builder = builder;
	}

	/**
	 * 
	 * @param	op
	 * 			<u>do not has any annotate.</u>
	 */
	public void setOp(Integer op) {
		builder.setOp(op);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getOp() {
		return builder.getOp();
	}

	/**
	 * 
	 * @param	dir
	 * 			<u>do not has any annotate.</u>
	 */
	public void setDir(Integer dir) {
		builder.setDir(dir);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getDir() {
		return builder.getDir();
	}

	public REQUEST_SCRIPT_MUTUAL getRequestScriptMutual() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
