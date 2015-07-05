package cg.base.util;

import java.util.concurrent.locks.Lock;

public interface Lockable {
	
	Lock getLock();

}
