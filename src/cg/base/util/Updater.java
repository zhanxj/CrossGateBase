package cg.base.util;

public interface Updater extends Updatable {
	
	void add(Updatable updatable);
	
	void remove(Updatable updatable);

}
