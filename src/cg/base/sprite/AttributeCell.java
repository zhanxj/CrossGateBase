package cg.base.sprite;

import java.util.Collection;
import java.util.Map;

import com.google.common.collect.Maps;

public class AttributeCell {
	
	private final String attributeType;
	
	private final Map<Byte, Double> values;
	
	public AttributeCell(String attributeType) {
		this.attributeType = attributeType;
		values = Maps.newHashMap();
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
