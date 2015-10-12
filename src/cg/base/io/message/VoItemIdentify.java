package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;
import java.util.List;
import com.google.common.collect.Lists;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoItemIdentify {

	private VO_ITEM_IDENTIFY vo;

	private VO_ITEM_IDENTIFY.Builder builder;

	public VoItemIdentify(VO_ITEM_IDENTIFY vo) {
		this.vo = vo;
	}

	public VoItemIdentify() {
		builder = VO_ITEM_IDENTIFY.newBuilder();
	}

	/**
	 * 
	 * @param	rightButtonDescription
	 * 			<u>do not has any annotate.</u>
	 */
	public void setRightButtonDescription(String rightButtonDescription) {
		builder.setRightButtonDescription(rightButtonDescription);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getRightButtonDescription() {
		String ret = vo.getRightButtonDescription();
		return ret;
	}

	/**
	 * 
	 * @param	magicAttack
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMagicAttack(Integer magicAttack) {
		builder.setMagicAttack(magicAttack);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getMagicAttack() {
		int ret = vo.getMagicAttack();
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
	 * @param	doubleHand
	 * 			<u>do not has any annotate.</u>
	 */
	public void setDoubleHand(Boolean doubleHand) {
		builder.setDoubleHand(doubleHand);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Boolean getDoubleHand() {
		Boolean ret = vo.getDoubleHand();
		return ret;
	}

	/**
	 * 
	 * @param	gemArmorType
	 * 			<u>do not has any annotate.</u>
	 */
	public void setGemArmorType(Integer gemArmorType) {
		builder.setGemArmorType(gemArmorType);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getGemArmorType() {
		int ret = vo.getGemArmorType();
		return ret;
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
	 * @param	canUseInBattle
	 * 			<u>do not has any annotate.</u>
	 */
	public void setCanUseInBattle(Boolean canUseInBattle) {
		builder.setCanUseInBattle(canUseInBattle);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Boolean getCanUseInBattle() {
		Boolean ret = vo.getCanUseInBattle();
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
	 * @param	gemWeaponType
	 * 			<u>do not has any annotate.</u>
	 */
	public void setGemWeaponType(Integer gemWeaponType) {
		builder.setGemWeaponType(gemWeaponType);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getGemWeaponType() {
		int ret = vo.getGemWeaponType();
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

	/**
	 * 
	 * @param	canPostByPet
	 * 			<u>do not has any annotate.</u>
	 */
	public void setCanPostByPet(Boolean canPostByPet) {
		builder.setCanPostByPet(canPostByPet);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Boolean getCanPostByPet() {
		Boolean ret = vo.getCanPostByPet();
		return ret;
	}

	public VO_ITEM_IDENTIFY getVO_ITEM_IDENTIFY() {
		return vo == null ? builder.build() : vo;
	}

}
