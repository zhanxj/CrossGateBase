package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;
import com.google.common.collect.Lists;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoSkillSet {

	private VO_SKILL_SET vo;

	private VO_SKILL_SET.Builder builder;

	public VoSkillSet(VO_SKILL_SET vo) {
		this.vo = vo;
	}

	public VoSkillSet() {
		builder = VO_SKILL_SET.newBuilder();
	}

	/**
	 * 
	 * @param	skills
	 * 			<u>do not has any annotate.</u>
	 */
	public void setSkills(Iterable<VoSkill> skills) {
		List<VO_SKILL> list = Lists.newLinkedList();
		for (VoSkill vo : skills) {
			list.add(vo.getVO_SKILL());
		}
		builder.addAllSkills(list);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VoSkill> getSkillsList() {
		List<VO_SKILL> list = vo.getSkillsList();
		List<VoSkill> ret = Lists.newArrayListWithCapacity(list.size());
		for (VO_SKILL vo : list) {
			ret.add(new VoSkill(vo));
		}
		return ret;
	}

	/**
	 * 
	 * @param	max
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMax(Integer max) {
		builder.setMax(max);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getMax() {
		int ret = vo.getMax();		return ret;
	}

	/**
	 * 
	 * @param	baseSkills
	 * 			<u>do not has any annotate.</u>
	 */
	public void setBaseSkills(Iterable<VoSkill> baseSkills) {
		List<VO_SKILL> list = Lists.newLinkedList();
		for (VoSkill vo : baseSkills) {
			list.add(vo.getVO_SKILL());
		}
		builder.addAllBaseSkills(list);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VoSkill> getBaseSkillsList() {
		List<VO_SKILL> list = vo.getBaseSkillsList();
		List<VoSkill> ret = Lists.newArrayListWithCapacity(list.size());
		for (VO_SKILL vo : list) {
			ret.add(new VoSkill(vo));
		}
		return ret;
	}

	public VO_SKILL_SET getVO_SKILL_SET() {
		return vo == null ? builder.build() : vo;
	}

}
