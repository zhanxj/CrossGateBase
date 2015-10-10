package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.AccountProtos.*;
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
	public void setPlayers(Iterable<VO_ACCOUNT_PLAYER_INFO> players) {
		builder.addAllPlayers(players);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VO_ACCOUNT_PLAYER_INFO> getPlayersList() {
		return builder.getPlayersList();
	}

	public RESPONSE_ACCOUNT_ROLE_LIST getResponseAccountRoleList() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
