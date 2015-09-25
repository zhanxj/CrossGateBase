package cg.base.util;

import java.util.Map;
import java.util.Set;

import com.google.common.collect.Maps;

public class Values {
	
	public static final String TYPE_BYTE = "byte";
	
	public static final String TYPE_INT = "int";
	
	public static final String TYPE_SHORT = "short";
	
	private Map<String, Byte> bytes = Maps.newHashMap();
	
	private Map<String, Integer> ints = Maps.newHashMap();
	
	private Map<String, Short> shorts = Maps.newHashMap();
	
	public void set(String key, byte value) {
		bytes.put(key, value);
	}
	
	public void set(String key, int value) {
		ints.put(key, value);
	}
	
	public void set(String key, short value) {
		shorts.put(key, value);
	}
	
	public byte getByte(String key) {
		return bytes.get(key);
	}
	
	public int getInt(String key) {
		return ints.get(key);
	}
	
	public short getShort(String key) {
		return shorts.get(key);
	}
	
	public String[] getKeys(String type) {
		Set<String> keys = null;
		if (type.equals(TYPE_BYTE)) {
			keys = bytes.keySet();
		} else if (type.equals(TYPE_INT)) {
			keys = ints.keySet();
		} else if (type.equals(TYPE_SHORT)) {
			keys = shorts.keySet();
		}
		return keys == null ? new String[0] : keys.toArray(new String[keys.size()]);
	}
	
	public void removeByte(String key) {
		bytes.remove(key);
	}
	
	public void removeInt(String key) {
		ints.remove(key);
	}
	
	public void removeShort(String key) {
		shorts.remove(key);
	}

}
