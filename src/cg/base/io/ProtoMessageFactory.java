package cg.base.io;

import java.io.BufferedInputStream;
import java.io.InputStream;

import cg.base.io.proto.MessageIdProto.MessageId;
import cg.base.util.StringUtils;
import net.dipatch.ISender;
import net.io.message.ByteArrayMessage;
import net.io.message.IMessage;
import net.io.message.IMessageFactory;

public class ProtoMessageFactory implements IMessageFactory {
	
	/**最大数据读取次数*/
	protected static final int CONTENT_MAX_READ_TIMES = 5;

	@Override
	public IMessage createMessage(int messageId, int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		MessageId msgId = MessageId.valueOf(messageId);
		@SuppressWarnings("unchecked")
		Class<ByteArrayMessage> clz = (Class<ByteArrayMessage>) Class.forName("cg.base.io.message." + StringUtils.makeJavaClassName(msgId.name().replaceFirst("MI_", "")));
		clz = clz == null ? ByteArrayMessage.class : clz;
		return clz.getConstructor(int.class, String.class, ISender.class, byte[].class).newInstance(status, sessionId, sender, datas);
	}

	@Override
	public IMessage createMessage(int messageId, int status, String sessionId, ISender sender, InputStream is, int contentLength) throws Exception {
		byte[] datas = new byte[contentLength];
		BufferedInputStream bis = new BufferedInputStream(is);
		int readLength = bis.read(datas, 0, contentLength);
		int count = 0;
		while (readLength < contentLength) {
			// 读取次数超过最大设置读取次数时还没有读取全部请求内容，返回错误
			if ((++count) > CONTENT_MAX_READ_TIMES) {
				throw new Exception("Read over times.");
			}
			readLength += bis.read(datas, readLength, contentLength - readLength);
		}
		return createMessage(messageId, status, sessionId, sender, datas);
	}

}
