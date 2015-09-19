package cg.base;

import java.net.URI;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import cg.base.animation.AnimationReader;
import cg.base.image.ImageManager;
import cg.base.io.PacketFactory;
import cg.base.log.Log;
import cg.base.reader.CAnimationReader;
import cg.base.time.CTimer;
import cg.base.time.Timer;
import cg.base.util.MemoryCalculator;
import cg.base.util.Updater;

import com.google.common.eventbus.EventBus;

public class CrossGateBase {
	
	protected static final EventBus EVENT_BUS = new EventBus();
	
	protected static Log log;
	
	protected static Timer timer;
	
	protected static Updater mainThread;
	
	protected static int version;
	
	protected static PacketFactory packetFactory;
	
	protected static URI clientFilePath = null;
	
	protected static AnimationReader animationReader;
	
	protected static ScheduledExecutorService scheduler;
	
	protected static ImageManager imageManager;
	
	public static String getClientFilePath() {
		return (clientFilePath.getHost() == null ? clientFilePath.getPath() : clientFilePath.toString());
	}

	public static AnimationReader getAnimationReader() {
		return animationReader;
	}
	
	public static void exit() {
		System.exit(0);
	}

	public static PacketFactory getPacketFactory() {
		return packetFactory;
	}

	public static Log getLog() {
		return log;
	}

	public static Timer getTimer() {
		return timer;
	}
	
	public static Updater getUpdater() {
		return mainThread;
	}
	
	public static ScheduledExecutorService getScheduler() {
		return scheduler;
	}
	
	public static ImageManager getImageManager() {
		return imageManager;
	}
	
	public static void printObjectMemory(Object object) {
		getLog().info("Object[" + object + "] shallowSize=" + MemoryCalculator.shallowSizeOf(object) + "; deepSize=" + MemoryCalculator.deepSizeOf(object) + ".");
	}
	
	public static String getOSName() {
		return System.getProperty("os.name");
	}
	
	public static EventBus getEventBus() {
		return EVENT_BUS;
	}
	
	public abstract static class Loader implements Runnable {
		
		protected LoadCall call;
		
		public Loader(LoadCall call) {
			this.call = call;
			createSimpleObject();
		}
		
		protected void createSimpleObject() {
			log = createLog();
			logStart();
			try {
				clientFilePath = loadClientFilePath();
			} catch (Exception e) {
				log.error(getClass().getName(), e);
				exit();
			}
			timer = createTimer();
			mainThread = createUpdater();
			scheduler = Executors.newScheduledThreadPool(3);
			imageManager = createImageManager();
			packetFactory = createPacketFactory();
		}

		@Override
		public final void run() {
			load();
			mainThread.add(timer);
			if (call != null) {
				call.loadFinish();
			}
		}
		
		protected abstract void load();
		
		protected void loadAnimationReader() {
			animationReader = createAnimationReader();
		}
		
		protected abstract URI loadClientFilePath() throws Exception;
		
		protected abstract PacketFactory createPacketFactory();
		
		protected Log createLog() {
			return new CLog();
		}
		
		protected Timer createTimer() {
			return CTimer.getInstance();
		}
		
		protected Updater createUpdater() {
			return new CMainThread(timer.getSleepTime(), log);
		}
		
		protected abstract void logStart();
		
		protected AnimationReader createAnimationReader() {
			return new CAnimationReader(log, getClientFilePath(), getImageManager(), getTimer());
		}
		
		protected abstract ImageManager createImageManager();
		
	}

}
