package cg.base.io;

import java.io.DataOutput;

public interface OutputPacket extends DataOutput {
	
	int getProtocolCode();
	
	byte[] toBytes();

	@Override
    void write(int paramInt);

	@Override
    void write(byte[] paramArrayOfByte);

	@Override
    void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2);

	@Override
    void writeBoolean(boolean paramBoolean);

	@Override
    void writeByte(int paramInt);

	@Override
    void writeShort(int paramInt);

	@Deprecated
	@Override
    void writeChar(int paramInt);

	@Override
    void writeInt(int paramInt);

	@Override
    void writeLong(long paramLong);

	@Deprecated
	@Override
    void writeFloat(float paramFloat);

	@Deprecated
	@Override
    void writeDouble(double paramDouble);

	@Override
    void writeBytes(String paramString);

	@Deprecated
	@Override
    void writeChars(String paramString);

	@Override
    void writeUTF(String paramString);

}
