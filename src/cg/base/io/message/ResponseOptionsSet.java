package cg.base.io.message;

import net.dipatch.ISender;
import net.io.message.ByteArrayMessage;
import cg.base.io.proto.OptionProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseOptionsSet extends ByteArrayMessage {

	private RESPONSE_OPTIONS_SET.Builder builder;

	public ResponseOptionsSet(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_OPTIONS_SET_VALUE, status, sessionId, sender, datas);
		builder = RESPONSE_OPTIONS_SET.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseOptionsSet() {
		super();
		builder = RESPONSE_OPTIONS_SET.newBuilder();
		messageId = MessageId.MI_RESPONSE_OPTIONS_SET_VALUE;
	}

	/**
	 * 
	 * @param	name
	 * 			<u>do not has any annotate.</u>
	 */
	public void setName(String name) {
		builder.setName(name);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getName() {
		return builder.getName();
	}

	/**
	 * 
	 * @param	option
	 * 			<u>do not has any annotate.</u>
	 */
	public void setOption(VoOption option) {
		builder.setOption(option.getVO_OPTION());
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VoOption getOption() {
		return new VoOption(builder.getOption());
	}

	public RESPONSE_OPTIONS_SET getResponseOptionsSet() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
