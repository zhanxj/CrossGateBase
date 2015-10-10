package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;
import java.util.List;
import com.google.common.collect.Lists;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoPet {

	private VO_PET vo;

	private VO_PET.Builder builder;

	public VoPet(VO_PET vo) {
		this.vo = vo;
	}

	public VoPet() {
		builder = VO_PET.newBuilder();
	}

	/**
	 * 
	 * @param	baseInfo
	 * 			<u>do not has any annotate.</u>
	 */
	public void setBaseInfo(VoUnitBaseInfo baseInfo) {
		builder.setBaseInfo(baseInfo.getVO_UNIT_BASE_INFO());
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VoUnitBaseInfo getBaseInfo() {
		return new VoUnitBaseInfo(vo.getBaseInfo());
	}

	/**
	 * 
	 * @param	skillSet
	 * 			<u>do not has any annotate.</u>
	 */
	public void setSkillSet(VoSkillSet skillSet) {
		builder.setSkillSet(skillSet.getVO_SKILL_SET());
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VoSkillSet getSkillSet() {
		return new VoSkillSet(vo.getSkillSet());
	}

	/**
	 * 
	 * @param	loyal
	 * 			<u>do not has any annotate.</u>
	 */
	public void setLoyal(Integer loyal) {
		builder.setLoyal(loyal);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getLoyal() {
		return vo.getLoyal();
	}

	/**
	 * 
	 * @param	elements
	 * 			<u>do not has any annotate.</u>
	 */
	public void setElements(Iterable<Integer> elements) {
		builder.addAllElements(elements);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<Integer> getElementsList() {
		return vo.getElementsList();
	}

	/**
	 * 
	 * @param	attributes
	 * 			<u>do not has any annotate.</u>
	 */
	public void setAttributes(Iterable<VoAttributes> attributes) {
		List<VO_ATTRIBUTES> list = Lists.newLinkedList();
		for (VoAttributes vo : attributes) {
			list.add(vo.getVO_ATTRIBUTES());
		}
		builder.addAllAttributes(list);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VoAttributes> getAttributesList() {
		List<VO_ATTRIBUTES> list = vo.getAttributesList();
		List<VoAttributes> ret = Lists.newArrayListWithCapacity(list.size());
		for (VO_ATTRIBUTES vo : list) {
			ret.add(new VoAttributes(vo));
		}
		return ret;
	}

	/**
	 * 
	 * @param	state
	 * 			<u>do not has any annotate.</u>
	 */
	public void setState(Integer state) {
		builder.setState(state);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getState() {
		return vo.getState();
	}

	/**
	 * 
	 * @param	extendInfo
	 * 			<u>do not has any annotate.</u>
	 */
	public void setExtendInfo(VoUnitExtendInfo extendInfo) {
		builder.setExtendInfo(extendInfo.getVO_UNIT_EXTEND_INFO());
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VoUnitExtendInfo getExtendInfo() {
		return new VoUnitExtendInfo(vo.getExtendInfo());
	}

	public VO_PET getVO_PET() {
		return vo == null ? builder.build() : vo;
	}

}
