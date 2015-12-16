package cg.base.loader;

import java.util.concurrent.ScheduledExecutorService;

import cg.base.animation.AnimationReader;
import cg.base.image.ImageManager;
import cg.base.time.Time;
import dataplatform.pubsub.ISimplePubsub;
import dataplatform.udsl.UDSL;

public interface IPlatform {
	
	String getClientFilePath();
	
	Time getTimer();
	
	ScheduledExecutorService getScheduler();
	
	ImageManager getImageManager();
	
	ISimplePubsub getSimplePubsub();
	
	AnimationReader getAnimationReader();
	
	void exit();
	
	UDSL getUDSL();

}
