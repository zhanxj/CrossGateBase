package cg.base.io.message;

import net.io.ISender;
import net.io.message.ByteArrayMessage;
import cg.base.io.proto.AccountProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;
import com.google.common.collect.Lists;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseServerList extends ByteArrayMessage {

	private RESPONSE_SERVER_LIST.Builder builder;

	public ResponseServerList(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_SERVER_LIST_VALUE, status, sessionId, sender, datas);
		builder = RESPONSE_SERVER_LIST.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseServerList() {
		super();
		builder = RESPONSE_SERVER_LIST.newBuilder();
		messageId = MessageId.MI_RESPONSE_SERVER_LIST_VALUE;
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
	public List<VoServer> getServersList() {
		List<VO_SERVER> list = builder.getServersList();
		List<VoServer> ret = Lists.newArrayListWithCapacity(list.size());
		for (VO_SERVER vo : list) {
			ret.add(new VoServer(vo));
		}
		return ret;
	}

	public RESPONSE_SERVER_LIST getResponseServerList() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
