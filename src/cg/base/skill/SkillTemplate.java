package cg.base.skill;

import java.util.Map;

import cg.base.sprite.AttributeCell;

public interface SkillTemplate {
	
	/**
	 * 辅助类
	 */
	byte TYPE_ASSIST = 0;
	/**
	 * 攻击类
	 */
	byte TYPE_ATTACK = 1;
	/**
	 * 生产类
	 */
	byte TYPE_PRODUCE = 2;
	/**
	 * 魔法类
	 */
	byte TYPE_MAGIC = 3;
	/**
	 * 骑宠类
	 */
	byte TYPE_RIDE = 4;
	
	String getName();
	
	short getId();
	
	String getDescription();
	
	byte getType();
	
	short getStudyPrice();
	
	short getNeedWeaponType();
	
	byte getUseSpace();
	
	byte getExpType();
	
	boolean getNotGainExp();
	
	short getDoubleExpType();
	
	Map<String, AttributeCell> getAttributes();
	
	byte getEffectWorkLevel();
	
	short getPriceRate();

}
