package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ByteArrayMessage;
import cg.base.io.proto.ScriptProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseScriptChangePal extends ByteArrayMessage {

	private RESPONSE_SCRIPT_CHANGE_PAL.Builder builder;

	public ResponseScriptChangePal(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_SCRIPT_CHANGE_PAL_VALUE, status, sessionId, sender, datas);
		builder = RESPONSE_SCRIPT_CHANGE_PAL.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseScriptChangePal() {
		super();
		builder = RESPONSE_SCRIPT_CHANGE_PAL.newBuilder();
		messageId = MessageId.MI_RESPONSE_SCRIPT_CHANGE_PAL_VALUE;
	}

	/**
	 * 
	 * @param	pal
	 * 			<u>do not has any annotate.</u>
	 */
	public void setPal(Integer pal) {
		builder.setPal(pal);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getPal() {
		return builder.getPal();
	}

	/**
	 * 
	 * @param	time
	 * 			<u>do not has any annotate.</u>
	 */
	public void setTime(Integer time) {
		builder.setTime(time);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getTime() {
		return builder.getTime();
	}

	public RESPONSE_SCRIPT_CHANGE_PAL getResponseScriptChangePal() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
