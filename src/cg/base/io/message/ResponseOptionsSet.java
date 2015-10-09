package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.OptionProtos.*;
import cg.base.io.proto.VOProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseOptionsSet extends ProtoMessage {

	private RESPONSE_OPTIONS_SET.Builder builder;

	public ResponseOptionsSet(int messageId, int status, String sessionId, ISender sender, RESPONSE_OPTIONS_SET.Builder builder) {
		super(messageId, status, sessionId, sender, null);
		this.builder = builder;
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
	public void setOption(VO_OPTION option) {
		builder.setOption(option);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VO_OPTION getOption() {
		return builder.getOption();
	}

	public RESPONSE_OPTIONS_SET getResponseOptionsSet() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
