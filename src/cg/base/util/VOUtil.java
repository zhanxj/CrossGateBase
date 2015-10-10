package cg.base.util;

import java.util.List;

import cg.base.io.proto.VOProtos.VO_ATTRIBUTE;
import cg.base.io.proto.VOProtos.VO_ATTRIBUTES;
import cg.base.sprite.Attribute;

public class VOUtil {
	
	public static void readAttributes(Attribute attribute, List<VO_ATTRIBUTES> attributesList) {
		for (VO_ATTRIBUTES attributes : attributesList) {
			String key = attributes.getType();
			List<VO_ATTRIBUTE> attributeList = attributes.getAttributesList();
			for (VO_ATTRIBUTE vo : attributeList) {
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
