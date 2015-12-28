package cg.base.util;

import static cg.base.item.ItemInfo.TYPE_AXE;
import static cg.base.item.ItemInfo.TYPE_NOT_WEAPON;
import static cg.base.item.ItemInfo.TYPE_SPEAR;
import static cg.base.item.ItemInfo.TYPE_STAFF;
import static cg.base.item.ItemInfo.TYPE_SWORD;
import static cg.base.item.ItemInfo.TYPE_BOOMERANG;
import static cg.base.skill.SkillLevelInfo.TECH_SpiracleShot;
import static cg.base.skill.SkillLevelInfo.TECH_Assassin;
import static cg.base.skill.SkillTemplate.TYPE_ATTACK;

public final class BaseBattleUtils {
	
	private static final String[] NOT_CLOSE_TECHS = new String[]{
			TECH_SpiracleShot,
			TECH_Assassin,
	};
	
	private BaseBattleUtils() {}
	
	public static boolean isCloseWeapon(int weaponType) {
		switch (weaponType) {
		case TYPE_NOT_WEAPON : 
		case TYPE_SWORD : 
		case TYPE_AXE : 
		case TYPE_SPEAR : 
		case TYPE_STAFF : 
			return true;
		default : 
			return false;
		}
	}
	
	public static boolean isCloseCost(int weaponType, String tech, byte skillType) {
		return !isNotCloseTech(tech) && skillType == TYPE_ATTACK && isCloseWeapon(weaponType);
	}
	
	private static boolean isNotCloseTech(String tech) {
		for (String notCloseTech : NOT_CLOSE_TECHS) {
			if (notCloseTech.equals(tech)) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean isLinkedWeapon(int weaponType) {
		return weaponType == TYPE_BOOMERANG;
	}
	
	public static boolean isLinkedCost(int weaponType, byte skillType) {
		return skillType == TYPE_ATTACK && isCloseWeapon(weaponType);
	}

}
