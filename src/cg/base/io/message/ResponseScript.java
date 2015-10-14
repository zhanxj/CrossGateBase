package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.ScriptProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseScript extends ProtoMessage {

	private RESPONSE_SCRIPT.Builder builder;

	public ResponseScript(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_SCRIPT_VALUE, status, sessionId, sender, datas);
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseScript() {
		super();
		messageId = MessageId.MI_RESPONSE_SCRIPT_VALUE;
	}

	/**
	 * 
	 * @param	talkType
	 * 			<u>do not has any annotate.</u>
	 */
	public void setTalkType(String talkType) {
		builder.setTalkType(talkType);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getTalkType() {
		String ret = builder.getTalkType();
		return ret;
	}

	/**
	 * 
	 * @param	message
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMessage(String message) {
		builder.setMessage(message);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getMessage() {
		String ret = builder.getMessage();
		return ret;
	}

	/**
	 * 
	 * @param	infos
	 * 			<u>do not has any annotate.</u>
	 */
	public void setInfos(Iterable<String> infos) {
		builder.addAllInfos(infos);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<String> getInfosList() {
		return builder.getInfosList();
	}

	public RESPONSE_SCRIPT getResponseScript() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
