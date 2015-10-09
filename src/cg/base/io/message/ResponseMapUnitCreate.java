package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.MapProtos.*;
import cg.base.io.proto.VOProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseMapUnitCreate extends ProtoMessage {

	private RESPONSE_MAP_UNIT_CREATE.Builder builder;

	public ResponseMapUnitCreate(int messageId, int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(messageId, status, sessionId, sender, datas);
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	/**
	 * 
	 * @param	baseInfo
	 * 			<u>do not has any annotate.</u>
	 */
	public void setBaseInfo(VO_UNIT_BASE_INFO baseInfo) {
		builder.setBaseInfo(baseInfo);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VO_UNIT_BASE_INFO getBaseInfo() {
		return builder.getBaseInfo();
	}

	/**
	 * 
	 * @param	position
	 * 			<u>do not has any annotate.</u>
	 */
	public void setPosition(VO_POSITION position) {
		builder.setPosition(position);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VO_POSITION getPosition() {
		return builder.getPosition();
	}

	/**
	 * 
	 * @param	extendInfo
	 * 			<u>do not has any annotate.</u>
	 */
	public void setExtendInfo(VO_MAP_UNIT_EXTEND extendInfo) {
		builder.setExtendInfo(extendInfo);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VO_MAP_UNIT_EXTEND getExtendInfo() {
		return builder.getExtendInfo();
	}

	public RESPONSE_MAP_UNIT_CREATE getResponseMapUnitCreate() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
