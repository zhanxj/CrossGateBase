package cg.base.sprite;

public interface Attribute {
	
	String ATTRIBUTE_TYPE_BP = "ATTRIBUTE_BP";
	
	String ATTRIBUTE_TYPE_BASE = "ATTRIBUTE";
	
	String ATTRIBUTE_TYPE_EXTEND = "ATTRIBUTE_EXTEND";
	
	String ATTRIBUTE_TYPE_WORK = "ATTRIBUTE_WORK";
	
	String ATTRIBUTE_TYPE_RESIST = "ATTRIBUTE_RESIST";
	
	byte BP_VITALITY = 0; // VTL --体力
	
	byte BP_STRENGTH = 1; // STR --力量
	
	byte BP_TOUGH = 2; // TGH --强度
	
	byte BP_QUICK = 3; // QUI --速度
	
	byte BP_MAGIC = 4; // MGC --魔法
	
	byte BP_REMAIND = 5; // 剩余
	
	byte ATTRIBUTE_HP_MAX = 0; // 最大血量
	
	byte ATTRIBUTE_MP_MAX = 1; // 最大魔法
	
	byte ATTRIBUTE_ATTACK = 2; // ATK --攻击
	
	byte ATTRIBUTE_DEFEND = 3; // DEF --防御
	
	byte ATTRIBUTE_AGILITY = 4; // AGL --敏捷
	
	byte ATTRIBUTE_HP = 5; // 当前血量
	
	byte ATTRIBUTE_MP = 6; // 当前最大魔法
	
	byte ATTRIBUTE_INJURED = 7; // 受伤
	
	byte ATTRIBUTE_SOUL = 8; // 掉魂数量
	
	byte ATTRIBUTE_EXTEND_CRITICAL = 0; // CRI --必杀
	
	byte ATTRIBUTE_EXTEND_HIT = 1; // HIT --命中
	
	byte ATTRIBUTE_EXTEND_COUNTER = 2; // CTR --反击
	
	byte ATTRIBUTE_EXTEND_AVOID = 3; // AVD --闪躲
	
	byte ATTRIBUTE_EXTEND_RECOVER = 4; // RCV --回复
	
	byte ATTRIBUTE_EXTEND_MIND = 5; // MND --精神
	
	byte ATTRIBUTE_WORK_STAMINA = 0; // STM --耐力
	
	byte ATTRIBUTE_WORK_DEXTERITY = 1; // DEX --灵巧 
	
	byte ATTRIBUTE_WORK_INTELLIGENCE = 2; // INT --智力
	
	byte ATTRIBUTE_WORK_CHARM = 3; // CHM --魅力
	
	byte ATTRIBUTE_RESIST_POISON = 0; // POI --抗毒
	
	byte ATTRIBUTE_RESIST_INTOXICATION = 1; // ITX --抗醉
	
	byte ATTRIBUTE_RESIST_SLEEP = 2; // SLP --抗昏睡
	
	byte ATTRIBUTE_RESIST_CONFUSION = 3; // CNF --抗混乱
	
	byte ATTRIBUTE_RESIST_STONE = 4; // STN --抗石化
	
	byte ATTRIBUTE_RESIST_AMNESIA = 5; // AMN --抗遗忘
	
	byte ATTRIBUTE_RESIST_MAGIC = 6; // RSS--抗魔
	
	double addAttributeValue(String attributeType, byte type, double value);
	
	void setAttributeValue(String attributeType, byte type, double value);
	
	double getAttributeValue(String attributeType, byte type);

}
