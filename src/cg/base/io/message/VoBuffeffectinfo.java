package cg.base.io.message;

import cg.base.io.proto.BattleProtos.*;
import cg.base.io.proto.VOProtos.*;
import com.google.common.collect.Lists;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoBuffeffectinfo {

	private VO_BuffEffectInfo vo;

	private VO_BuffEffectInfo.Builder builder;

	public VoBuffeffectinfo(VO_BuffEffectInfo vo) {
		this.vo = vo;
	}

	public VoBuffeffectinfo() {
		builder = VO_BuffEffectInfo.newBuilder();
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
	 * @param	effectValues
	 * 			<u>do not has any annotate.</u>
	 */
	public void setEffectValues(Iterable<VoEffectValue> effectValues) {
		List<VO_EFFECT_VALUE> list = Lists.newLinkedList();
		for (VoEffectValue vo : effectValues) {
			list.add(vo.getVO_EFFECT_VALUE());
		}
		builder.addAllEffectValues(list);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VoEffectValue> getEffectValuesList() {
		List<VO_EFFECT_VALUE> list = vo.getEffectValuesList();
		List<VoEffectValue> ret = Lists.newArrayListWithCapacity(list.size());
		for (VO_EFFECT_VALUE vo : list) {
			ret.add(new VoEffectValue(vo));
		}
		return ret;
	}

	/**
	 * 
	 * @param	finish
	 * 			<u>do not has any annotate.</u>
	 */
	public void setFinish(Boolean finish) {
		builder.setFinish(finish);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Boolean getFinish() {
		Boolean ret = vo.getFinish();
		return ret;
	}

	/**
	 * 
	 * @param	id
	 * 			<u>do not has any annotate.</u>
	 */
	public void setId(Integer id) {
		builder.setId(id);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getId() {
		int ret = vo.getId();
		return ret;
	}

	public VO_BuffEffectInfo getVO_BuffEffectInfo() {
		return vo == null ? builder.build() : vo;
	}

}
