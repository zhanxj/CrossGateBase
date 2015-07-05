package cg.base.io;

public class CImageResource implements ImageResource {
	
	private final String type, path, suffix, name;
	
	private final byte version;
	
	private final boolean colorPalette;
	
	public CImageResource(byte version, String type, String path, String suffix, String name, boolean colorPalette) {
		this.version = version;
		this.colorPalette = colorPalette;
		this.name = name;
		this.path = path;
		this.suffix = suffix;
		this.type = type;
	}

	@Override
	public byte getVersion() {
		return version;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public String getPath() {
		return path;
	}

	@Override
	public String getSuffix() {
		return suffix;
	}

	@Override
	public boolean isColorPalette() {
		return colorPalette;
	}

	@Override
	public String getInfoFile() {
		return getPath() + "/" + getType() + "Info" + getSuffix() + ".bin";
	}

	@Override
	public String getDataFile() {
		return getPath() + "/" + getType() + getSuffix() + ".bin";
	}

	@Override
	public String getDecription() {
		return name;
	}

}
