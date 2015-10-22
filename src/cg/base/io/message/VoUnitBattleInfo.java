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
		return vo.getHpMax();
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
		return vo.getMp();
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
		return vo.getMpMax();
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
		return vo.getHp();
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
		return vo.getIsChallenger();
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
		return new VoUnit(vo.getUnitInfo());
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
		return vo.getLocal();
	}

	public VO_UNIT_BATTLE_INFO getVO_UNIT_BATTLE_INFO() {
		return vo == null ? builder.build() : vo;
	}

}
