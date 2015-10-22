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
		if (next != null) {
			builder.setNext(next.getVO_ACTION_PROCESS());
		}
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VoActionProcess getNext() {
		return vo.hasNext() ? new VoActionProcess(vo.getNext()) : null;
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
		return vo.getTargetId();
	}

	/**
	 * 
	 * @param	guard
	 * 			<u>do not has any annotate.</u>
	 */
	public void setGuard(VoGuard guard) {
		if (guard != null) {
			builder.setGuard(guard.getVO_GUARD());
		}
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VoGuard getGuard() {
		return vo.hasGuard() ? new VoGuard(vo.getGuard()) : null;
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
	 * @param	blood
	 * 			<u>do not has any annotate.</u>
	 */
	public void setBlood(VoActionResult blood) {
		if (blood != null) {
			builder.setBlood(blood.getVO_ACTION_RESULT());
		}
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VoActionResult getBlood() {
		return vo.hasBlood() ? new VoActionResult(vo.getBlood()) : null;
	}

	/**
	 * 
	 * @param	actionResult
	 * 			<u>do not has any annotate.</u>
	 */
	public void setActionResult(VoActionResult actionResult) {
		if (actionResult != null) {
			builder.setActionResult(actionResult.getVO_ACTION_RESULT());
		}
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VoActionResult getActionResult() {
		return vo.hasActionResult() ? new VoActionResult(vo.getActionResult()) : null;
	}

	public VO_ACTION_PROCESS getVO_ACTION_PROCESS() {
		return vo == null ? builder.build() : vo;
	}

}
