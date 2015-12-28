package cg.base.util;

import static cg.base.item.ItemInfo.TYPE_AXE;
import static cg.base.item.ItemInfo.TYPE_NOT_WEAPON;
import static cg.base.item.ItemInfo.TYPE_SPEAR;
import static cg.base.item.ItemInfo.TYPE_STAFF;
import static cg.base.item.ItemInfo.TYPE_SWORD;
import static cg.base.skill.SkillLevelInfo.TECH_SpiracleShot;
import static cg.base.skill.SkillLevelInfo.TECH_Assassin;;

public final class BaseItemUtils {
	
	private static final String[] NOT_CLOSE_TECHS = new String[]{
			TECH_SpiracleShot,
			TECH_Assassin,
	};
	
	private BaseItemUtils() {}
	
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
	
	public static boolean isCloseCost(int weaponType, String tech) {
		return !isNotCloseTech(tech) && isCloseWeapon(weaponType);
	}
	
	private static boolean isNotCloseTech(String tech) {
		for (String notCloseTech : NOT_CLOSE_TECHS) {
			if (notCloseTech.equals(tech)) {
				return true;
			}
		}
		return false;
	}

}
