package cg.base.animation;

import java.util.function.Function;

import cg.base.animation.AnimationInfos.AnimationInfo;
import cg.base.image.PositionPaintable;

/**
 * ������Ԫ
 * @author 	hyfu
 */
public interface Animation extends PositionPaintable {
	
	/**
	 * play again and again for ever
	 */
	byte TYPE_LOOP = 0;
	/**
	 * play once and disappear
	 */
	byte TYPE_ONCE = 1;
	/**
	 * play once and show the last frame of current animation
	 */
	byte TYPE_HOLD = 2;
	/**
	 * The default value of {@link #setCallback(AnimateCallback, byte)} 's second parameter.
	 * Means 100%
	 */
	byte PERCENT_END = 0;
	
	int ANIMATION_NONE = -1;
	
	/**
	 * To play animation of the actionId
	 * @param actionId
	 */
	void play(int actionId);
	/**
	 * Set the play mode
	 * @param type
	 * @see	#TYPE_HOLD
	 * @see	#TYPE_ONCE
	 * @see	#TYPE_LOOP
	 */
	void setType(byte type);
	/**
	 * ֹͣ����
	 */
	void stop();
	/**
	 * ����Ƿ����ڲ���
	 * @return	�Ƿ����ڲ���
	 */
	boolean getIsPlay();
	/**
	 * ��õ�ǰ�����Ŀ��
	 * @return	��ǰ�����Ŀ��
	 */
	int getWidth();
	/**
	 * ��õ�ǰ�����ĸ߶�
	 * @return	��ǰ�����ĸ߶�
	 */
	int getHeight();
	/**
	 * ��ö����������
	 * @return	�����������
	 */
	int getMaxWidth();
	/**
	 * ��ö��������߶�
	 * @return	���������߶�
	 */
	int getMaxHeight();
	/**
	 * ��õ�ǰ��������֡���
	 * @return	��ǰ��������֡���
	 */
	int getIndex();
	/**
	 * ��õ�ǰ������Ϣ
	 * @return	��ǰ������Ϣ
	 */
	AnimationInfo getAnimationInfo();
	/**
	 * Check a point weather in the current image of this animation.
	 * @param x
	 * @param y
	 * @param spriteX
	 * @param spriteY
	 * @return
	 */
	boolean in(int x, int y, int spriteX, int spriteY);
	/**
	 * To set a callback and will be used when the animation play process at total time's percent.
	 * @param callback
	 * @param percent
	 */
	void setCallback(Function<Animation, Void> function, byte percent);

}
