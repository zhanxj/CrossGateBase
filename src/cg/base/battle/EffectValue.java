package cg.base.battle;

public class EffectValue {
	
	public static final byte EFFECT_TYPE_DAMAGE = 0;
	
	public static final byte EFFECT_TYPE_CURE = 1;
	
	public static final byte EFFECT_TYPE_MAGIC = 2;
	
	private final int value;
	
	private final byte effectType;
	
	private final boolean isCritical;
	
	public EffectValue(int value, byte effectType, boolean isCritical) {
		this.value = value;
		this.effectType = effectType;
		this.isCritical = isCritical;
	}

	public int getValue() {
		return value;
	}

	public byte getEffectType() {
		return effectType;
	}

	public boolean isCritical() {
		return isCritical;
	}

}
