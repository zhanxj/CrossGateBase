package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.MapProtos.*;
import cg.base.io.proto.VOProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestMapMove extends ProtoMessage {

	private REQUEST_MAP_MOVE.Builder builder;

	public RequestMapMove(int messageId, int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(messageId, status, sessionId, sender, datas);
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	/**
	 * 
	 * @param	needEast
	 * 			<u>do not has any annotate.</u>
	 */
	public void setNeedEast(Boolean needEast) {
		builder.setNeedEast(needEast);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Boolean getNeedEast() {
		return builder.getNeedEast();
	}

	/**
	 * 
	 * @param	east
	 * 			<u>do not has any annotate.</u>
	 */
	public void setEast(Integer east) {
		builder.setEast(east);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getEast() {
		return builder.getEast();
	}

	/**
	 * 
	 * @param	south
	 * 			<u>do not has any annotate.</u>
	 */
	public void setSouth(Integer south) {
		builder.setSouth(south);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getSouth() {
		return builder.getSouth();
	}

	/**
	 * 
	 * @param	eastArea
	 * 			<u>do not has any annotate.</u>
	 */
	public void setEastArea(VO_MAP_AREA eastArea) {
		builder.setEastArea(eastArea);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VO_MAP_AREA getEastArea() {
		return builder.getEastArea();
	}

	/**
	 * 
	 * @param	needSouth
	 * 			<u>do not has any annotate.</u>
	 */
	public void setNeedSouth(Boolean needSouth) {
		builder.setNeedSouth(needSouth);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Boolean getNeedSouth() {
		return builder.getNeedSouth();
	}

	/**
	 * 
	 * @param	southArea
	 * 			<u>do not has any annotate.</u>
	 */
	public void setSouthArea(VO_MAP_AREA southArea) {
		builder.setSouthArea(southArea);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VO_MAP_AREA getSouthArea() {
		return builder.getSouthArea();
	}

	public REQUEST_MAP_MOVE getRequestMapMove() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
