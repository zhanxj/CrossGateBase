package cg.base.reader;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.FileInputStream;
import java.io.IOException;

import cg.base.image.ImageDictionary;
import cg.base.image.ImageManager;
import cg.base.io.ImageResource;
import cg.base.util.MathUtil;

public class CImageDictionary extends CAnimationDictionary implements ImageDictionary {
	
	private static final byte COLOR_PALETTE_IMAGE_WIDTH = 4;
	
	private static final byte COLOR_PALETTE_IMAGE_HEIGHT = 1;
	
	protected int offsetX, offsetY, width, height, size;
	
	protected byte useEast, useSouth, mark;
	
	protected long address;
	
	protected boolean colorPalette;
	
	protected BufferedImage image;
	
	protected AlphaComposite alphaComposite;
	
	protected ImageManager imageManager;
	
	public CImageDictionary(FileInputStream fis, ImageResource resource, ImageManager imageManager) throws IOException {
		this();
		this.imageManager = imageManager;
		version = resource.getVersion();
		colorPalette = resource.isColorPalette();
		byte[] datas = new byte[DATA_HEAD_LENGTH];
		fis.read(datas);
		resourceId = MathUtil.bytesToInt(datas, STREAM_RESOURCE_ID);
		address = MathUtil.bytesToInt(datas, STREAM_ADDRESS);
		size = MathUtil.bytesToInt(datas, STREAM_SIZE);
		offsetX = MathUtil.bytesToInt(datas, STREAM_OFFSET_X);
		offsetY = MathUtil.bytesToInt(datas, STREAM_OFFSET_Y);
		width = MathUtil.bytesToInt(datas, STREAM_WIDTH);
		height = MathUtil.bytesToInt(datas, STREAM_HEIGHT);
		useEast = datas[STREAM_USE_EAST];
		useSouth = datas[STREAM_USE_SOUTH];
		mark = datas[STREAM_MARK];
		globalId = MathUtil.bytesToInt(datas, STREAM_GLOBAL_ID);
	}
	
	protected CImageDictionary() {
		super();
	}

	@Override
	public int getOffsetX() {
		return offsetX;
	}

	@Override
	public int getOffsetY() {
		return offsetY;
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public byte getUseEast() {
		return useEast;
	}

	@Override
	public byte getUseSouth() {
		return useSouth;
	}

	@Override
	public byte getMark() {
		return mark;
	}

	@Override
	public long getAddress() {
		return address;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean hasColorPalettes() {
		return colorPalette || (width == COLOR_PALETTE_IMAGE_WIDTH && height == COLOR_PALETTE_IMAGE_HEIGHT);
	}

	@Override
	public String toString() {
		return getClass() + " : version = " + version + " ; globalId = " + globalId + " ; imageId = " + resourceId;
	}
	
	@Override
	public void paint(Graphics g, int x, int y) {
		if (alphaComposite == null) {
			g.setClip(x, y, getWidth(), getHeight());
			BufferedImage image = bufferedImage();
			g.drawImage(image, x, y, null);
		} else {
			paint(x, y, null);
		}
	}
	
	protected void paint(int x, int y, ImageObserver observer) {
		Graphics2D g2d = image.createGraphics();
		g2d.setComposite(alphaComposite);
		g2d.setClip(x, y, getWidth(), getHeight());
		g2d.drawImage(image, x, y, observer);
		g2d.dispose();
	}

	@Override
	public BufferedImage bufferedImage() {
		if (image == null) {
			image = imageManager.getCImage(getVersion(), getResourceId());
		}
		return image;
	}

}
