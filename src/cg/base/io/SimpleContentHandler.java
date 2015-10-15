package cg.base.io;

import cg.base.event.EventDisconnect;
import cg.base.io.ProtoMessageFactory;
import dataplatform.pubsub.ISimplePubsub;
import net.dipatch.IContent;
import net.dipatch.IContentHandler;
import net.io.IMessage;
import net.io.IMessageFactory;

public class SimpleContentHandler implements IContentHandler {
	
	protected final ISimplePubsub pubsub;
	
	protected final IMessageFactory messageFactory;
	
	public SimpleContentHandler(ISimplePubsub pubsub) {
		this.pubsub = pubsub;
		messageFactory = new ProtoMessageFactory();
	}

	@Override
	public void handle(IContent content) throws Exception {
		IMessage message = messageFactory.createMessage(content.getMessageId(), 0, content.getSessionId(), content.getSender(), content.getDatas());
		pubsub.publish(message);
	}

	@Override
	public void disconnect(String sessionId, String address) {
		pubsub.publish(new EventDisconnect(sessionId, address));
	}

}
