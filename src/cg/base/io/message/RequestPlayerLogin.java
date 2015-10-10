package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.PlayerProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestPlayerLogin extends ProtoMessage {

	private REQUEST_PLAYER_LOGIN.Builder builder;

	public RequestPlayerLogin(int messageId, int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(messageId, status, sessionId, sender, datas);
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public RequestPlayerLogin() {
		super();
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
	 * @param	headVersion
	 * 			<u>do not has any annotate.</u>
	 */
	public void setHeadVersion(Integer headVersion) {
		builder.setHeadVersion(headVersion);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getHeadVersion() {
		return builder.getHeadVersion();
	}

	/**
	 * 
	 * @param	eyeShot
	 * 			<u>do not has any annotate.</u>
	 */
	public void setEyeShot(Integer eyeShot) {
		builder.setEyeShot(eyeShot);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getEyeShot() {
		return builder.getEyeShot();
	}

	/**
	 * 
	 * @param	animationVersion
	 * 			<u>do not has any annotate.</u>
	 */
	public void setAnimationVersion(Integer animationVersion) {
		builder.setAnimationVersion(animationVersion);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getAnimationVersion() {
		return builder.getAnimationVersion();
	}

	public REQUEST_PLAYER_LOGIN getRequestPlayerLogin() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
