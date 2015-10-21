package cg.base.battle;

public class EffectValue {
	
	public static final byte EFFECT_TYPE_DAMAGE = 0;
	
	public static final byte EFFECT_TYPE_CURE = 1;
	
	public static final byte EFFECT_TYPE_MAGIC = 2;
	
	public static final byte EFFECT_TYPE_OTHER = 3;
	
	public static final byte EFFECT_TYPE_LOYAL = 3;
	
	private final int value;
	
	private final byte effectType;
	
	private final boolean isCritical;
	
	private final String message;
	
	public EffectValue(int value, byte effectType, boolean isCritical, String message) {
		this.value = value;
		this.effectType = effectType;
		this.isCritical = isCritical;
		this.message = message;
	}
	
	public EffectValue(int value, byte effectType, boolean isCritical) {
		this(value, effectType, isCritical, null);
	}
	
	public EffectValue(int value, byte effectType) {
		this(value, effectType, false, null);
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

	public String getMessage() {
		return message;
	}

}
