package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;
import com.google.common.collect.Lists;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoSkill {

	private VO_SKILL vo;

	private VO_SKILL.Builder builder;

	public VoSkill(VO_SKILL vo) {
		this.vo = vo;
	}

	public VoSkill() {
		builder = VO_SKILL.newBuilder();
	}

	/**
	 * 
	 * @param	maxLevel
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMaxLevel(Integer maxLevel) {
		builder.setMaxLevel(maxLevel);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getMaxLevel() {
		int ret = vo.getMaxLevel();
		return ret;
	}

	/**
	 * 
	 * @param	skills
	 * 			<u>do not has any annotate.</u>
	 */
	public void setSkills(Iterable<VoSkillLevel> skills) {
		List<VO_SKILL_LEVEL> list = Lists.newLinkedList();
		for (VoSkillLevel vo : skills) {
			list.add(vo.getVO_SKILL_LEVEL());
		}
		builder.addAllSkills(list);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VoSkillLevel> getSkillsList() {
		List<VO_SKILL_LEVEL> list = vo.getSkillsList();
		List<VoSkillLevel> ret = Lists.newArrayListWithCapacity(list.size());
		for (VO_SKILL_LEVEL vo : list) {
			ret.add(new VoSkillLevel(vo));
		}
		return ret;
	}

	/**
	 * 
	 * @param	level
	 * 			<u>do not has any annotate.</u>
	 */
	public void setLevel(Integer level) {
		builder.setLevel(level);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getLevel() {
		int ret = vo.getLevel();
		return ret;
	}

	/**
	 * 
	 * @param	nextLevelExp
	 * 			<u>do not has any annotate.</u>
	 */
	public void setNextLevelExp(Integer nextLevelExp) {
		if (nextLevelExp != null) {
			builder.setNextLevelExp(nextLevelExp);
		}
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getNextLevelExp() {
		int ret = vo.getNextLevelExp();
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
		String ret = vo.getName();
		return ret;
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
		String ret = vo.getDescription();
		return ret;
	}

	/**
	 * 
	 * @param	index
	 * 			<u>do not has any annotate.</u>
	 */
	public void setIndex(Integer index) {
		if (index != null) {
			builder.setIndex(index);
		}
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getIndex() {
		int ret = vo.getIndex();
		return ret;
	}

	/**
	 * 
	 * @param	useSpace
	 * 			<u>do not has any annotate.</u>
	 */
	public void setUseSpace(Integer useSpace) {
		builder.setUseSpace(useSpace);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getUseSpace() {
		int ret = vo.getUseSpace();
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

	/**
	 * 
	 * @param	exp
	 * 			<u>do not has any annotate.</u>
	 */
	public void setExp(Integer exp) {
		if (exp != null) {
			builder.setExp(exp);
		}
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getExp() {
		int ret = vo.getExp();
		return ret;
	}

	/**
	 * 
	 * @param	type
	 * 			<u>do not has any annotate.</u>
	 */
	public void setType(Integer type) {
		builder.setType(type);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getType() {
		int ret = vo.getType();
		return ret;
	}

	public VO_SKILL getVO_SKILL() {
		return vo == null ? builder.build() : vo;
	}

}
