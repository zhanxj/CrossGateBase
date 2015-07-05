package cg.base.util;

public interface State extends Updatable {
	
	void enter();
	
	void exit();

}
