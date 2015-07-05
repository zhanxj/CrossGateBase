package cg.base.animation;

import java.awt.Graphics;

import cg.base.animation.AnimationInfos.AnimationInfo;
import cg.base.image.ImageDictionary;

public class ImageAnimation implements Animation {
	
	protected ImageDictionary image;
	
	public ImageAnimation(ImageDictionary image) {
		this.image = image;
	}

	@Override
	public void paint(Graphics g, int x, int y) {
		if (image != null) {
			image.paint(g, x + image.getOffsetX(), y + image.getOffsetY());
		}
	}

	@Deprecated
	@Override
	public void play(int actionId) {}

	@Deprecated
	@Override
	public void setType(byte type) {}

	@Deprecated
	@Override
	public void stop() {}

	@Deprecated
	@Override
	public boolean getIsPlay() {
		return true;
	}

	@Override
	public int getWidth() {
		return image.getWidth();
	}

	@Override
	public int getHeight() {
		return image.getHeight();
	}

	@Override
	public int getMaxWidth() {
		return getWidth();
	}

	@Override
	public int getMaxHeight() {
		return getHeight();
	}

	@Override
	public int getIndex() {
		return 0;
	}

	@Deprecated
	@Override
	public AnimationInfo getAnimationInfo() {
		return null;
	}

	@Override
	public boolean in(int x, int y, int spriteX, int spriteY) {
		int animationX = spriteX + image.getOffsetX(), animationY = spriteY + image.getOffsetY();
		return !(x < animationX || x > animationX + getWidth() || y < animationY || y > animationY + getHeight());
	}

	@Deprecated
	@Override
	public void setCallback(AnimateCallback callback, byte percent) {}

}
