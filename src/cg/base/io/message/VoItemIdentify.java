package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;
import com.google.common.collect.Lists;
import java.util.List;

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
		return vo.getRightButtonDescription();
	}

	/**
	 * 
	 * @param	magicAttack
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMagicAttack(Integer magicAttack) {
		if (magicAttack != null) {
			builder.setMagicAttack(magicAttack);
		}
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getMagicAttack() {
		return vo.getMagicAttack();
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
		return vo.getLevel();
	}

	/**
	 * 
	 * @param	doubleHand
	 * 			<u>do not has any annotate.</u>
	 */
	public void setDoubleHand(Boolean doubleHand) {
		if (doubleHand != null) {
			builder.setDoubleHand(doubleHand);
		}
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Boolean getDoubleHand() {
		return vo.getDoubleHand();
	}

	/**
	 * 
	 * @param	gemArmorType
	 * 			<u>do not has any annotate.</u>
	 */
	public void setGemArmorType(Integer gemArmorType) {
		if (gemArmorType != null) {
			builder.setGemArmorType(gemArmorType);
		}
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getGemArmorType() {
		return vo.getGemArmorType();
	}

	/**
	 * 
	 * @param	elements
	 * 			<u>do not has any annotate.</u>
	 */
	public void setElements(Iterable<VoItemElement> elements) {
		List<VO_ITEM_ELEMENT> list = Lists.newLinkedList();
		for (VoItemElement vo : elements) {
			list.add(vo.getVO_ITEM_ELEMENT());
		}
		builder.addAllElements(list);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VoItemElement> getElementsList() {
		List<VO_ITEM_ELEMENT> list = vo.getElementsList();
		List<VoItemElement> ret = Lists.newArrayListWithCapacity(list.size());
		for (VO_ITEM_ELEMENT vo : list) {
			ret.add(new VoItemElement(vo));
		}
		return ret;
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
		return vo.getCanUseInBattle();
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
		if (gemWeaponType != null) {
			builder.setGemWeaponType(gemWeaponType);
		}
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getGemWeaponType() {
		return vo.getGemWeaponType();
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
		return vo.getType();
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
		return vo.getCanPostByPet();
	}

	public VO_ITEM_IDENTIFY getVO_ITEM_IDENTIFY() {
		return vo == null ? builder.build() : vo;
	}

}
