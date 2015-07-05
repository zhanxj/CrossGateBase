package cg.base.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListURLHandler implements URLHandler {
	
	private final List<String> list = new LinkedList<String>();
	
	private final String encoding;
	
	public ListURLHandler(String encoding) {
		this.encoding = encoding;
	}
	
	public ListURLHandler() {
		this(IOUtils.GMSV_ENCODING);
	}

	@Override
	public void handle(InputStream is, String info) throws Exception {
		clear();
        // 定义 BufferedReader输入流来读取URL的响应
        BufferedReader in = new BufferedReader(new InputStreamReader(is, encoding));
        String line;
        while ((line = in.readLine()) != null) {
        	list.add(line);
        }
	}
	
	public List<String> getList() {
		return Collections.unmodifiableList(list);
	}
	
	public void clear() {
		list.clear();
	}

}
