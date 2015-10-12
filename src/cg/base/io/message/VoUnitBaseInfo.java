package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoUnitBaseInfo {

	private VO_UNIT_BASE_INFO vo;

	private VO_UNIT_BASE_INFO.Builder builder;

	public VoUnitBaseInfo(VO_UNIT_BASE_INFO vo) {
		this.vo = vo;
	}

	public VoUnitBaseInfo() {
		builder = VO_UNIT_BASE_INFO.newBuilder();
	}

	/**
	 * 
	 * @param	unitType
	 * 			<u>do not has any annotate.</u>
	 */
	public void setUnitType(Integer unitType) {
		builder.setUnitType(unitType);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getUnitType() {
		int ret = vo.getUnitType();
		return ret;
	}

	/**
	 * 
	 * @param	instanceId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setInstanceId(Integer instanceId) {
		builder.setInstanceId(instanceId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getInstanceId() {
		int ret = vo.getInstanceId();
		return ret;
	}

	/**
	 * 
	 * @param	faceModel
	 * 			<u>do not has any annotate.</u>
	 */
	public void setFaceModel(Integer faceModel) {
		builder.setFaceModel(faceModel);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getFaceModel() {
		int ret = vo.getFaceModel();
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
		String ret = vo.getName();
		return ret;
	}

	/**
	 * 
	 * @param	tempFaceModel
	 * 			<u>do not has any annotate.</u>
	 */
	public void setTempFaceModel(Integer tempFaceModel) {
		builder.setTempFaceModel(tempFaceModel);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getTempFaceModel() {
		int ret = vo.getTempFaceModel();
		return ret;
	}

	public VO_UNIT_BASE_INFO getVO_UNIT_BASE_INFO() {
		return vo == null ? builder.build() : vo;
	}

}
