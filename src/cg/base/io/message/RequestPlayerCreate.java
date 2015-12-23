package cg.base.io.message;

import net.io.ISender;
import net.io.message.ByteArrayMessage;
import cg.base.io.proto.PlayerProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestPlayerCreate extends ByteArrayMessage {

	private REQUEST_PLAYER_CREATE.Builder builder;

	public RequestPlayerCreate(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_REQUEST_PLAYER_CREATE_VALUE, status, sessionId, sender, datas);
		builder = REQUEST_PLAYER_CREATE.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public RequestPlayerCreate() {
		super();
		builder = REQUEST_PLAYER_CREATE.newBuilder();
		messageId = MessageId.MI_REQUEST_PLAYER_CREATE_VALUE;
	}

	/**
	 * 
	 * @param	eyeStyleId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setEyeStyleId(Integer eyeStyleId) {
		builder.setEyeStyleId(eyeStyleId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getEyeStyleId() {
		return builder.getEyeStyleId();
	}

	/**
	 * 
	 * @param	roleIndex
	 * 			<u>do not has any annotate.</u>
	 */
	public void setRoleIndex(Integer roleIndex) {
		builder.setRoleIndex(roleIndex);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getRoleIndex() {
		return builder.getRoleIndex();
	}

	/**
	 * 
	 * @param	roleId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setRoleId(Integer roleId) {
		builder.setRoleId(roleId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getRoleId() {
		return builder.getRoleId();
	}

	/**
	 * 
	 * @param	colorId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setColorId(Integer colorId) {
		builder.setColorId(colorId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getColorId() {
		return builder.getColorId();
	}

	/**
	 * 
	 * @param	elements
	 * 			<u>do not has any annotate.</u>
	 */
	public void setElements(Iterable<Integer> elements) {
		builder.addAllElements(elements);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<Integer> getElementsList() {
		return builder.getElementsList();
	}

	/**
	 * 
	 * @param	mouthStyleId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMouthStyleId(Integer mouthStyleId) {
		builder.setMouthStyleId(mouthStyleId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getMouthStyleId() {
		return builder.getMouthStyleId();
	}

	/**
	 * 
	 * @param	name
	 * 			<u>do not has any annotate.</u>
	 */
	public void setName(String name) {
		builder.setName(name);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getName() {
		return builder.getName();
	}

	/**
	 * 
	 * @param	attributes
	 * 			<u>do not has any annotate.</u>
	 */
	public void setAttributes(Iterable<Integer> attributes) {
		builder.addAllAttributes(attributes);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<Integer> getAttributesList() {
		return builder.getAttributesList();
	}

	/**
	 * 
	 * @param	hairStyleId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setHairStyleId(Integer hairStyleId) {
		builder.setHairStyleId(hairStyleId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getHairStyleId() {
		return builder.getHairStyleId();
	}

	public REQUEST_PLAYER_CREATE getRequestPlayerCreate() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
