package cg.base.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

import cg.base.image.ColorPalette;
import cg.base.util.MathUtil;

import com.google.common.collect.Maps;

public class CColorPaletteReader {
	
	public Map<String, ColorPalette[]> read(File file) {
		Map<String, ColorPalette[]> ret = Maps.newHashMap();
		if (file.isDirectory()) {
			String[] fileNames = file.list();
			for (String fileName : fileNames) {
				File colorPaletteFile = new File(file, fileName);
				try {
					ret.put(fileName, read(new FileInputStream(colorPaletteFile), 236));
				} catch (IOException e) {
					e.printStackTrace();
					break;
				}
			}
		}
		return ret;
	}
	
	public static ColorPalette[] read(FileInputStream fis, int length) throws IOException {
		byte[] datas = new byte[length * 3];
		fis.read(datas);
		ColorPalette[] colorPalettes = new ColorPalette[length];
		for (int i = 0;i < colorPalettes.length;i++) {
			short blue = MathUtil.bytesToShort(datas, i * 3, 1);
			short green = MathUtil.bytesToShort(datas, i * 3 + 1, 1);
			short red = MathUtil.bytesToShort(datas, i * 3 + 2, 1);
			colorPalettes[i] = createColorPalette(blue, green, red);
		}
		return colorPalettes;
	}
	
	public static ColorPalette createColorPalette(short blue, short green, short red) {
		return new CColorPalette(blue, green, red);
	}
	
	public static ColorPalette createColorPalette(short alpha, short blue, short green, short red) {
		return new CColorPalette(alpha, blue, green, red);
	}
	
	public static int getColor(short blue, short green, short red) {
		return (red << 16) | (green << 8) | blue;
	}
	
	private static class CColorPalette implements ColorPalette {
		
		private static final short DEFAULT_ALPHA = 255;
		
		private short red;
		
		private short blue;
		
		private short green;
		
		private short alpha;
		
		private int color;
		
		public CColorPalette(short alpha, short blue, short green, short red) {
			this.blue = blue;
			this.green = green;
			this.red = red;
			this.alpha = alpha;
			color = (alpha << 24) | (red << 16) | (green << 8) | blue;
		}
		
		public CColorPalette(short blue, short green, short red) {
			this(DEFAULT_ALPHA, blue, green, red);
		}

		@Override
		public short getRed() {
			return red;
		}

		@Override
		public short getBlue() {
			return blue;
		}

		@Override
		public short getGreen() {
			return green;
		}

		@Override
		public int getColor() {
			return color;
		}

		@Override
		public short getAlpha() {
			return alpha;
		}

		@Override
		public int getRGBColor() {
			return (red << 16) | (green << 8) | blue;
		}

		@Override
		public String toString() {
			return "color[" + getColor() + "] RGB[" + getRGBColor() + "] [" + getRed() + ", " + getGreen() + "," + getBlue() + "]";
		}

	}

}
