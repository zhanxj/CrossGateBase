package cg.base.item;

public interface ItemInfo {
	
	byte TYPE_NOT_WEAPON = -1;
	
	byte TYPE_SWORD = 0;
	
	byte TYPE_AXE = 1;
	
	byte TYPE_SPEAR = 2;
	
	byte TYPE_STAFF = 3;
	
	byte TYPE_BOW = 4;
	
	byte TYPE_KNIFE = 5;
	
	byte TYPE_BOOMERANG = 6;
	
	byte TYPE_SHIELD = 7;
	
	byte TYPE_HELMET = 8;
	
	byte TYPE_HAT = 9;
	
	byte TYPE_ARMOR = 10;
	
	byte TYPE_CLOTHES = 11;
	
	byte TYPE_GOWN = 12;
	
	byte TYPE_BOOTS = 13;
	
	byte TYPE_SHOE = 14;
	
	byte TYPE_BRACELET = 15;
	
	byte TYPE_INSTRUMENTS = 16;
	
	byte TYPE_NECKLACE = 17;
	
	byte TYPE_RING = 18;
	
	byte TYPE_HEADBAND = 19;
	
	byte TYPE_EARRING = 20;
	
	byte TYPE_AMULET = 21;
	
	byte TYPE_CRYSTAL = 22;
	
	byte TYPE_FOOD = 23;
	
	byte TYPE_FURNITURE = 24;
	
	byte TYPE_MYSTERY = 25;
	
	byte TYPE_OTHER = 26;
	
	byte TYPE_ORE = 29;
	
	byte TYPE_WOOD = 30;
	
	byte TYPE_CLOTH = 31;
	
	byte TYPE_MEET = 32;
	
	byte TYPE_FISH = 33;
	
	byte TYPE_VEGETABLE = 34;
	
	byte TYPE_INGREDIENTS = 35; // 其它（食材）
	
	byte TYPE_VANILLA = 36;
	
	byte TYPE_MATERIAL = 37;
	
	byte TYPE_GEM = 38;
	
	byte TYPE_UNKNOW = 39;
	
	byte TYPE_SEAL = 40;
	
	byte TYPE_ILLUSTRATIONS = 41; // 图鉴卡
	
	byte TYPE_QUEST_FOOD = 42; // 任务食物
	
	byte TYPE_SOLUTION = 43;
	
	byte TYPE_BOOK = 44;
	
	byte TYPE_UNKNOW_MAP = 45;
	
	byte TYPE_RED_PRISM = 46;
	
	byte TYPE_LOTTERY_TICKET = 47;
	
	byte TYPE_QUEST = 48;
	
	byte TYPE_BOMB = 51;
	
	byte TYPE_DROPPINGS = 52; // 家族兽粪便
	
	byte TYPE_PASTRY = 53; // 家族兽点心
	
	byte TYPE_OCARINA = 54; // 家族兽之笛
	
	byte TYPE_HEADDRESS = 55; // 头饰
	
	int getId();
	
	int getIconId();
	
	byte getType();
	
	byte getLevel();
	
	String getDescription();
	
	String getRightButtonDescription();
	
	boolean getLogoutDispear();
	
	boolean getDropDispear();
	
	boolean getCanPostByPet();
	
	boolean getCanUseInBattle();

}
