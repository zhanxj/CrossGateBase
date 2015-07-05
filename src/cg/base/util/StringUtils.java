package cg.base.util;

public class StringUtils {

	/**
	 * 首字母大写
	 * @param 	text
	 * 			文本
	 * @return	首字母大写后的文本
	 */
	public static String firstUpper(String text) {
		return text.substring(0, 1).toUpperCase() + text.substring(1);
	}

	/**
	 * 首字母小写
	 * @param 	text
	 * 			文本
	 * @return	首字母小写后的文本
	 */
	public static String firstLower(String text) {
		return text.substring(0, 1).toLowerCase() + text.substring(1);
	}

}
