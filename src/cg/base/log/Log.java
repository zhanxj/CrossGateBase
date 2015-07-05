package cg.base.log;

public interface Log {
	
	void info(String info);
	
	void warning(String warning);
	
	void error(String error);
	
	void error(String error, Throwable t);
	
	void print(String head, String message);

}
