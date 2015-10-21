package cg.base.battle;

public interface BattleActionInfo {
	
	byte TYPE_USE_SKILL = 1;
	
	byte TYPE_VALUE = 2;
	
	byte TYPE_USE_ITEM = 3;
	
	byte TYPE_WITHDRAW_PET = 4;
	
	byte TYPE_SUMMON_PET = 5;
	
	byte TYPE_ESCAPE = 6;
	
	byte TYPE_LOCAL = 7;
	
	byte getType();
	
	byte getSkillType();
	
	byte getSkillLevel();
	
	short getSkillId();
	
	int getSourceId();
	
	String getTech();
	
	String getMessage();
	
	BuffEffectInfo[] getBuffEffectInfos();
	
	ActionProcess[] getActionProcesses();

}
