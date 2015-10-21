package cg.base.battle;

import java.util.List;

import com.google.common.collect.Lists;

public class BuffEffectInfo {
	
	private final String tech;
	
	private final int id;
	
	private List<EffectValue> effectValues;
	
	private boolean finish;
	
	public BuffEffectInfo(String tech, int id) {
		this.tech = tech;
		this.id = id;
		effectValues = Lists.newLinkedList();
	}

	public String getTech() {
		return tech;
	}

	public int getId() {
		return id;
	}

	public List<EffectValue> getEffectValues() {
		return effectValues;
	}

	public void addEffectValue(EffectValue effectValue) {
		effectValues.add(effectValue);
	}

	public boolean isFinish() {
		return finish;
	}

	public void setFinish(boolean finish) {
		this.finish = finish;
	}

}
