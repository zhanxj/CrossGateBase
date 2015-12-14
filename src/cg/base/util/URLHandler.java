package cg.base.util;

import java.io.InputStream;

public interface URLHandler {
	
	void handle(InputStream is, String info) throws Exception;

}
