package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoCounter {

	private VO_COUNTER vo;

	private VO_COUNTER.Builder builder;

	public VoCounter(VO_COUNTER vo) {
		this.vo = vo;
	}

	public VoCounter() {
		builder = VO_COUNTER.newBuilder();
	}

	/**
	 * 
	 * @param	tech
	 * 			<u>do not has any annotate.</u>
	 */
	public void setTech(String tech) {
		if (tech != null) {
			builder.setTech(tech);
		}
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
	 * @param	counter
	 * 			<u>do not has any annotate.</u>
	 */
	public void setCounter(VoCounter counter) {
		if (counter != null) {
			builder.setCounter(counter.getVO_COUNTER());
		}
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VoCounter getCounter() {
		return vo.hasCounter() ? new VoCounter(vo.getCounter()) : null;
	}

	/**
	 * 
	 * @param	actionResult
	 * 			<u>do not has any annotate.</u>
	 */
	public void setActionResult(VoActionResult actionResult) {
		builder.setActionResult(actionResult.getVO_ACTION_RESULT());
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VoActionResult getActionResult() {
		return new VoActionResult(vo.getActionResult());
	}

	public VO_COUNTER getVO_COUNTER() {
		return vo == null ? builder.build() : vo;
	}

}
