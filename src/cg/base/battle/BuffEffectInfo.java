package cg.base.battle;

public class BuffEffectInfo {
	
	private final int animation;
	
	private final int headAnimation;
	
	private final EffectValue effectValue;
	
	private final boolean finish;
	
	public BuffEffectInfo(int animation, int headAnimation, EffectValue effectValue, boolean finish) {
		this.animation = animation;
		this.headAnimation = headAnimation;
		this.effectValue = effectValue;
		this.finish = finish;
	}

	public int getAnimation() {
		return animation;
	}

	public EffectValue getEffectValue() {
		return effectValue;
	}

	public boolean isFinish() {
		return finish;
	}

	public int getHeadAnimation() {
		return headAnimation;
	}

}
