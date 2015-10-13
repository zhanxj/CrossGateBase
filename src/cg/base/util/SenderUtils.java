package cg.base.util;

import cg.base.log.Log;
import net.dipatch.ISender;
import net.io.IMessage;

public class SenderUtils {
	
	private SenderUtils() {}
	
	public static void send(ISender sender, IMessage message, Log log) {
		try {
			sender.send(message.getByteArray(), message.getMessageId());
		} catch (Exception e) {
			if (log == null) {
				e.printStackTrace();
			} else {
				log.error("", e);
			}
		}
	}

}
