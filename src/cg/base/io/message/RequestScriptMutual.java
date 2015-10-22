package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.ScriptProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestScriptMutual extends ProtoMessage {

	private REQUEST_SCRIPT_MUTUAL.Builder builder;

	public RequestScriptMutual(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_REQUEST_SCRIPT_MUTUAL_VALUE, status, sessionId, sender, datas);
		builder = REQUEST_SCRIPT_MUTUAL.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public RequestScriptMutual() {
		super();
		builder = REQUEST_SCRIPT_MUTUAL.newBuilder();
		messageId = MessageId.MI_REQUEST_SCRIPT_MUTUAL_VALUE;
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
