package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestDoubleExpUpdate extends ProtoMessage {

	public RequestDoubleExpUpdate(int messageId, int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(messageId, status, sessionId, sender, datas);
	}

	public RequestDoubleExpUpdate() {
		super();
	}

}
