package cg.base.time;

public interface TimeOutCallback {
	
	void timeOut(int key);
	
	interface TimeListener {
		
		boolean update(int time);
		
		void changLastTime(int lastTime);
		
		void remove();
		
		int getTime();
		
	}

}
