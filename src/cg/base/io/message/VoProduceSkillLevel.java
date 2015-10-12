package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;
import com.google.common.collect.Lists;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoProduceSkillLevel {

	private VO_PRODUCE_SKILL_LEVEL vo;

	private VO_PRODUCE_SKILL_LEVEL.Builder builder;

	public VoProduceSkillLevel(VO_PRODUCE_SKILL_LEVEL vo) {
		this.vo = vo;
	}

	public VoProduceSkillLevel() {
		builder = VO_PRODUCE_SKILL_LEVEL.newBuilder();
	}

	/**
	 * 
	 * @param	itemId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setItemId(Integer itemId) {
		builder.setItemId(itemId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getItemId() {
		int ret = vo.getItemId();
		return ret;
	}

	/**
	 * 
	 * @param	identifyName
	 * 			<u>do not has any annotate.</u>
	 */
	public void setIdentifyName(String identifyName) {
		builder.setIdentifyName(identifyName);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getIdentifyName() {
		String ret = vo.getIdentifyName();
		return ret;
	}

	/**
	 * 
	 * @param	materials
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMaterials(Iterable<VoMaterialInfo> materials) {
		List<VO_MATERIAL_INFO> list = Lists.newLinkedList();
		for (VoMaterialInfo vo : materials) {
			list.add(vo.getVO_MATERIAL_INFO());
		}
		builder.addAllMaterials(list);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VoMaterialInfo> getMaterialsList() {
		List<VO_MATERIAL_INFO> list = vo.getMaterialsList();
		List<VoMaterialInfo> ret = Lists.newArrayListWithCapacity(list.size());
		for (VO_MATERIAL_INFO vo : list) {
			ret.add(new VoMaterialInfo(vo));
		}
		return ret;
	}

	/**
	 * 
	 * @param	producesId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setProducesId(Integer producesId) {
		builder.setProducesId(producesId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getProducesId() {
		int ret = vo.getProducesId();
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

	public VO_PRODUCE_SKILL_LEVEL getVO_PRODUCE_SKILL_LEVEL() {
		return vo == null ? builder.build() : vo;
	}

}
