package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.MapProtos.*;
import cg.base.io.proto.VOProtos.*;
import com.google.common.collect.Lists;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseMapMove extends ProtoMessage {

	private RESPONSE_MAP_MOVE.Builder builder;

	public ResponseMapMove(int messageId, int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(messageId, status, sessionId, sender, datas);
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseMapMove() {
		super();
	}

	/**
	 * 
	 * @param	mapCells
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMapCells(Iterable<VoMapCell> mapCells) {
		List<VO_MAP_CELL> list = Lists.newLinkedList();
		for (VoMapCell vo : mapCells) {
			list.add(vo.getVO_MAP_CELL());
		}
		builder.addAllMapCells(list);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VO_MAP_CELL> getMapCellsList() {
		return builder.getMapCellsList();
	}

	public RESPONSE_MAP_MOVE getResponseMapMove() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
