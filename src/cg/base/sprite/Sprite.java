package cg.base.sprite;

import java.util.function.Function;

import cg.base.animation.Animation;
import cg.base.drawer.SpriteDrawer;

public interface Sprite {
	
	byte ANIMATION_ACTION_STAND = 0;
	
	byte ANIMATION_ACTION_WALK = 1;
	
	byte ANIMATION_ACTION_RUN_PREPARE = 2;
	
	byte ANIMATION_ACTION_RUN = 3;
	
	byte ANIMATION_ACTION_RUN_FINISH = 4;
	
	byte ANIMATION_ACTION_ATTACK = 5;
	
	byte ANIMATION_ACTION_MAGIC = 6;
	
	byte ANIMATION_ACTION_PELT = 7;
	
	byte ANIMATION_ACTION_INJURIES = 8;
	
	byte ANIMATION_ACTION_DEFEND = 9;
	
	byte ANIMATION_ACTION_DOWN = 10;
	
	byte ANIMATION_ACTION_SIT_DOWN = 11;
	
	byte ANIMATION_ACTION_BECKON = 12;
	
	byte ANIMATION_ACTION_HAPPY = 13;
	
	byte ANIMATION_ACTION_ANGRY = 14;
	
	byte ANIMATION_ACTION_SAD = 15;
	
	byte ANIMATION_ACTION_BOW = 16;
	
	byte ANIMATION_ACTION_MORA_STONE = 17;
	
	byte ANIMATION_ACTION_MORA_SHEARS = 18;
	
	byte ANIMATION_ACTION_MORA_COVER = 19;
	
	byte ANIMATION_ACTION_FISHING = 20;
	
	byte ANIMATION_WEAPON_AXE = 0;
	
	byte ANIMATION_WEAPON_BOW = 1;
	
	byte ANIMATION_WEAPON_HAND = 2;
	
	byte ANIMATION_WEAPON_SWORD = 3;
	
	byte ANIMATION_WEAPON_STAFF = 4;
	
	byte ANIMATION_WEAPON_SPEAR = 5;
	
	byte ANIMATION_ROLE_COLOR_0 = 0;
	
	byte ANIMATION_ROLE_COLOR_1 = 1;
	
	byte ANIMATION_ROLE_COLOR_2 = 2;
	
	byte ANIMATION_ROLE_COLOR_3 = 3;
	
	byte FACE_MOUTH_0 = 0;
	
	byte FACE_MOUTH_1 = 1;
	
	byte FACE_MOUTH_2 = 2;
	
	byte FACE_MOUTH_3 = 3;
	
	byte FACE_MOUTH_4 = 4;
	
	byte FACE_MOUTH_COUNT = 5;
	
	byte FACE_EYE_0 = 0;
	
	byte FACE_EYE_1 = 1;
	
	byte FACE_EYE_2 = 2;
	
	byte FACE_EYE_3 = 3;
	
	byte FACE_EYE_4 = 4;
	
	byte FACE_EYE_COUNT = 5;
	
	byte FACE_HAIR_0 = 0;
	
	byte FACE_HAIR_1 = 1;
	
	byte FACE_HAIR_2 = 2;
	
	byte FACE_HAIR_3 = 3;
	
	byte ROLE_COLOR_AMOUNT = 4;
	
	byte SETACTION_STAND = 1; // վ��...��Ĭ��
	
	byte SETACTION_NOTHING = 2; // ��ֹ...��������ʲô����,����ʯ��һ����
	
	byte SETACTION_RUN = 3; // �ܲ�
	
	byte SETACTION_NOTHING_2 = 4; // ͬ2
	
	byte SETACTION_ATTACK = 5; // ����
	
	byte SETACTION_MAGIC = 6; // ħ��
	
	byte SETACTION_THROW = 7; // Ͷ��
	
	byte SETACTION_INJURED = 8; // ����...��������������
	
	byte SETACTION_DEFEND = 9; // ����
	
	byte SETACTION_DOWN = 10; // ����
	
	byte SETACTION_SIT = 11; // ����
	
	byte SETACTION_BECKON = 12; // ����
	
	byte SETACTION_HAPPY = 13; // ����
	
	byte SETACTION_ANGRY = 14; // ����
	
	byte SETACTION_CRY = 15; // ����
	
	byte SETACTION_NOD = 16; // ��ͷ
	
	byte SETACTION_FIST = 17; // ����...ȭͷ
	
	byte SETACTION_SHEARS = 18; // ����...����
	
	byte SETACTION_HAND = 19; // ����...��
	
	Unit getUnit();
	
	Animation getAnimation();
	
	void setLevel(short level);
	
	short getLevel();
	
	void setSpriteDraw(SpriteDrawer spriteDraw);
	/**
	 * To attach an animation on this sprite by the parameter animationdId.
	 * The animation needs a play type : <code>TYPE_LOOP, TYPE_ONCE or TYPE_HOLD</code>. 
	 * Sometimes needs a callback which class is {@link AnimateCallback}, the callback
	 * will be used at the animation play once finish.
	 * @param animationdId
	 * @param callback
	 * @param type
	 * @return
	 * @see	{@link Animation#TYPE_LOOP}
	 * @see	{@link Animation#TYPE_ONCE}
	 * @see	{@link Animation#TYPE_HOLD}
	 */
	String attachAnimation(int animationdId, Function<Animation, Void> function, byte type, byte percent);
	
	Animation getAttachAnimation(String key);
	
	void removeAttachAnimation(String key);

}
