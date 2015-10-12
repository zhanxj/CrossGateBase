package cg.base.io.message;

import cg.base.io.proto.BattleProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoUnitBattleInfo {

	private VO_UNIT_BATTLE_INFO vo;

	private VO_UNIT_BATTLE_INFO.Builder builder;

	public VoUnitBattleInfo(VO_UNIT_BATTLE_INFO vo) {
		this.vo = vo;
	}

	public VoUnitBattleInfo() {
		builder = VO_UNIT_BATTLE_INFO.newBuilder();
	}

	/**
	 * 
	 * @param	hpMax
	 * 			<u>do not has any annotate.</u>
	 */
	public void setHpMax(Integer hpMax) {
		builder.setHpMax(hpMax);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getHpMax() {
		int ret = vo.getHpMax();
		return ret;
	}

	/**
	 * 
	 * @param	mp
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMp(Integer mp) {
		builder.setMp(mp);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getMp() {
		int ret = vo.getMp();
		return ret;
	}

	/**
	 * 
	 * @param	mpMax
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMpMax(Integer mpMax) {
		builder.setMpMax(mpMax);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getMpMax() {
		int ret = vo.getMpMax();
		return ret;
	}

	/**
	 * 
	 * @param	hp
	 * 			<u>do not has any annotate.</u>
	 */
	public void setHp(Integer hp) {
		builder.setHp(hp);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getHp() {
		int ret = vo.getHp();
		return ret;
	}

	/**
	 * 
	 * @param	isChallenger
	 * 			<u>do not has any annotate.</u>
	 */
	public void setIsChallenger(Boolean isChallenger) {
		builder.setIsChallenger(isChallenger);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Boolean getIsChallenger() {
		Boolean ret = vo.getIsChallenger();
		return ret;
	}

	/**
	 * 
	 * @param	unitInfo
	 * 			<u>do not has any annotate.</u>
	 */
	public void setUnitInfo(VoUnit unitInfo) {
		builder.setUnitInfo(unitInfo.getVO_UNIT());
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VoUnit getUnitInfo() {
		VoUnit ret = new VoUnit(vo.getUnitInfo());
		return ret;
	}

	/**
	 * 
	 * @param	local
	 * 			<u>do not has any annotate.</u>
	 */
	public void setLocal(Integer local) {
		builder.setLocal(local);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getLocal() {
		int ret = vo.getLocal();
		return ret;
	}

	public VO_UNIT_BATTLE_INFO getVO_UNIT_BATTLE_INFO() {
		return vo == null ? builder.build() : vo;
	}

}
