package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.PlayerProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestPlayerCreate extends ProtoMessage {

	private REQUEST_PLAYER_CREATE.Builder builder;

	public RequestPlayerCreate(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_REQUEST_PLAYER_CREATE_VALUE, status, sessionId, sender, datas);
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public RequestPlayerCreate() {
		super();
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
		int ret = builder.getEyeStyleId();
		return ret;
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
		int ret = builder.getRoleIndex();
		return ret;
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
		int ret = builder.getRoleId();
		return ret;
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
		int ret = builder.getColorId();
		return ret;
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
		int ret = builder.getMouthStyleId();
		return ret;
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
		String ret = builder.getName();
		return ret;
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
		int ret = builder.getHairStyleId();
		return ret;
	}

	public REQUEST_PLAYER_CREATE getRequestPlayerCreate() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
