package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoActionProcess {

	private VO_ACTION_PROCESS vo;

	private VO_ACTION_PROCESS.Builder builder;

	public VoActionProcess(VO_ACTION_PROCESS vo) {
		this.vo = vo;
	}

	public VoActionProcess() {
		builder = VO_ACTION_PROCESS.newBuilder();
	}

	/**
	 * 
	 * @param	next
	 * 			<u>do not has any annotate.</u>
	 */
	public void setNext(VoActionProcess next) {
		builder.setNext(next.getVO_ACTION_PROCESS());
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VoActionProcess getNext() {
		VoActionProcess ret = null;
		VO_ACTION_PROCESS vo = this.vo.getNext();
		ret = vo == null ? null : new VoActionProcess(vo);
		return ret;
	}

	/**
	 * 
	 * @param	targetId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setTargetId(Integer targetId) {
		builder.setTargetId(targetId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getTargetId() {
		int ret = vo.getTargetId();
		return ret;
	}

	/**
	 * 
	 * @param	guard
	 * 			<u>do not has any annotate.</u>
	 */
	public void setGuard(VoGuard guard) {
		builder.setGuard(guard.getVO_GUARD());
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VoGuard getGuard() {
		VoGuard ret = null;
		VO_GUARD vo = this.vo.getGuard();
		ret = vo == null ? null : new VoGuard(vo);
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
	 * @param	blood
	 * 			<u>do not has any annotate.</u>
	 */
	public void setBlood(VoActionResult blood) {
		builder.setBlood(blood.getVO_ACTION_RESULT());
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VoActionResult getBlood() {
		VoActionResult ret = null;
		VO_ACTION_RESULT vo = this.vo.getBlood();
		ret = vo == null ? null : new VoActionResult(vo);
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
		VoActionResult ret = null;
		VO_ACTION_RESULT vo = this.vo.getActionResult();
		ret = vo == null ? null : new VoActionResult(vo);
		return ret;
	}

	public VO_ACTION_PROCESS getVO_ACTION_PROCESS() {
		return vo == null ? builder.build() : vo;
	}

}
