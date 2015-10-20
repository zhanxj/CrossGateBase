package cg.base.battle;

public interface ActionProcess {
	
	int getTargetId();
	
	Guard getGuard();
	
	ActionResult getActionResult();
	
	Counter getCounter();
	
	ActionProcess getActionProcess();

}
