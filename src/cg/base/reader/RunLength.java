package cg.base.reader;

public interface RunLength {
	
	byte HEAD_LENGTH_NO_COLOR = 16;
	
	byte HEAD_LENGTH_COLOR = 20;
	
	byte HEAD_HEAD_0 = 0;
	
	byte HEAD_HEAD_1 = 1;
	
	byte HEAD_VERSION = 2;
	
	byte HEAD_WIDTH = 4;
	
	byte HEAD_HEIGHT = 8;
	
	byte HEAD_DATA_LENGTH = 12;
	
	byte HEAD_COLOR_LENGTH = 16;
	
	byte RED = 0;
	
	byte GREEN = 1;
	
	byte BLUE = 2;
	
	byte FIRST_WORD_N_STRING = 0x0; // 0n String 长度为n的字符串
	
	byte FIRST_WORD_NM_STRING = 0x1; // 1n m String 长度为n*0x100+m的字符串
	
	byte FIRST_WORD_XYZ_STRING = 0x2; // 2x y z String 长度为x*0x10000+y*0x100+z的字符串
	
	byte FIRST_WORD_NX = 0x8; // 8n X 填充n个X
	
	byte FIRST_WORD_NMX = 0x9; // 9n X m 填充n*0x100+m个X
	
	byte FIRST_WORD_XYZ = 0xA; // Ax X y z 填充x*0x10000+y*0x100+z个X
	
	byte FIRST_WORD_N_COLOR = 0xC; // Cn 填充n个背景色
	
	byte FIRST_WORD_NM_COLOR = 0xD; // Dn m 填充n*0x100+m个背景色
	
	byte FIRST_WORD_XYZ_COLOR = 0xE; // Ex y z 填充x*0x10000+y*0x100+z个背景色
	
	short TAIL = 195;
	
	short SAME = 131;

}
