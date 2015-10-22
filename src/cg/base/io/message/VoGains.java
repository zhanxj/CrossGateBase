package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;
import com.google.common.collect.Lists;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoGains {

	private VO_GAINS vo;

	private VO_GAINS.Builder builder;

	public VoGains(VO_GAINS vo) {
		this.vo = vo;
	}

	public VoGains() {
		builder = VO_GAINS.newBuilder();
	}

	/**
	 * 
	 * @param	className
	 * 			<u>do not has any annotate.</u>
	 */
	public void setClassName(String className) {
		builder.setClassName(className);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getClassName() {
		return vo.getClassName();
	}

	/**
	 * 
	 * @param	gains
	 * 			<u>do not has any annotate.</u>
	 */
	public void setGains(Iterable<VoGain> gains) {
		List<VO_GAIN> list = Lists.newLinkedList();
		for (VoGain vo : gains) {
			list.add(vo.getVO_GAIN());
		}
		builder.addAllGains(list);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VoGain> getGainsList() {
		List<VO_GAIN> list = vo.getGainsList();
		List<VoGain> ret = Lists.newArrayListWithCapacity(list.size());
		for (VO_GAIN vo : list) {
			ret.add(new VoGain(vo));
		}
		return ret;
	}

	public VO_GAINS getVO_GAINS() {
		return vo == null ? builder.build() : vo;
	}

}
