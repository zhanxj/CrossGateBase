package cg.base.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.dipatch.ISender;
import net.io.IMessage;

public class SenderUtils {
	
	private static final Logger log = LoggerFactory.getLogger(SenderUtils.class);
	
	private SenderUtils() {}
	
	public static void send(ISender sender, IMessage message) {
		try {
			sender.send(message.getByteArray(), message.getMessageId());
		} catch (Exception e) {
			log.error("", e);
		}
	}

}
