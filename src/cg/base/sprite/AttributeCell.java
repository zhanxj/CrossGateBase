package cg.base.sprite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AttributeCell {
	
	private final String attributeType;
	
	private final Map<Byte, Double> values;
	
	public AttributeCell(String attributeType) {
		this.attributeType = attributeType;
		values = new HashMap<Byte, Double>();
	}

	public String getAttributeType() {
		return attributeType;
	}
	
	public void setValue(byte type, double value) {
		values.put(type, value);
	}
	
	public double getValue(byte type) {
		return values.get(type);
	}
	
	public Collection<Byte> getKeys() {
		return values.keySet();
	}

}
