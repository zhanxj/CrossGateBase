package cg.base.io;

import net.io.IMessageSender;

public interface PacketSender extends IMessageSender {
	
	void send(OutputPacket packet);

}
