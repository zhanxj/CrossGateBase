package cg.base.util;

import java.util.List;

import cg.base.io.message.VoAttribute;
import cg.base.io.message.VoAttributes;
import cg.base.sprite.Attribute;

public class VOUtil {
	
	public static void readAttributes(Attribute attribute, List<VoAttributes> attributesList) {
		for (VoAttributes attributes : attributesList) {
			String key = attributes.getType();
			List<VoAttribute> attributeList = attributes.getAttributesList();
			for (VoAttribute vo : attributeList) {
				attribute.setAttributeValue(key, (byte) vo.getType(), vo.getValue());
			}
		}
	}
	
	public static byte[] readElements(List<Integer> elementList) {
		int count = elementList.size();
		byte[] elements = new byte[count];
		for (byte i = 0;i < count;i++) {
			elements[i] = elementList.get(i).byteValue();
		}
		return elements;
	}

}
