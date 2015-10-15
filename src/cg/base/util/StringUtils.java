package cg.base.util;

public class StringUtils {

	public static String firstUpper(String text) {
		return text.substring(0, 1).toUpperCase() + text.substring(1);
	}

	public static String firstLower(String text) {
		return text.substring(0, 1).toLowerCase() + text.substring(1);
	}
	
	public static String makeJavaClassName(String name) {
		String[] names = name.split("_");
		StringBuilder nameBuilder = new StringBuilder();
		for (String nam : names) {
			nameBuilder.append(firstUpper(nam.toLowerCase()));
		}
		return nameBuilder.toString();
	}

}
