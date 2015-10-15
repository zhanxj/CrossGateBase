package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.MapProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;
import cg.base.io.proto.VOProtos.*;
import com.google.common.collect.Lists;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseMapMove extends ProtoMessage {

	private RESPONSE_MAP_MOVE.Builder builder;

	public ResponseMapMove(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_MAP_MOVE_VALUE, status, sessionId, sender, datas);
		builder = RESPONSE_MAP_MOVE.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseMapMove() {
		super();
		builder = RESPONSE_MAP_MOVE.newBuilder();
		messageId = MessageId.MI_RESPONSE_MAP_MOVE_VALUE;
	}

	/**
	 * 
	 * @param	serial
	 * 			<u>do not has any annotate.</u>
	 */
	public void setSerial(Integer serial) {
		builder.setSerial(serial);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getSerial() {
		int ret = builder.getSerial();
		return ret;
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
	public List<VoMapCell> getMapCellsList() {
		List<VO_MAP_CELL> list = builder.getMapCellsList();
		List<VoMapCell> ret = Lists.newArrayListWithCapacity(list.size());
		for (VO_MAP_CELL vo : list) {
			ret.add(new VoMapCell(vo));
		}
		return ret;
	}

	public RESPONSE_MAP_MOVE getResponseMapMove() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
