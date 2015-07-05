package cg.base.animation;

import cg.base.animation.AnimationInfos.AnimationInfo;
import cg.base.image.PositionPaintable;

/**
 * 动画单元
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
	 * 停止播放
	 */
	void stop();
	/**
	 * 获得是否正在播放
	 * @return	是否正在播放
	 */
	boolean getIsPlay();
	/**
	 * 获得当前动画的宽度
	 * @return	当前动画的宽度
	 */
	int getWidth();
	/**
	 * 获得当前动画的高度
	 * @return	当前动画的高度
	 */
	int getHeight();
	/**
	 * 获得动画的最大宽度
	 * @return	动画的最大宽度
	 */
	int getMaxWidth();
	/**
	 * 获得动画的最大高度
	 * @return	动画的最大高度
	 */
	int getMaxHeight();
	/**
	 * 获得当前动画序列帧序号
	 * @return	当前动画序列帧序号
	 */
	int getIndex();
	/**
	 * 获得当前动画信息
	 * @return	当前动画信息
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
	void setCallback(AnimateCallback callback, byte percent);

}
