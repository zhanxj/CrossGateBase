package cg.base.io;

import java.io.DataInput;

public interface InputPacket extends DataInput {
	
	int getProtocolCode();
	
	@Override
	void readFully(byte[] paramArrayOfByte);

	@Override
	void readFully(byte[] paramArrayOfByte, int paramInt1, int paramInt2);

	@Deprecated
	@Override
	int skipBytes(int paramInt);

	@Override
	boolean readBoolean();

	@Override
	byte readByte();

	@Deprecated
	@Override
	int readUnsignedByte();

	@Override
	short readShort();

	@Deprecated
	@Override
	int readUnsignedShort();

	@Deprecated
	@Override
	char readChar();

	@Override
	int readInt();

	@Override
	long readLong();

	@Deprecated
	@Override
	float readFloat();

	@Deprecated
	@Override
	double readDouble();

	@Deprecated
	@Override
	String readLine();

	@Override
	String readUTF();
	
	void reset();
	
	void setHandled();
	
	boolean getHandled();

}
