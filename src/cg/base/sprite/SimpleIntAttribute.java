package cg.base.sprite;

import java.util.HashMap;
import java.util.Map;

import cg.base.sprite.Attribute;

public class SimpleIntAttribute implements Attribute {
	
	private static final Map<String, Byte> offsets = new HashMap<String, Byte>();
	
	private int[] attributes = new int[33];
	
	static {
		offsets.put(ATTRIBUTE_TYPE_BASE, (byte) 0);
		offsets.put(ATTRIBUTE_TYPE_EXTEND, (byte) 9);
		offsets.put(ATTRIBUTE_TYPE_RESIST, (byte) 15);
		offsets.put(ATTRIBUTE_TYPE_BP, (byte) 22);
		offsets.put(ATTRIBUTE_TYPE_WORK, (byte) 28);
	}

	@Override
	public double addAttributeValue(String attributeType, byte type, double value) {
		return attributes[calcIndex(attributeType, type)] += value;
	}
	
	private int calcIndex(String attributeType, byte type) {
		return offsets.get(attributeType) + type;
	}

	@Override
	public void setAttributeValue(String attributeType, byte type, double value) {
		attributes[calcIndex(attributeType, type)] = (int) value;
	}

	@Override
	public double getAttributeValue(String attributeType, byte type) {
		return attributes[calcIndex(attributeType, type)];
	}

}
