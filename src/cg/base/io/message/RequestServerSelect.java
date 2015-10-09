package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.AccountProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestServerSelect extends ProtoMessage {

	private REQUEST_SERVER_SELECT.Builder builder;

	public RequestServerSelect(int messageId, int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(messageId, status, sessionId, sender, datas);
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	/**
	 * 
	 * @param	id
	 * 			<u>do not has any annotate.</u>
	 */
	public void setId(Integer id) {
		builder.setId(id);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getId() {
		return builder.getId();
	}

	public REQUEST_SERVER_SELECT getRequestServerSelect() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
