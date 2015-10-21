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
		builder.setTech(tech);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getTech() {
		String ret = vo.getTech();
		return ret;
	}

	/**
	 * 
	 * @param	counter
	 * 			<u>do not has any annotate.</u>
	 */
	public void setCounter(VoCounter counter) {
		builder.setCounter(counter.getVO_COUNTER());
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VoCounter getCounter() {
		VoCounter ret = null;
		VO_COUNTER vo = this.vo.getCounter();
		ret = vo == null ? null : new VoCounter(vo);
		return ret;
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
		VoActionResult ret = new VoActionResult(vo.getActionResult());
		return ret;
	}

	public VO_COUNTER getVO_COUNTER() {
		return vo == null ? builder.build() : vo;
	}

}
