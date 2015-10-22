package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;
import com.google.common.collect.Lists;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoSkillLevel {

	private VO_SKILL_LEVEL vo;

	private VO_SKILL_LEVEL.Builder builder;

	public VoSkillLevel(VO_SKILL_LEVEL vo) {
		this.vo = vo;
	}

	public VoSkillLevel() {
		builder = VO_SKILL_LEVEL.newBuilder();
	}

	/**
	 * 
	 * @param	costMp
	 * 			<u>do not has any annotate.</u>
	 */
	public void setCostMp(Integer costMp) {
		builder.setCostMp(costMp);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getCostMp() {
		return vo.getCostMp();
	}

	/**
	 * 
	 * @param	skillLevelDatas
	 * 			<u>do not has any annotate.</u>
	 */
	public void setSkillLevelDatas(Iterable<VoProduceSkillLevel> skillLevelDatas) {
		List<VO_PRODUCE_SKILL_LEVEL> list = Lists.newLinkedList();
		for (VoProduceSkillLevel vo : skillLevelDatas) {
			list.add(vo.getVO_PRODUCE_SKILL_LEVEL());
		}
		builder.addAllSkillLevelDatas(list);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VoProduceSkillLevel> getSkillLevelDatasList() {
		List<VO_PRODUCE_SKILL_LEVEL> list = vo.getSkillLevelDatasList();
		List<VoProduceSkillLevel> ret = Lists.newArrayListWithCapacity(list.size());
		for (VO_PRODUCE_SKILL_LEVEL vo : list) {
			ret.add(new VoProduceSkillLevel(vo));
		}
		return ret;
	}

	/**
	 * 
	 * @param	name
	 * 			<u>do not has any annotate.</u>
	 */
	public void setName(String name) {
		builder.setName(name);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getName() {
		return vo.getName();
	}

	/**
	 * 
	 * @param	description
	 * 			<u>do not has any annotate.</u>
	 */
	public void setDescription(String description) {
		builder.setDescription(description);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getDescription() {
		return vo.getDescription();
	}

	/**
	 * 
	 * @param	targetType
	 * 			<u>do not has any annotate.</u>
	 */
	public void setTargetType(Integer targetType) {
		builder.setTargetType(targetType);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getTargetType() {
		return vo.getTargetType();
	}

	/**
	 * 
	 * @param	techType
	 * 			<u>do not has any annotate.</u>
	 */
	public void setTechType(String techType) {
		builder.setTechType(techType);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getTechType() {
		return vo.getTechType();
	}

	public VO_SKILL_LEVEL getVO_SKILL_LEVEL() {
		return vo == null ? builder.build() : vo;
	}

}
