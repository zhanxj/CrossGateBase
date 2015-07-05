package cg.base.skill;

public interface SkillLevelInfo {
	
	/**
	 * 0位：是否需要选择活着的目标
	 */
	byte TARGET_SELECT_ALIVE = 0;
	/**
	 * 1位：是否需要选择死亡的目标
	 */
	byte TARGET_SELECT_DIE = 1;
	/**
	 * 2位：是否可以选择友好单位
	 */
	byte TARGET_SELECT_FRIEND = 2;
	/**
	 * 3位：是否可以选择自己
	 */
	byte TARGET_SELECT_ME = 3;
	/**
	 * 4位：是否可以选择自己小队
	 */
	byte TARGET_FRIEND = 4;
	/**
	 * 5位：是否可以选择敌人
	 */
	byte TARGET_ENEMY = 5;
	/**
	 * 6位：影响一个单位
	 */
	byte TARGET_SINGLE = 6;
	/**
	 * 7位：影响四个单位
	 */
	byte TARGET_FOUR = 7;
	/**
	 * 8位：影响十个单位
	 */
	byte TARGET_TEAM = 8;
	/**
	 * 9位：影响全部单位
	 */
	byte TARGET_ALL = 9;
	/**
	 * 10位：从所有单位中选择
	 */
	byte TARGET_ALL_IN = 10;
	
	String TECH_NormalGuard = "TECH_NormalGuard";
	
	String TECH_SpecialGuard = "TECH_SpecialGuard";
	
	String TECH_CrossCounter = "TECH_CrossCounter";
	
	String TECH_Reflection_Physics = "TECH_Reflection_Physics";
	
	String TECH_Reflection_Magic = "TECH_Reflection_Magic";
	
	String TECH_Absorb_Physics = "TECH_Absorb_Physics";
	
	String TECH_Absorb_Magic = "TECH_Absorb_Magic";
	
	String TECH_Ineffective_Physics = "TECH_Ineffective_Physics";
	
	String TECH_Ineffective_Magic = "TECH_Ineffective_Magic";
	
	String TECH_SpiracleShot = "TECH_SpiracleShot";
	
	String TECH_RandomShot = "TECH_RandomShot";
	
	String TECH_Madmax = "TECH_Madmax";
	
	String TECH_GuardBreak = "TECH_GuardBreak";
	
	String TECH_AglUp = "TECH_AglUp";
	
	String TECH_AglDown = "TECH_AglDown";
	
	String TECH_Mikawashi = "TECH_Mikawashi";
	
	String TECH_Parameter = "TECH_Parameter";
	
	String TECH_Treat_Type = "TECH_Treat_Type";
	
	String TECH_StatusChange = "TECH_StatusChange";
	
	String TECH_Steal = "TECH_Steal";
	
	String TECH_Assassin = "TECH_Assassin";
	
	String TECH_FullBodyGuard = "TECH_FullBodyGuard";
	
	String TECH_BodyGuard = "TECH_BodyGuard";
	
	String TECH_RiderPet = "TECH_RiderPet";
	
	String TECH_NormalAttack = "TECH_NormalAttack";
	
	String TECH_Consentration = "TECH_Consentration";
	
	String TECH_LpRecovery = "TECH_LpRecovery";
	
	String TECH_BloodAttack = "TECH_BloodAttack";
	
	String TECH_Reverse_Type = "TECH_Reverse_Type";
	
	String TECH_GoldAttack = "TECH_GoldAttack";
	
	String TECH_EquipBreakAttack = "TECH_EquipBreakAttack";
	
	String TECH_Death = "TECH_Death";
	
	String TECH_Bomb = "TECH_Bomb";
	
	String TECH_Forcecut = "TECH_Forcecut";
	
	String TECH_ContinuationAttack = "TECH_ContinuationAttack";
	
	String TECH_Heal_Magic = "TECH_Heal_Magic";
	
	String TECH_Dorain = "TECH_Dorain";
	
	String TECH_StatusAttack = "TECH_StatusAttack";
	
	String TECH_AtkDown = "TECH_AtkDown";
	
	String TECH_AtkUp = "TECH_AtkUp";
	
	String TECH_DefDown = "TECH_DefDown";
	
	String TECH_DefUp = "TECH_DefUp";
	
	String TECH_MagicGuard = "TECH_MagicGuard";
	
	String getName();
	
	String getDescription();
	
	byte getLevel();
	
	byte getUseSpace();
	
	short getCostMp();
	
	short getTargetType();
	
	short[] getProduces();
	
	String getTechType();

}
