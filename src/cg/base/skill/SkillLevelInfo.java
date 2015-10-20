package cg.base.skill;

public interface SkillLevelInfo {
	
	/**
	 * 0λ���Ƿ���Ҫѡ����ŵ�Ŀ��
	 */
	byte TARGET_SELECT_ALIVE = 0;
	/**
	 * 1λ���Ƿ���Ҫѡ��������Ŀ��
	 */
	byte TARGET_SELECT_DIE = 1;
	/**
	 * 2λ���Ƿ����ѡ���Ѻõ�λ
	 */
	byte TARGET_SELECT_FRIEND = 2;
	/**
	 * 3λ���Ƿ����ѡ���Լ�
	 */
	byte TARGET_SELECT_ME = 3;
	/**
	 * 4λ���Ƿ����ѡ���Լ�С��
	 */
	byte TARGET_FRIEND = 4;
	/**
	 * 5λ���Ƿ����ѡ�����
	 */
	byte TARGET_ENEMY = 5;
	/**
	 * 6λ��Ӱ��һ����λ
	 */
	byte TARGET_SINGLE = 6;
	/**
	 * 7λ��Ӱ���ĸ���λ
	 */
	byte TARGET_FOUR = 7;
	/**
	 * 8λ��Ӱ��ʮ����λ
	 */
	byte TARGET_TEAM = 8;
	/**
	 * 9λ��Ӱ��ȫ����λ
	 */
	byte TARGET_ALL = 9;
	/**
	 * 10λ�������е�λ��ѡ��
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
	
	String TECH_PanicAttack = "TECH_PanicAttack";
	
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
