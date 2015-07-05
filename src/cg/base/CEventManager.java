package cg.base;

import cg.base.util.Updatable;
import cg.base.util.Updater;
import event.base.Event;
import event.base.EventListener;
import event.base.EventManager;
import event.impl.IEventCreator;

class CEventManager implements EventManager<Integer>, Updatable {
	
	private EventManager<Integer> eventManager = IEventCreator.getInstance().createEventManager(20);
	
	public CEventManager(Updater updater) {
		updater.add(this);
	}

	@Override
	public void update() {
		eventManager.run();
	}

	@Deprecated
	@Override
	public void run() {}

	@Override
	public void addEvent(Event<Integer> event) {
		eventManager.addEvent(event);
	}

	@Override
	public void fireEvent(Event<Integer> event) {
		eventManager.fireEvent(event);
	}

	@Override
	public void register(EventListener<Integer> eventListener) {
		eventManager.register(eventListener);
	}

	@Override
	public void unregister(EventListener<Integer> eventListener) {
		eventManager.unregister(eventListener);
	}

}
