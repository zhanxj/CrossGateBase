package cg.base.io.message;

import cg.base.io.proto.BattleProtos.*;
import cg.base.io.proto.VOProtos.*;
import com.google.common.collect.Lists;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoBuffEffectInfo {

	private VO_BUFF_EFFECT_INFO vo;

	private VO_BUFF_EFFECT_INFO.Builder builder;

	public VoBuffEffectInfo(VO_BUFF_EFFECT_INFO vo) {
		this.vo = vo;
	}

	public VoBuffEffectInfo() {
		builder = VO_BUFF_EFFECT_INFO.newBuilder();
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
		if (finish != null) {
			builder.setFinish(finish);
		}
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Boolean getFinish() {
		return vo.getFinish();
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
		return vo.getId();
	}

	public VO_BUFF_EFFECT_INFO getVO_BUFF_EFFECT_INFO() {
		return vo == null ? builder.build() : vo;
	}

}
