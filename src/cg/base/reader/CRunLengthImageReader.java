package cg.base.reader;

import static cg.base.image.ImageDictionary.HEAD_VERSION_BITMAP;
import static cg.base.image.ImageDictionary.HEAD_VERSION_RLE;
import static cg.base.image.ImageDictionary.HEAD_VERSION_RLE_COLOR_PALETTES;
import static java.awt.image.BufferedImage.TYPE_INT_ARGB;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.MessageFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cg.base.image.ColorPalette;
import cg.base.image.ImageData;
import cg.base.image.ImageDictionary;
import cg.base.image.ImageManager;
import cg.base.util.MathUtil;

class CRunLengthImageReader {
	
	private static final Logger log = LoggerFactory.getLogger(CRunLengthImageReader.class);
	
	private ColorPalette[] defaultColorPalettes;
	
	private FileInputStream fis;
	
	private ImageManager imageManager;
	
	public CRunLengthImageReader(File file, ImageManager imageManager) {
		this.imageManager = imageManager;
		defaultColorPalettes = imageManager.getDefaultColorPalette();
		try {
			fis = new FileInputStream(file);
		} catch (IOException e) {
			log.error("", e);
		}
	}
	
	public long getSize() {
		try {
			return fis.getChannel().size();
		} catch (IOException e) {
			log.error("", e);
			return 0;
		}
	}
	
	public ImageData read(ImageDictionary imageDictionary, ColorPalette[] colorPalettes) throws IOException {
		if (!imageDictionary.hasColorPalettes()) {
			fis.getChannel().position(imageDictionary.getAddress());
		}
		return new CImageData(fis, imageDictionary, colorPalettes);
	}
	
	public ImageData read(ImageDictionary imageDictionary) throws IOException {
		fis.getChannel().position(imageDictionary.getAddress());
		return imageDictionary.hasColorPalettes() ? new CImageData(fis, imageDictionary) : read(imageDictionary, imageManager.getGlobalColorPalette());
	}
	
//	public BufferedImage read(long offset, String colorPalette) throws IOException {
//		fis.getChannel().position(offset);
//		ImageData imageData = new ImageData(fis, colorPalette);
//		return imageData.image;
//	}
	
	private static class ImageHead implements RunLength {
		
		private char[] head;
		
		private byte version, length;
		
//		private byte unknow;
		
		private int width, height, dataLength, colorPaletteLength;
		
		public ImageHead(InputStream fin, boolean readColorPalette) throws IOException {
			length = readColorPalette ? HEAD_LENGTH_COLOR : HEAD_LENGTH_NO_COLOR;
			byte[] data = new byte[length];
			fin.read(data);
			head = new char[2];
			head[0] = (char) data[HEAD_HEAD_0];
			head[1] = (char) data[HEAD_HEAD_1];
			version = data[HEAD_VERSION];
//			unknow = data[3];
			width = MathUtil.bytesToInt(data, HEAD_WIDTH);
			height = MathUtil.bytesToInt(data, HEAD_HEIGHT);
			dataLength = MathUtil.bytesToInt(data, HEAD_DATA_LENGTH);
			dataLength -= data.length;
			colorPaletteLength = readColorPalette ? MathUtil.bytesToInt(data, HEAD_COLOR_LENGTH) : 0;
		}

		@Override
		public String toString() {
			return MessageFormat.format("{} : [{}] version = {} ; width = {} ; height = {} ; length = {}", getClass().getName(), head[0] + head[1], version, width, height, dataLength);
		}
		
	}
	
	public ColorPalette[] readColorPalettes(long offset) throws IOException {
		fis.getChannel().position(offset);
		ImageHead head = new ImageHead(fis, false);
		try {
			fis.read(new byte[head.dataLength > head.colorPaletteLength ? head.dataLength - head.colorPaletteLength : head.dataLength]);
		} catch (Exception e) {
			log.error("", e);
		}
		return CColorPaletteReader.read(fis, head.colorPaletteLength / 3);
	}
	
	private class CImageData implements ImageData, RunLength {
		
		private ImageHead head;
		
		private int fillCount, size, dataLength;
		
		private BufferedImage image;
		
		private boolean createModle;
		
		private ColorPalette[] colorPalettes;
		
		private String info;
		
		public CImageData(InputStream fis, ImageDictionary imageDictionary, ColorPalette[] colorPalettes) throws IOException {
			loadHead(fis, false);
			byte[] data = new byte[head.dataLength];
			fis.read(data);
			if (head.width != imageDictionary.getWidth() || head.height != imageDictionary.getHeight()) {
				log.error("head[width = {}, height = {}] ; imageDictionary[{}, {}]", head.width, head.height, imageDictionary.getWidth(), imageDictionary.getHeight());
			} else if (head.dataLength + head.length != imageDictionary.getSize()) {
				log.error("data.length = {} ; imageDictionary.getSize() = {}", (head.dataLength + head.length), imageDictionary.getSize());
			} else if (imageDictionary.getHeight() < 0) {
				log.error("imageDictionary.getHeight() = {}", imageDictionary.getHeight());
				return;
			}
			image = new BufferedImage(head.width, head.height, TYPE_INT_ARGB);
			this.colorPalettes = colorPalettes;
			createModle = true;
			load(data, imageDictionary);
		}
		
		public CImageData(FileInputStream fis, ImageDictionary imageDictionary) throws IOException {
			loadHead(fis, true);
			byte[] data = new byte[head.dataLength];
			fis.read(data);
			if (head.width != imageDictionary.getWidth() || head.height != imageDictionary.getHeight()) {
				log.error("head[width = {}, height = {}] ; imageDictionary[{}, {}]", head.width, head.height, imageDictionary.getWidth(), imageDictionary.getHeight());
			} else if (head.dataLength + head.length != imageDictionary.getSize()) {
				log.error("data.length = {} ; imageDictionary.getSize() = {}", (head.dataLength + head.length), imageDictionary.getSize());
			}
			char[] chars = new char[data.length];
			for (int i = 0;i < chars.length;i++) {
				chars[i] = (char) data[i];
			}
			image = new BufferedImage(head.width, head.height, TYPE_INT_ARGB);
			colorPalettes = readColorPalette(data, head.colorPaletteLength);
			createModle = true;
			load(data, imageDictionary);
//			image.print();
		}
		
		private ColorPalette[] readColorPalette(byte[] datas, int length) {
			boolean hasTail = MathUtil.bytesToShort(datas, datas.length - 1, 1) == TAIL;
			int offset = hasTail ? 2 : 1;
			try {
				ColorPalette[] colorPalettes = new ColorPalette[length / 3 - (offset - 1)];
				short[] colors = new short[3];
				dataLength -= offset;
				for (int i = datas.length - offset, index = colorPalettes.length - 1, color = 0;index >= 0;i--, dataLength--) {
					short context = MathUtil.bytesToShort(datas, i, 1);
					switch (context) {
					case SAME : 
						if (hasTail) {
							index = (color == colors.length ? index + 1 : index);
							colorPalettes[index--] = CColorPaletteReader.createColorPalette(colors[color - 1], colors[color - 1], colors[color - 1]);
							color = 0;
							break;
						}
					default : 
						color = (color == colors.length ? 0 : color);
						colors[color] = context;
						if (color == colors.length - 1) {
							colorPalettes[index--] = CColorPaletteReader.createColorPalette(colors[BLUE], colors[GREEN], colors[RED]);
						}
						color++;
					}
				}
				
				return colorPalettes;
			} catch (Exception e) {
				return null;
			}
		}
		
//		public ImageData(InputStream fis, String colorPalette) throws IOException {
//			colorPalettes = CrossGateData.getColorPalettes(colorPalette);
//			byte[] data = loadHead(fis, true);
//			image = new BufferedImage(head.width, head.height, BufferedImage.TYPE_INT_ARGB);
//			load(data);
//		}
		
		private void loadHead(InputStream fis, boolean readColorPalette) throws IOException {
			head = new ImageHead(fis, readColorPalette);
			size = head.width * head.height;
			dataLength = head.dataLength;
		}
		
		private void load(byte[] data, ImageDictionary imageDictionary) throws IOException {
			info = "V:" + imageDictionary.getVersion() + ", ID:" + imageDictionary.getResourceId();
			switch (head.version) {
			case HEAD_VERSION_BITMAP : 
				// TODO
				break;
			case HEAD_VERSION_RLE_COLOR_PALETTES :
			case HEAD_VERSION_RLE : 
				int offset = 0;
				while (offset < dataLength) {
					if (fillCount == size) {
						int cha = dataLength - offset;
						log.error("load({}) : fillCount({}) will out of bound.", info, cha);
						break;
					} else if (fillCount > size) {
						log.error("load({}) : fillCount has been out of bound, offset = {}", info, offset);
					}
					offset = readFirstWord(data, offset);
				}
				if (fillCount > size) {
					log.warn("load({}) : fillCount({}) and size({}).", info, fillCount, size);
				}
				break;
			}
		}
		
		private int readFirstWord(byte[] bytes, int offset) {
			int low = bytes[offset] & 0xF;
			int high = (bytes[offset] & 0xFF) >> 4;
			switch (high) {
			case FIRST_WORD_N_STRING : 
				return readNString(bytes, offset + 1, low);
			case FIRST_WORD_NM_STRING : 
				return readNMString(bytes, offset + 1, low);
			case FIRST_WORD_XYZ_STRING : 
				return readXYZString(bytes, offset + 1, low);
			case FIRST_WORD_NX : 
				return readNX(bytes, offset + 1, low);
			case FIRST_WORD_NMX : 
				return readNMX(bytes, offset + 1, low);
			case FIRST_WORD_XYZ : 
				return readXYZ(bytes, offset + 1, low);
			case FIRST_WORD_N_COLOR : 
				return readNColor(bytes, offset + 1, low);
			case FIRST_WORD_NM_COLOR : 
				return readNMColor(bytes, offset + 1, low);
			case FIRST_WORD_XYZ_COLOR : 
				return readXYZColor(bytes, offset + 1, low);
			default : 
				throw new IllegalArgumentException(MessageFormat.format("{} : {} offset = {}", getClass().getName(), info, offset));
			}
		}
		
		@SuppressWarnings("unused")
		private int getColor(int id) {
			if (createModle) {
				return id;
			} else if (id < 16) {
				return defaultColorPalettes[id].getColor();
			} else if (id > 240) {
				return defaultColorPalettes[id - 224].getColor();
			} else {
				return colorPalettes[id - 16].getColor();
			}
		}
		
		private int readNString(byte[] bytes, int offset, int n) {
			for (int i = 0;i < n;i++) {
				int id = bytes[offset + i] & 0xFF;
				setRGB(id);
				countAdd(1);
			}
			return offset + n;
		}
		
		private int readNMString(byte[] bytes, int offset, int n) {
			int m = bytes[offset] & 0xFF;
			int count = n * 0x100 + m;
			for (int i = 0;i < count;i++) {
				int id = bytes[offset + i + 1] & 0xFF;
				setRGB(id);
				countAdd(1);
			}
			return offset + count + 1;
		}
		
		private int readXYZString(byte[] bytes, int offset, int x) {
			int y = bytes[offset] & 0xFF;
			int z = bytes[offset + 1] & 0xFF;
			int count = x * 0x10000 + y * 0x100 + z;
			for (int i = 0;i < count;i++) {
				int id = bytes[offset + i + 2] & 0xFF;
				setRGB(id);
				countAdd(1);
			}
			return offset + count + 2;
		}
		
		private int readNX(byte[] bytes, int offset, int n) {
			int id = bytes[offset] & 0xFF;
			for (int i = 0;i < n;i++) {
				setRGB(id);
				countAdd(1);
			}
			return offset + 1;
		}
		
		private int readNMX(byte[] bytes, int offset, int n) {
			int m = bytes[offset + 1] & 0xFF;
			int count = n * 0x100 + m;
			int id = bytes[offset] & 0xFF;
			for (int i = 0;i < count;i++) {
				setRGB(id);
				countAdd(1);
			}
			return offset + 2;
		}
		
		private int readXYZ(byte[] bytes, int offset, int x) {
			int y = bytes[offset + 1] & 0xFF;
			int z = bytes[offset + 2] & 0xFF;
			int count = x * 0x10000 + y * 0x100 + z;
			int id = bytes[offset] & 0xFF;
			for (int i = 0;i < count;i++) {
				setRGB(id);
				countAdd(1);
			}
			return offset + 3;
		}
		
		private void setRGB(int id) {
			int x = getFillX(), y = getFillY();
			if (x >= image.getWidth() || y >= image.getHeight() || x < 0 || y < 0) {
				log.error("setRGB({}) : Coordinate out of bounds!({}/{}, {}/{})", info, x, image.getWidth(), y, image.getHeight());
			} else if (head.version == HEAD_VERSION_BITMAP) {
				image.setRGB(x, y, id);
			} else if (colorPalettes.length == 256 || head.version == HEAD_VERSION_RLE_COLOR_PALETTES) {
				if (id < colorPalettes.length) {
					image.setRGB(x, y, colorPalettes[id].getColor());
				} else {
					log.error("setRGB({}) : id = {}, colorPalettes.length = {}", info, id, colorPalettes.length);
				}
			} else if (id < 16) {
				image.setRGB(x, y, defaultColorPalettes[id].getColor());
			} else if (id > 240) {
				image.setRGB(x, y, defaultColorPalettes[id - 224].getColor());
			} else {
				image.setRGB(x, y, colorPalettes[id - 16].getColor());
			}
		}
		
		private int readNColor(byte[] bytes, int offset, int n) {
			countAdd(n);
			return offset;
		}
		
		private int readNMColor(byte[] bytes, int offset, int n) {
			int m = bytes[offset] & 0xFF;
			int count = n * 0x100 + m;
			countAdd(count);
			return offset + 1;
		}
		
		private int readXYZColor(byte[] bytes, int offset, int x) {
			int y = bytes[offset] & 0xFF;
			int z = bytes[offset + 1] & 0xFF;
			int count = x * 0x10000 + y * 0x100 + z;
			countAdd(count);
			return offset + 2;
		}
		
		private int getFillX() {
			return head.width - (size - fillCount - 1) % head.width - 1;
		}
		
		private int getFillY() {
			return (size - fillCount - 1) / head.width;
		}
		
		private boolean countAdd(int n) {
			fillCount += n;
			return fillCount < size;
		}

		@Override
		public BufferedImage getBufferedImage() {
			return image;
		}

		@Override
		public byte getHeadVersion() {
			return head.version;
		}
		
//		private int getColor(int id, byte headVersion) {
//			if (headVersion == HEAD_VERSION_BITMAP) {
//				return id;
//			} else if (colorPalettes.length == 256 || headVersion == HEAD_VERSION_RLE_COLOR_PALETTES) {
//				return colorPalettes[id].getColor();
//			} else if (id < 16) {
//				return defaultColorPalettes[id].getColor();
//			} else if (id > 240) {
//				return defaultColorPalettes[id - 224].getColor();
//			} else {
//				return colorPalettes[id - 16].getColor();
//			}
//		}

		@Override
		public ColorPalette[] getColorPalettes() {
			return colorPalettes;
		}
		
	}

}
