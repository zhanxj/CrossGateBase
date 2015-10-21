package cg.base.util;

import java.util.List;

public class CollectionUtil {
	
	@SuppressWarnings("unchecked")
	public static <T> T[] toArray(List<T> list) {
		return (T[]) list.toArray();
	}

}
