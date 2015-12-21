package cg.base.animation;

import java.awt.Graphics;

import cg.base.animation.AnimationInfos.AnimationInfo;
import cg.base.image.ImageDictionary;
import cg.base.time.Time;

class MultiImageAnimation implements Animation {
	
	private final AnimationInfo animationInfo;
	
	private int animationIndex, time, width, height, maxWidth, maxHeight;
	
	private byte type;
	
	private boolean isPlay;
	
	private AnimateCallback callback;
	
	private byte percent;
	
	private Time timer;
	
	public MultiImageAnimation(ImageDictionary[] images, int time, Time timer) {
		this(new CAnimationInfo(images, time), timer);
	}
	
	public MultiImageAnimation(AnimationInfo animationInfo, Time timer) {
		this.animationInfo = animationInfo;
		this.timer = timer;
		for (int i = 0;i < animationInfo.getFrame();i++) {
			ImageDictionary image = animationInfo.getImageDictionary(i);
			int width = image.getWidth();
			if (maxWidth < width) {
				maxWidth = width;
			}
			int height = image.getHeight();
			if (maxHeight < height) {
				maxHeight = height;
			}
		}
		updateSize();
		play(0);
	}
	
	protected void updateSize() {
		width = animationInfo.getImageDictionary(animationIndex).getWidth();
		height = animationInfo.getImageDictionary(animationIndex).getHeight();
	}

	@Override
	public void paint(Graphics g, int x, int y) {
		if (getIsPlay()) {
			ImageDictionary image = animationInfo.getImageDictionary(animationIndex);
			image.paint(g, x + image.getOffsetX(), y + image.getOffsetY());
			int currentTime = timer.getTime();
			time = getAnimationInfo().getTime() / getAnimationInfo().getFrame() <= currentTime - time ? currentTime : time;
			if (time == currentTime) {
				animationIndex = animationIndex == animationInfo.getFrame() - 1 ? 0 : animationIndex + 1;
				if (animationIndex == 0) {
					newCycle();
				}
				updateSize();
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
			case TYPE_LOOP : 
				animationIndex = animationIndex == animationInfo.getFrame() - 1 ? 0 : animationIndex + 1;
				break;
			case TYPE_HOLD : 
				
				break;
			case TYPE_ONCE : 
				stop();
				break;
			}
		}
		
		callback();
	}

	@Override
	public void play(int actionId) {
		isPlay = true;
		time = timer.getTime();
	}

	@Override
	public void setType(byte type) {
		this.type = type;
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
	public AnimationInfo getAnimationInfo() {
		return animationInfo;
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
	
	private static class CAnimationInfo implements AnimationInfo {
		
		private final int time;
		
		private final ImageDictionary[] images;
		
		public CAnimationInfo(ImageDictionary[] images, int time) {
			this.images = images;
			this.time = time;
		}

		@Deprecated
		@Override
		public byte getDir() {
			return 0;
		}

		@Deprecated
		@Override
		public byte getActionId() {
			return 0;
		}

		@Override
		public int getTime() {
			return time;
		}

		@Override
		public int getFrame() {
			return images.length;
		}

		@Override
		public ImageDictionary getImageDictionary(int index) {
			return images[index];
		}

		@Override
		public boolean getIsMirror() {
			return false;
		}
		
	}

}
