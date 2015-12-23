package cg.base.io.message;

import net.dipatch.ISender;
import net.io.message.ByteArrayMessage;
import cg.base.io.proto.OptionProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestOptionsSet extends ByteArrayMessage {

	private REQUEST_OPTIONS_SET.Builder builder;

	public RequestOptionsSet(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_REQUEST_OPTIONS_SET_VALUE, status, sessionId, sender, datas);
		builder = REQUEST_OPTIONS_SET.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public RequestOptionsSet() {
		super();
		builder = REQUEST_OPTIONS_SET.newBuilder();
		messageId = MessageId.MI_REQUEST_OPTIONS_SET_VALUE;
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

	public REQUEST_OPTIONS_SET getRequestOptionsSet() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
