package cg.base.battle;

public interface ActionProcess {
	
	byte TYPE_USE_SKILL = 1;
	
	byte TYPE_VALUE = 2;
	
	byte TYPE_USE_ITEM = 3;
	
	byte TYPE_WITHDRAW_PET = 4;
	
	byte TYPE_SUMMON_PET = 5;
	
	byte TYPE_ESCAPE = 6;
	
//	byte getType();
	
//	BuffEffectInfo[] getBuffEffectInfos();
	
	Guard getGuard();
	
	byte getTrackType();
	
	Counter getCounter();
	
	ActionProcess getActionProcess();

}
