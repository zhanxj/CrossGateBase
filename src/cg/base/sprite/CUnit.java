package cg.base.sprite;

import java.util.List;

import cg.base.util.Values;

import com.google.common.collect.Lists;

public class CUnit implements Unit {
	
	private static final long serialVersionUID = 1L;

	protected int instanceId, faceModel, east, south, tempFaceModel;
	
	protected byte dir = DIR_SOUTH, sex = SEX_NONE;
	
	protected String name;
	
	protected List<UnitListener> listeners = Lists.newArrayList();
	
	protected Values values = new Values();

	@Override
	public int getInstanceId() {
		return instanceId;
	}

	@Override
	public void setInstanceId(int instanceId) {
		this.instanceId = instanceId;
	}

	@Override
	public byte getDir() {
		return dir;
	}

	@Override
	public void setDir(byte dir) {
		this.dir = dir;
		updateUnitListener(UNIT_DIR);
	}

	@Override
	public int getEast() {
		return east;
	}

	@Override
	public int getSouth() {
		return south;
	}

	@Override
	public void move(int east, int south) {
		move0(east, south);
		updateUnitListener(UNIT_MOVE);
	}
	
	protected void move0(int east, int south) {
		this.east = east;
		this.south = south;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getFaceModel() {
		return faceModel;
	}

	@Override
	public void setFaceModel(int faceModel) {
		this.faceModel = faceModel;
	}

	@Override
	public void addUnitListener(UnitListener listener) {
		listeners.add(listener);
	}

	@Override
	public void removeUnitListener(UnitListener listener) {
		listeners.remove(listener);
	}
	
	public void updateUnitListener(short type) {
		for (UnitListener listener : listeners) {
			listener.update(this, type);
		}
	}

	@Override
	public int getTempFaceModel() {
		return tempFaceModel;
	}

	@Override
	public void setTempFaceModel(int tempFaceModel) {
		this.tempFaceModel = tempFaceModel;
	}

	@Override
	public String toString() {
		return getClass().getName() + " : " + getName() + " : " + getInstanceId();
	}

	@Override
	public byte getUnitType() {
		return UNI_TYPE_BASE;
	}

	@Override
	public Values getValues() {
		return values;
	}

	@Override
	public byte getSex() {
		return sex;
	}

}
