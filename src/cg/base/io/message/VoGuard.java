package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoGuard {

	private VO_GUARD vo;

	private VO_GUARD.Builder builder;

	public VoGuard(VO_GUARD vo) {
		this.vo = vo;
	}

	public VoGuard() {
		builder = VO_GUARD.newBuilder();
	}

	/**
	 * 
	 * @param	tech
	 * 			<u>do not has any annotate.</u>
	 */
	public void setTech(String tech) {
		builder.setTech(tech);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getTech() {
		return vo.getTech();
	}

	/**
	 * 
	 * @param	spriteId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setSpriteId(Integer spriteId) {
		builder.setSpriteId(spriteId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getSpriteId() {
		return vo.getSpriteId();
	}

	public VO_GUARD getVO_GUARD() {
		return vo == null ? builder.build() : vo;
	}

}
