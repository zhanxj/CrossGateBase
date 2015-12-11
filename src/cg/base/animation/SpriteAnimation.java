package cg.base.animation;

import java.awt.Graphics;

import cg.base.animation.AnimationInfos.AnimationInfo;
import cg.base.image.ImageDictionary;
import cg.base.time.Time;
import cg.base.util.UnitUtil;

public class SpriteAnimation implements Animation {
	
	private final AnimationInfos animationInfos;
	
	private AnimationInfo animationInfo;
	
	private int interval, animationIndex, time, width, height, maxWidth, maxHeight;
	
	private boolean isPlay;
	
	private byte type;
	
	private AnimateCallback callback;
	
	private byte percent;
	
	private Time timer;
	
	public SpriteAnimation(AnimationInfos animationInfos, Time timer) {
		this.animationInfos = animationInfos;
		this.timer = timer;
	}

	@Override
	public void stop() {
		isPlay = false;
	}

	@Override
	public boolean getIsPlay() {
		return isPlay;
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public int getHeight() {
		return height;
	}
	
	protected void updateSize() {
		width = animationInfo.getImageDictionary(animationIndex).getWidth();
		height = animationInfo.getImageDictionary(animationIndex).getHeight();
	}

	@Override
	public int getMaxWidth() {
		return maxWidth;
	}

	@Override
	public int getMaxHeight() {
		return maxHeight;
	}

	@Override
	public int getIndex() {
		return animationIndex;
	}

	@Override
	public void paint(Graphics g, int x, int y) {
		if (animationInfo != null) {
			ImageDictionary image = animationInfo.getImageDictionary(animationIndex);
			image.paint(g, x + image.getOffsetX(), y + image.getOffsetY());
			int currentTime = timer.getTime();
			if (getIsPlay()) {
				time = interval <= currentTime - time ? currentTime : time;
				if (time == currentTime) {
					animationIndex = animationIndex == animationInfo.getFrame() - 1 ? 0 : animationIndex + 1;
					updateSize();
					if (animationIndex == 0) {
						newCycle();
					}
				}
			}
		} else {
			newCycle();
		}
	}

	@Override
	public AnimationInfo getAnimationInfo() {
		return animationInfo;
	}

	public AnimationInfos getAnimationInfos() {
		return animationInfos;
	}

	@Override
	public void play(int actionId) {
		if (animationInfo == null || UnitUtil.makeAnimationActionId(animationInfo.getDir(), animationInfo.getActionId()) != actionId) {
			animationInfo = animationInfos.getAnimationInfo(actionId);
			if (animationInfo != null) {
				time = timer.getTime();
				interval = animationInfo.getTime() / animationInfo.getFrame();
				isPlay = true;
				time = timer.getTime();
				animationIndex = 0;
				updateSize();
				for (int i = 0;i < animationInfo.getFrame();i++) {
					ImageDictionary image = animationInfo.getImageDictionary(i);
					maxWidth = maxWidth < image.getWidth() ? image.getWidth() : maxWidth;
					maxHeight = maxHeight < image.getHeight() ? image.getHeight() : maxHeight;
				}
			}
		}
		
		if (percent > 0) {
			int currentTime = timer.getTime();
			if ((currentTime - time) * 100 / getAnimationInfo().getTime() >= percent) {
				callback();
			}
		}
	}
	
	protected void newCycle() {
		if (animationInfo != null) {
			switch (type) {
			case TYPE_HOLD : 
				stop();
				break;
			case TYPE_ONCE : 
				animationInfo = null;
				break;
			}
		}
		
		callback();
	}

	@Override
	public void setType(byte type) {
		this.type = type;
	}

	@Override
	public boolean in(int x, int y, int spriteX, int spriteY) {
		ImageDictionary image = getAnimationInfo().getImageDictionary(getIndex());
		int animationX = spriteX + image.getOffsetX(), animationY = spriteY + image.getOffsetY();
		return !(x < animationX || x > animationX + getWidth() || y < animationY || y > animationY + getHeight());
	}

	@Override
	public void setCallback(AnimateCallback callback, byte percent) {
		this.callback = callback;
		this.percent = percent;
		if (percent > 100 || percent < 0) {
			throw new IllegalArgumentException(getClass().getSimpleName() + "::setCallback() : percent " + percent + " is do not support.");
		}
	}
	
	protected void callback() {
		if (callback != null) {
			AnimateCallback callback = this.callback;
			this.callback = null;
			callback.animationCallback();
		}
	}

}
