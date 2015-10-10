package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.MapProtos.*;

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

	public ResponseMapUnitCreate() {
		super();
	}

	/**
	 * 
	 * @param	baseInfo
	 * 			<u>do not has any annotate.</u>
	 */
	public void setBaseInfo(VoUnitBaseInfo baseInfo) {
		builder.setBaseInfo(baseInfo.getVO_UNIT_BASE_INFO());
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VoUnitBaseInfo getBaseInfo() {
		VoUnitBaseInfo ret = new VoUnitBaseInfo(builder.getBaseInfo());
		return ret;
	}

	/**
	 * 
	 * @param	position
	 * 			<u>do not has any annotate.</u>
	 */
	public void setPosition(VoPosition position) {
		builder.setPosition(position.getVO_POSITION());
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VoPosition getPosition() {
		VoPosition ret = new VoPosition(builder.getPosition());
		return ret;
	}

	/**
	 * 
	 * @param	extendInfo
	 * 			<u>do not has any annotate.</u>
	 */
	public void setExtendInfo(VoMapUnitExtend extendInfo) {
		builder.setExtendInfo(extendInfo.getVO_MAP_UNIT_EXTEND());
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VoMapUnitExtend getExtendInfo() {
		VoMapUnitExtend ret = new VoMapUnitExtend(builder.getExtendInfo());
		return ret;
	}

	public RESPONSE_MAP_UNIT_CREATE getResponseMapUnitCreate() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
