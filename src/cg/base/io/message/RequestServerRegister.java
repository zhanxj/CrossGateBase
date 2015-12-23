package cg.base.io.message;

import net.dipatch.ISender;
import net.io.message.ByteArrayMessage;
import cg.base.io.proto.ServerProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestServerRegister extends ByteArrayMessage {

	private REQUEST_SERVER_REGISTER.Builder builder;

	public RequestServerRegister(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_REQUEST_SERVER_REGISTER_VALUE, status, sessionId, sender, datas);
		builder = REQUEST_SERVER_REGISTER.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public RequestServerRegister() {
		super();
		builder = REQUEST_SERVER_REGISTER.newBuilder();
		messageId = MessageId.MI_REQUEST_SERVER_REGISTER_VALUE;
	}

	/**
	 * 
	 * @param	port
	 * 			<u>do not has any annotate.</u>
	 */
	public void setPort(Integer port) {
		builder.setPort(port);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getPort() {
		return builder.getPort();
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

	public REQUEST_SERVER_REGISTER getRequestServerRegister() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
