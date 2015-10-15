package cg.base.util;

import java.io.PrintStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.google.common.collect.Range;

public class MathUtil {
	
	private static Random random = new Random();
	
	public static boolean isNum(String word){
		return word.matches("^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$");
	}
	
	public static String byteFormat(byte data) {
		int low = data & 0xF;
		int high = (data & 0xFF) >> 4;
		return to0x(high) + to0x(low);
	}
	
	public static String to0x(int value) {
		switch (value) {
		case 10 : 
			return "A";
		case 11 : 
			return "B";
		case 12 : 
			return "C";
		case 13 : 
			return "D";
		case 14 : 
			return "E";
		case 15 : 
			return "F";
		default :
			return value + "";
		}
	}
	
	public static int bytesToInt(byte[] bytes) {
		return bytesToInt(bytes, 0);
	}
	
	public static int bytesToInt(byte[] bytes, int offset) {
		return bytesToInt(bytes, offset, 4);
	}
	
	public static int bytesToInt(byte[] bytes, int offset, int length) {
		int ret = 0;
		for (int i = 0;i < length;i++) {
			int value = bytes[offset + i] & 0xFF;
			ret |= value << (8 * i);
		}
		return ret;
	}
	
	public static int bytesToInt2(byte[] bytes) {
		return bytesToInt2(bytes, 0);
	}
	
	public static int bytesToInt2(byte[] bytes, int offset) {
		return bytesToInt2(bytes, offset, 4);
	}
	
	public static int bytesToInt2(byte[] bytes, int offset, int length) {
		int ret = 0;
		for (int i = 0;i < length;i++) {
			int value = bytes[offset + i] & 0xFF;
			ret |= value << (8 * (length - 1 - i));
		}
		return ret;
	}
	
	public static void intToByte(byte[] bytes, int offset, int length, int value) {
		int max = (int) (Math.pow(0x100, length) - 1);
		if (value > max) {
			throw new IllegalArgumentException(value + " > " + max);
		} else {
			for (int i = 0;i < length;i++) {
				bytes[offset + length - 1 - i] = (byte) (value & 0xFF);
				value >>= 8;
			}
		}
	}
	
	public static void intToByte2(byte[] bytes, int offset, int length, int value) {
		int max = (int) (Math.pow(0x100, length) - 1);
		if (value > max) {
			throw new IllegalArgumentException(value + " > " + max);
		} else {
			for (int i = 0;i < length;i++) {
				bytes[offset + i] = (byte) (value & 0xFF);
				value >>= 8;
			}
		}
	}
	
	public static short bytesToShort(byte[] bytes) {
		return bytesToShort(bytes, 0);
	}
	
	public static short bytesToShort(byte[] bytes, int offset) {
		short ret = 0;
		for (int i = 0;i < 2;i++) {
			short value = (short) (bytes[offset + i] & 0xFF);
			ret |= value << (8 * i);
		}
		return ret;
	}
	
	public static short bytesToShort(byte[] bytes, int offset, int length) {
		short ret = 0;
		for (int i = 0;i < length;i++) {
			short value = (short) (bytes[offset + i] & 0xFF);
			ret |= value << (8 * (length - 1 - i));
		}
		return ret;
	}
	
	public static short bytesToShort2(byte[] bytes, int offset) {
		short ret = 0;
		for (int i = 0;i < 2;i++) {
			short value = (short) (bytes[offset + i] & 0xFF);
			ret |= value << (8 * (1 - i));
		}
		return ret;
	}
	
	public static double getRandom() {
		return random.nextDouble();
	}
	
	public static double getRandom(double min, double max) {
		return min == max ? min : (getRandom() * (max - min) + min);
	}
	
	public static int getRandom(int max) {
		return max == 0 ? 0 : random.nextInt(max);
	}
	
	public static int getRandom(int min, int max) {
		return min == max ? min : getRandom(max - min) + min;
	}
	
	public static int getRandomContainsMax(int min, int max) {
		return getRandom(min, max + 1);
	}
	
	public static int stringToInt(String s) {
		return stringToInt(s, 0);
	}
	
	public static short stringToShort(String s) {
		return stringToShort(s, (short) 0);
	}
	
	public static byte stringToByte(String s) {
		return stringToByte(s, (byte) 0);
	}
	
	public static int stringToInt(String s, int defaultValue) {
		s = s.trim();
		return s.length() > 0 ? Integer.parseInt(s) : defaultValue;
	}
	
	public static short stringToShort(String s, short defaultValue) {
		s = s.trim();
		return s.length() > 0 ? Short.parseShort(s) : defaultValue;
	}
	
	public static byte stringToByte(String s, byte defaultValue) {
		s = s.trim();
		return s.length() > 0 ? Byte.parseByte(s) : defaultValue;
	}
	
	public static String shortToBinaryString(short value) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0;i < 4;i++) {
			byte temp = (byte) (value % 16);
			value >>= 4;
			for (int j = 0;j < 4;j++) {
				stringBuilder.insert(0, temp % 2);
				temp >>= 1;
			}
			stringBuilder.insert(0, " ");
		}
		return stringBuilder.toString();
	}
	
	public static void printBytes(byte[] data, PrintStream out) {
		for (int i = 0;i < data.length;) {
			for (int j = 0;j < 30;j++, i++) {
				out.print(byteFormat(data[i]) + " ");
				if (j == 10 || j == 20) {
					out.print("   ");
				}
				if (i == data.length) {
					break;
				}
			}
			out.println();
		}
		out.println();
	}
	
	public static int[] collectionIntegerToIntArray(Collection<Integer> collection) {
		int[] array = new int[collection.size()];
		int i = 0;
		for (Integer value : collection) {
			array[i++] = value;
		}
		return array;
	}
	
	public static int calcAngle(int x1, int y1, int x2, int y2) {
		double dx = x2 - x1, dy = y2 - y1, k;
		
		if (dx > 0) {
			if (dy > 0) {
				k = dy / dx;
				return (int) (Math.atan(k) * 180 / Math.PI);
			} else if (dy < 0) {
				k = dy / dx;
				return (int) (360 + Math.atan(k) * 180 / Math.PI);
			} else {
				return 0;
			}
		} else if (dx < 0) {
			if (dy == 0) {
				return 180;
			} else {
				k = dy / dx;
				return (int) (180 + Math.atan(k) * 180 / Math.PI);
			}
		} else {
			if (dy > 0) {
				return 90;
			} else if (dy < 0) {
				return 270;
			} else {
				return 0;
			}
		}
	}
    
	public static int charToInt(char c) throws Exception {
        if (c >= 65 && c <= 90) { // ��д
            return c - 65;
        } else if (c >= 97 && c <= 122) { // Сд
            return c - 97;
        } else {
        	throw new Exception("�Ƿ�char��" + c);
        }
    }
    
	public static int charToInt(String column) throws Exception {
        char[] chars = column.toCharArray();
        int v = 0, i = 0;
        for (char ch : chars) {
             v += i * 26 + charToInt(ch);
             i++;
        }
        return v;
    }
	
	/**
	 * �������鳤��
	 * @param 	oldArray
	 * @param 	insertBefore
	 * @param 	addNum
	 * @param 	defaultValue
	 * @return	
	 */
	public static int[] adjustIntArray(int[] oldArray, boolean insertBefore, int addNum, int defaultValue) {
		int len = addNum + oldArray.length;
		int[] newArr = new int[len];
		int i = 0;
		if (insertBefore) {
			while (i < addNum) {
				newArr[i++] = defaultValue;
			}
			System.arraycopy(oldArray, 0, newArr, i, oldArray.length);
		} else {
			System.arraycopy(oldArray, 0, newArr, 0, oldArray.length);
			while (i < addNum) {
				newArr[oldArray.length + i++] = defaultValue;
			}
		}
		return newArr;
	}
	
	public static int divAddOne(int param1, int param2) {
		return param1 / param2 + (param1 % param2 > 0 ? 1 : 0);
	}
	
	public static void listAddArray(List<Integer> list, int[] array) {
		for (int value : array) {
			list.add(value);
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static <T> void mapAddArray(Class T, Map<Integer, T> map, int[] array, T defaultValue) {
		for (int value : array) {
			if (!map.containsKey(value)) {
				map.put(value, defaultValue);
			}
		}
	}
	
	public static int[] stringsToInts(String[] array) {
		int[] ret = new int[array.length];
		for (int i = 0;i < array.length;i++) {
			ret[i] = Integer.parseInt(array[i]);
		}
		return ret;
	}
	
	public static byte booleanToNumber(boolean b) {
		return (byte) (b ? 1 : 0);
	}
	
	public static boolean numberToBoolean(int v) {
		return v > 0 ? true : false;
	}
	
	public static double getRange(int sx, int sy, int tx, int ty) {
		return Math.sqrt((ty - sy) * (ty - sy) + (tx - sx) * (tx - sx));
	}
	
	public static Integer getRandomInRangeInt(Range<Integer> range) {
		return getRandom(range.lowerEndpoint(), range.upperEndpoint());
	}
	
	public static Short getRandomInRangeShort(Range<Short> range) {
		return (short) getRandom(range.lowerEndpoint(), range.upperEndpoint());
	}
	
	public static Byte getRandomInRangeByte(Range<Byte> range) {
		return (byte) getRandom(range.lowerEndpoint(), range.upperEndpoint());
	}
	
	public static Range<Integer> createRange(int value_1, int value_2) {
		return value_1 > value_2 ? Range.closed(value_2, value_1) : Range.closed(value_1, value_2);
	}
	
	public static Range<Short> createRange(short value_1, short value_2) {
		return value_1 > value_2 ? Range.closed(value_2, value_1) : Range.closed(value_1, value_2);
	}
	
	public static Range<Byte> createRange(byte value_1, byte value_2) {
		return value_1 > value_2 ? Range.closed(value_2, value_1) : Range.closed(value_1, value_2);
	}

}
