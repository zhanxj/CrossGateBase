package cg.base.image;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

@Deprecated
public class CImage extends BufferedImage implements PositionPaintable {
	
	public static final byte HEAD_VERSION_BITMAP = 0;
	
	public static final byte HEAD_VERSION_RLE = 1;
	
	public static final byte HEAD_VERSION_RLE_COLOR_PALETTES = 3;
	
	protected ColorPalette[] defaultColorPalettes;
	
	protected ColorPalette[] colorPalettes;
	
	protected int[][] pointColors;
	
	protected ImageDictionary imageDictionary;
	
	protected byte headVersion;
	
	protected short alpha;
	
	protected AlphaComposite alphaComposite;

	public CImage(ImageDictionary imageDictionary, byte headVersion, ColorPalette[] defaultColorPalettes) {
		super(imageDictionary.getWidth(), imageDictionary.getHeight(), TYPE_INT_ARGB);
		this.imageDictionary = imageDictionary;
		this.headVersion = headVersion;
		this.defaultColorPalettes = defaultColorPalettes;
		pointColors = new int[imageDictionary.getWidth()][imageDictionary.getHeight()];
		for (int i = 0;i < pointColors.length;i++) {
			for (int j = 0;j < pointColors[i].length;j++) {
				pointColors[i][j] = -1;
			}
		}
	}
	
	public byte getHeadVersion() {
		return headVersion;
	}
	
	public ImageDictionary getImageDictionary() {
		return imageDictionary;
	}
	
	public int getOffsetX() {
		return imageDictionary.getOffsetX();
	}
	
	public int getOffsetY() {
		return imageDictionary.getOffsetY();
	}
	
	private byte getUseEast() {
		return imageDictionary.getUseEast();
	}
	
	private byte getUseSouth() {
		return imageDictionary.getUseSouth();
	}
	
	private byte getMark() {
		return imageDictionary.getMark();
	}

	public int getGlobalId() {
		return imageDictionary.getGlobalId();
	}

	@Override
	public String toString() {
		return getClass().getName() + " : id = " + getResourceId() + " ; offsetX = " + getOffsetX() + " ; offsetY = " + 
				getOffsetY() + " ; width = " + getWidth() + " ; height = " + getHeight() + " ; east = " + getUseEast() 
				+ " ; south = " + getUseSouth() + " ; mark = " + getMark() + " ; globalId = " + getGlobalId();
	}

	public ColorPalette getColorPalettes(int index) {
		return colorPalettes[index];
	}
	
	public void setColorPalettes(ColorPalette[] colorPalettes) {
		this.colorPalettes = colorPalettes;
	}
    
    public void render() {
        for (int x = 0;x < pointColors.length;x++) {
            for (int y = 0;y < pointColors[x].length;y++) {
                super.setRGB(x, y, getColor(pointColors[x][y]));
            }
        }
    }
	
	@Override
	public void setRGB(int x, int y, int rgb) {
		pointColors[x][y] = rgb;
		super.setRGB(x, y, getColor(rgb));
	}
	
	private int getColor(int id) {
		if (headVersion == HEAD_VERSION_BITMAP) {
			return id;
		} else if (colorPalettes.length == 256 || headVersion == HEAD_VERSION_RLE_COLOR_PALETTES) {
			return getColorPalettes(id).getColor();
		} else if (id < 16) {
			return defaultColorPalettes[id].getColor();
		} else if (id > 240) {
			return defaultColorPalettes[id - 224].getColor();
		} else {
			return getColorPalettes(id - 16).getColor();
		}
	}

	private int getResourceId() {
		return imageDictionary.getResourceId();
	}
    
    public void print() {
        for (int i = 0;i < pointColors.length;i++) {
            for (int j = 0;j < pointColors[i].length;j++) {
                System.out.print(pointColors[i][j] + "\t");
            }
            System.out.println();
        }
    }

	public short getAlpha() {
		return alpha;
	}

	public void setAlpha(short alpha) {
		this.alpha = alpha;
		alphaComposite = alpha > 0 ? AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f - ((float) alpha / 255.0f)) : null;
//		for (int x = 0;x < getWidth();x++) {
//			for (int y = 0;y < getHeight();y++) {
//				super.setRGB(x, y, getRGB(x, y) & 0x7FFFFF | alpha);
//			}
//		}
	}
	
	@Override
	public void paint(Graphics g, int x, int y) {
		if (alphaComposite == null) {
			g.setClip(x, y, getWidth(), getHeight());
			g.drawImage(this, x, y, null);
		} else {
			paint(x, y, null);
		}
	}
	
	public void paint(int x, int y, ImageObserver observer) {
		Graphics2D g2d = createGraphics();
		g2d.setComposite(alphaComposite);
		g2d.setClip(x, y, getWidth(), getHeight());
		g2d.drawImage(this, x, y, observer);
		g2d.dispose();
	}

}
