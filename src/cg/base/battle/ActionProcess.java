package cg.base.battle;

public interface ActionProcess {
	
	int getTargetId();
	
	Guard getGuard();
	
	ActionResult getActionResult();
	
	ActionResult getBlood();
	
	Counter getCounter();
	
	ActionProcess getNext();

}
