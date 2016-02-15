package cg.base.io;

import java.io.DataOutputStream;

import net.io.anthenticate.IDataAnthenticate;

public class DataAnthenticate implements IDataAnthenticate<byte[], DataOutputStream> {
	
	private static final String HEAD = "CrossGateProtoBuf";

	@Override
	public void write(DataOutputStream out) throws Exception {
		out.write(HEAD.getBytes());
	}

	@Override
	public boolean read(byte[] in) {
		try {
			return HEAD.equals(new String(in));
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public int getAnthenticateLength() {
		return HEAD.length();
	}

}
