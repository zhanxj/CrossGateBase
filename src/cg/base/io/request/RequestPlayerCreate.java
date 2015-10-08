package cg.base.io.request;

import java.io.InputStream;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoRequest;
import cg.base.io.proto.PlayerProtos.*;import java.util.List;


/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestPlayerCreate extends ProtoRequest {

	private REQUEST_PLAYER_CREATE requestPlayerCreate;

	public RequestPlayerCreate(int receiveMessageId, byte[] datas, ISender sender, String sessionId, REQUEST_PLAYER_CREATE requestPlayerCreate) {
		super(receiveMessageId, datas, sender, sessionId);
		this.requestPlayerCreate = requestPlayerCreate;
	}

	public RequestPlayerCreate(int receiveMessageId, InputStream is, int contentLength, ISender sender, String sessionId, REQUEST_PLAYER_CREATE requestPlayerCreate) throws Exception {
		super(receiveMessageId, is, contentLength, sender, sessionId);
		this.requestPlayerCreate = requestPlayerCreate;
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Integer getEyeStyleId() {
		return requestPlayerCreate.getEyeStyleId();
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Integer getRoleIndex() {
		return requestPlayerCreate.getRoleIndex();
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Integer getRoleId() {
		return requestPlayerCreate.getRoleId();
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Integer getColorId() {
		return requestPlayerCreate.getColorId();
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<Integer> getElementsList() {
		return requestPlayerCreate.getElementsList();
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Integer getMouthStyleId() {
		return requestPlayerCreate.getMouthStyleId();
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getName() {
		return requestPlayerCreate.getName();
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<Integer> getAttributesList() {
		return requestPlayerCreate.getAttributesList();
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Integer getHairStyleId() {
		return requestPlayerCreate.getHairStyleId();
	}

	public REQUEST_PLAYER_CREATE getRequestPlayerCreate() {
		return requestPlayerCreate;
	}

	@Override
	public byte[] getByteArray() {
		return requestPlayerCreate.toByteArray();
	}

}
