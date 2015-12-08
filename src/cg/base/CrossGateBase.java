package cg.base;

import java.net.URI;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.util.concurrent.MoreExecutors;

import cg.base.animation.AnimationReader;
import cg.base.image.ImageManager;
import cg.base.reader.CAnimationReader;
import cg.base.time.CTimer;
import cg.base.time.Timer;
import cg.base.util.MemoryCalculator;
import dataplatform.pubsub.ISimplePubsub;
import dataplatform.pubsub.impl.SimplePubsub;

public class CrossGateBase {
	
	protected static final Logger log = LoggerFactory.getLogger(CrossGateBase.class);
	
	protected static ISimplePubsub simplePubsub;
	
	protected static Timer timer;
	
	protected static int version;
	
	protected static URI clientFilePath = null;
	
	protected static AnimationReader animationReader;
	
	protected static ScheduledExecutorService scheduler;
	
	protected static ImageManager imageManager;
	
	public static String getClientFilePath() {
//		return (clientFilePath.getHost() == null ? clientFilePath.getPath() : clientFilePath.toString());
		return clientFilePath.toString();
	}

	public static AnimationReader getAnimationReader() {
		return animationReader;
	}
	
	public static void exit() {
		System.exit(1);
	}

	public static Timer getTimer() {
		return timer;
	}
	
	public static ScheduledExecutorService getScheduler() {
		return scheduler;
	}
	
	public static ImageManager getImageManager() {
		return imageManager;
	}
	
	public static void printObjectMemory(Object object) {
		log.info("Object[{}] shallowSize={}; deepSize={}.", object, MemoryCalculator.shallowSizeOf(object), MemoryCalculator.deepSizeOf(object));
	}
	
	public static String getOSName() {
		return System.getProperty("os.name");
	}
	
	public static ISimplePubsub getSimplePubsub() {
		return simplePubsub;
	}
	
	public abstract static class Loader implements Runnable {
		
		protected LoadCall call;
		
		public Loader(LoadCall call) {
			this.call = call;
			createSimpleObject();
		}
		
		protected void createSimpleObject() {
			logStart();
			try {
				clientFilePath = loadClientFilePath();
			} catch (Exception e) {
				log.error("", e);
				exit();
			}
			timer = createTimer();
			scheduler = createScheduledExecutor();
			imageManager = createImageManager();
			simplePubsub = createSimplePubsub();
		}

		@Override
		public final void run() {
			load();
			scheduler.scheduleWithFixedDelay(timer, 0, timer.getTime(), TimeUnit.MILLISECONDS);
			if (call != null) {
				call.loadFinish();
			}
		}
		
		protected abstract void load();
		
		protected void loadAnimationReader() {
			animationReader = createAnimationReader();
		}
		
		protected ScheduledExecutorService createScheduledExecutor() {
			return MoreExecutors.getExitingScheduledExecutorService(new ScheduledThreadPoolExecutor(3));
		}
		
		protected abstract URI loadClientFilePath() throws Exception;
		
		protected Timer createTimer() {
			return CTimer.getInstance();
		}
		
		protected abstract void logStart();
		
		protected AnimationReader createAnimationReader() {
			return new CAnimationReader(getClientFilePath(), getImageManager(), getTimer());
		}
		
		protected abstract ImageManager createImageManager();
		
		protected ISimplePubsub createSimplePubsub() {
			return new SimplePubsub();
		}
		
	}

}
