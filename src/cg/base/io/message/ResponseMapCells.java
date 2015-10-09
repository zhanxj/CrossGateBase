package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.MapProtos.*;
import cg.base.io.proto.VOProtos.*;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseMapCells extends ProtoMessage {

	private RESPONSE_MAP_CELLS.Builder builder;

	public ResponseMapCells(int messageId, int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(messageId, status, sessionId, sender, datas);
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	/**
	 * 
	 * @param	mapCells
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMapCells(Iterable<VO_MAP_CELL> mapCells) {
		builder.addAllMapCells(mapCells);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VO_MAP_CELL> getMapCellsList() {
		return builder.getMapCellsList();
	}

	public RESPONSE_MAP_CELLS getResponseMapCells() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
