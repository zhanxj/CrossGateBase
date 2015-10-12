package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.OptionProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseOptionsSet extends ProtoMessage {

	private RESPONSE_OPTIONS_SET.Builder builder;

	public ResponseOptionsSet(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_OPTIONS_SET_VALUE, status, sessionId, sender, datas);
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseOptionsSet() {
		super();
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
		String ret = builder.getName();
		return ret;
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
		VoOption ret = new VoOption(builder.getOption());
		return ret;
	}

	public RESPONSE_OPTIONS_SET getResponseOptionsSet() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
