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
public class ResponseAccountRoleList extends ProtoMessage {

	private RESPONSE_ACCOUNT_ROLE_LIST.Builder builder;

	public ResponseAccountRoleList(int messageId, int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(messageId, status, sessionId, sender, datas);
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseAccountRoleList() {
		super();
	}

	/**
	 * 
	 * @param	players
	 * 			<u>do not has any annotate.</u>
	 */
	public void setPlayers(Iterable<VoAccountPlayerInfo> players) {
		List<VO_ACCOUNT_PLAYER_INFO> list = Lists.newLinkedList();
		for (VoAccountPlayerInfo vo : players) {
			list.add(vo.getVO_ACCOUNT_PLAYER_INFO());
		}
		builder.addAllPlayers(list);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VoAccountPlayerInfo> getPlayersList() {
		List<VO_ACCOUNT_PLAYER_INFO> list = builder.getPlayersList();
		List<VoAccountPlayerInfo> ret = Lists.newArrayListWithCapacity(list.size());
		for (VO_ACCOUNT_PLAYER_INFO vo : list) {
			ret.add(new VoAccountPlayerInfo(vo));
		}
		return ret;
	}

	public RESPONSE_ACCOUNT_ROLE_LIST getResponseAccountRoleList() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}