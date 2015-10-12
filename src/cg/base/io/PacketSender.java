package cg.base.io;

import net.io.IMessage;

public interface PacketSender {
	
	void send(OutputPacket packet);
	
	void send(IMessage message);

}
