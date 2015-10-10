package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.OptionProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestOptionsSet extends ProtoMessage {

	private REQUEST_OPTIONS_SET.Builder builder;

	public RequestOptionsSet(int messageId, int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(messageId, status, sessionId, sender, datas);
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public RequestOptionsSet() {
		super();
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
