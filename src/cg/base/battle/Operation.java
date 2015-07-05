package cg.base.battle;

import cg.base.item.ItemInfo;

public interface Operation {
	
	byte TYPE_USE_SKILL = 1;
	
	byte TYPE_VALUE = 2;
	
	byte TYPE_USE_ITEM = 3;
	
	byte TYPE_WITHDRAW_PET = 4;
	
	byte TYPE_SUMMON_PET = 5;
	
	byte TYPE_ESCAPE = 6;
	
	byte TYPE_MISS = 7;
	
//	byte TYPE_BUFF = 8;
	
	byte TYPE_LOCAL = 9;
	
	byte TYPE_BUFF_FINISH = 10;
	
	byte TYPE_SHUOT_MESSAGE = 11;
	
	byte TYPE_DIE = 12;
	//--------------------------------------------
	byte TYPE_BUFF = 0;
	
	byte TYPE_COST = 2;
	
	byte TYPE_TARGET = 3;
	
	byte TYPE_BACK = 4;
	
	byte TYPE_BODYGUARD = 5;
	
	byte TYPE_COUNTER = 6;
	
	
	byte PARAM_SKILL_TYPE = 0;
	
	byte PARAM_SKILL_TECH = 1;
	
	byte PARAM_SKILL_ID = 2;
	
	byte PARAM_SKILL_LEVEL = 3;
	
	byte PARAM_SKILL_TARGET_COUNT = 4;
	
	byte PARAM_SKILL_MESSAGE = 5;
	
	byte PARAM_VALUE_TECH = 0;
	
	byte PARAM_VALUE_VALUE = 1;
	
	byte PARAM_VALUE_CRITICAL = 2;
	
	byte PARAM_BUFF_TECH = 0;
	
	
	byte BUFF_SHOUT_CHANNEL = 0;
	
	byte BUFF_SHOUT_MESSAGE = 1;
	
	byte BUFF_REMOVE = 2;
	
	byte BUFF_ACTION = 3;

	
	byte ACTION_INFO_ID = 0;
	
	byte ACTION_INFO_WORD_TYPE = 1;
	
	byte ACTION_INFO_WORD = 2;
	
	byte ACTION_INFO_ATTACH_COUNT = 3;
	
	byte ACTION_INFO_ATTACH = 4;
	
	
//	byte PREPARE_ACTION = 0;
	
//	byte PREPARE_TARGET = 1;
	
//	byte PREPARE_RUN_TYPE = 2;
	
//	byte PREPARE_BODYGUARD = 3;
	
	
	byte RUN_TYPE_NONE = 0;
	
	byte RUN_TYPE_TARGET = 1;
	
	byte RUN_TYPE_ALL = 2;
	
	byte RUN_TYPE_TEAM_A = 3;
	
	byte RUN_TYPE_TEAM_B = 4;
	

	byte COST_BEGIN_ANIMATION = 0;
	
	byte COST_PREPARE = 1;
	
	byte COST_PREPARE_TARGETS = 2;
	
	byte COST_ACTION = 3;
	
	byte COST_TO_ALL = 4;
	
	byte COST_HIT_TYPE = 5;
	
	byte COST_HIT_ANIMATION = 6;
	
	byte COST_RUN_TYPE = 7;
	
	byte COST_BODYGUARD = 8;
	
	
	byte BODYGUARD_TARGET = 0;

	
	byte COUNTER_ACTION = 0;

	
	byte TARGET_ACTION = 0;
	
	byte TARGET_RESULT_TYPE = 1;
	
	byte TARGET_RESULT = 2;
	
	
	byte DIE_NORMAL = 0;
	
	byte DIE_FLY = 1;
	
	byte DIE_OUT = 2;
	
	byte DIE_DISAPPEAR = 3;
	
	
	byte RESULT_TYPE_NULL = 0;
	
	byte RESULT_TYPE_DIE = 1;
	
	byte RESULT_TYPE_ANIMATION = 2;
	
	
	byte TARGET_ACTION_TYPE_ACTION = 0;
	
	byte TARGET_ACTION_TYPE_NULL = 1;
	
	/**
	 * The common process.
	 */
	byte HIT_TYPE_NORMAL = 0;
	/**
	 * Skill 'SPIRACLE' process.
	 */
	byte HIT_TYPE_SPIRACLE = 1;
	/**
	 * Some skill/item have an animation process,for example:Magic.
	 */
	byte HIT_TYPE_ANIMATION = 2;
	/**
	 * When sprite equip 'bow'.
	 */
	byte HIT_TYPE_BOW = ItemInfo.TYPE_BOW;
	/**
	 * When sprite equip 'knife'.
	 */
	byte HIT_TYPE_KNIFE = ItemInfo.TYPE_KNIFE;
	/**
	 * When sprite equip 'BOOMERANG'.
	 */
	byte HIT_TYPE_BOOMERANG = ItemInfo.TYPE_BOOMERANG;
	
	/**
	 * The index of animation.
	 */
	byte PREPARE_INFO_ACTION = 0;
	/**
	 * The direction of sprite when he playing prepare action.
	 */
	byte PREPARE_INFO_DIRECTION = 1;
	/**
	 * When play prepare action finish,target/targets perhaps attach an animation.
	 */
	byte PREPARE_INFO_TARGET_ANIMATION = 2;

	
	byte WORD_TYPE_NULL = -1;
	
	byte WORD_TYPE_DAMAGE = 0;
	
	byte WORD_TYPE_CURE = 1;
	
	byte WORD_TYPE_FORCECUT = 2;
	
	byte WORD_TYPE_IMAGE = 3;
	
	int getOwnerId();
	
	byte getType();
	
	String[] getParams();
	
	void addChild(Operation child);
	
	void addChildren(Operation[] children);
	
	Operation[] getChildren();

}
