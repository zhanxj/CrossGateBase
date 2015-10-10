package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.AccountProtos.*;
import com.google.common.collect.Lists;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseServerList extends ProtoMessage {

	private RESPONSE_SERVER_LIST.Builder builder;

	public ResponseServerList(int messageId, int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(messageId, status, sessionId, sender, datas);
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseServerList() {
		super();
	}

	/**
	 * 
	 * @param	servers
	 * 			<u>do not has any annotate.</u>
	 */
	public void setServers(Iterable<VoServer> servers) {
		List<VO_SERVER> list = Lists.newLinkedList();
		for (VoServer vo : servers) {
			list.add(vo.getVO_SERVER());
		}
		builder.addAllServers(list);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VO_SERVER> getServersList() {
		return builder.getServersList();
	}

	public RESPONSE_SERVER_LIST getResponseServerList() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
