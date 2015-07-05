package cg.base.io;

public interface PacketFactory {
	
	InputPacket createInputPacket(int protocol, Object obj);
	
	OutputPacket createOutputPacket(int protocol);

}
