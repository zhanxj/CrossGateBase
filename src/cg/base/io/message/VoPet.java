package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoPet {

	private VO_PET vo;

	private VO_PET.Builder builder;

	public VoPet(VO_PET vo) {
		this.vo = vo;
	}

	public VoPet() {
		builder = VO_PET.newBuilder();
	}

	/**
	 * 
	 * @param	unitInfo
	 * 			<u>do not has any annotate.</u>
	 */
	public void setUnitInfo(VoUnit unitInfo) {
		builder.setUnitInfo(unitInfo.getVO_UNIT());
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VoUnit getUnitInfo() {
		return new VoUnit(vo.getUnitInfo());
	}

	public VO_PET getVO_PET() {
		return vo == null ? builder.build() : vo;
	}

}
