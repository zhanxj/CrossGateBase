package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.MailProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;
import cg.base.io.proto.VOProtos.*;
import com.google.common.collect.Lists;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseMailSend extends ProtoMessage {

	private RESPONSE_MAIL_SEND.Builder builder;

	public ResponseMailSend(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_MAIL_SEND_VALUE, status, sessionId, sender, datas);
		builder = RESPONSE_MAIL_SEND.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseMailSend() {
		super();
		builder = RESPONSE_MAIL_SEND.newBuilder();
		messageId = MessageId.MI_RESPONSE_MAIL_SEND_VALUE;
	}

	/**
	 * 
	 * @param	sourceId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setSourceId(Integer sourceId) {
		builder.setSourceId(sourceId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getSourceId() {
		int ret = builder.getSourceId();
		return ret;
	}

	/**
	 * 
	 * @param	lastTime
	 * 			<u>do not has any annotate.</u>
	 */
	public void setLastTime(Integer lastTime) {
		builder.setLastTime(lastTime);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getLastTime() {
		int ret = builder.getLastTime();
		return ret;
	}

	/**
	 * 
	 * @param	attachments
	 * 			<u>do not has any annotate.</u>
	 */
	public void setAttachments(Iterable<VoAttachment> attachments) {
		List<VO_ATTACHMENT> list = Lists.newLinkedList();
		for (VoAttachment vo : attachments) {
			list.add(vo.getVO_ATTACHMENT());
		}
		builder.addAllAttachments(list);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VoAttachment> getAttachmentsList() {
		List<VO_ATTACHMENT> list = builder.getAttachmentsList();
		List<VoAttachment> ret = Lists.newArrayListWithCapacity(list.size());
		for (VO_ATTACHMENT vo : list) {
			ret.add(new VoAttachment(vo));
		}
		return ret;
	}

	/**
	 * 
	 * @param	destId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setDestId(Integer destId) {
		builder.setDestId(destId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getDestId() {
		int ret = builder.getDestId();
		return ret;
	}

	/**
	 * 
	 * @param	sourceName
	 * 			<u>do not has any annotate.</u>
	 */
	public void setSourceName(String sourceName) {
		builder.setSourceName(sourceName);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getSourceName() {
		String ret = builder.getSourceName();
		return ret;
	}

	/**
	 * 
	 * @param	type
	 * 			<u>do not has any annotate.</u>
	 */
	public void setType(Integer type) {
		builder.setType(type);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getType() {
		int ret = builder.getType();
		return ret;
	}

	/**
	 * 
	 * @param	title
	 * 			<u>do not has any annotate.</u>
	 */
	public void setTitle(String title) {
		builder.setTitle(title);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getTitle() {
		String ret = builder.getTitle();
		return ret;
	}

	/**
	 * 
	 * @param	prices
	 * 			<u>do not has any annotate.</u>
	 */
	public void setPrices(Iterable<VoPrice> prices) {
		List<VO_PRICE> list = Lists.newLinkedList();
		for (VoPrice vo : prices) {
			list.add(vo.getVO_PRICE());
		}
		builder.addAllPrices(list);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VoPrice> getPricesList() {
		List<VO_PRICE> list = builder.getPricesList();
		List<VoPrice> ret = Lists.newArrayListWithCapacity(list.size());
		for (VO_PRICE vo : list) {
			ret.add(new VoPrice(vo));
		}
		return ret;
	}

	/**
	 * 
	 * @param	content
	 * 			<u>do not has any annotate.</u>
	 */
	public void setContent(String content) {
		builder.setContent(content);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getContent() {
		String ret = builder.getContent();
		return ret;
	}

	/**
	 * 
	 * @param	status
	 * 			<u>do not has any annotate.</u>
	 */
	public void setStatus(Integer status) {
		builder.setStatus(status);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getStatus() {
		int ret = builder.getStatus();
		return ret;
	}

	public RESPONSE_MAIL_SEND getResponseMailSend() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
