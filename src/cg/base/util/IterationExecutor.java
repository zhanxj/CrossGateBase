package cg.base.util;

public interface IterationExecutor {
	
	void execute();
	
	void setCanExecute(boolean can);
	
	void setNext(IterationExecutor executor);

}
