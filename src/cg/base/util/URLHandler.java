package cg.base.util;

import java.io.InputStream;

public interface URLHandler {
	
	public void handle(InputStream is, String info) throws Exception;

}
