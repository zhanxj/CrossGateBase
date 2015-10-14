package cg.base.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

import cg.base.io.OutputPacket;

public class IOUtils {
	
	public static final String OS = System.getProperty("os.name").toLowerCase();
	
//	public static final char PATH_SPLIT = System.getProperty("os.name").toLowerCase().contains("mac") ? '\\' : '/';
	
	public static final char PATH_SPLIT = '/';
	
	public static final String ENCODING = "utf-8";
	
	public static final String GMSV_ENCODING = OS.contains("win") ? "GBK" : ENCODING;
	
	public static final String NET_ERROR = "net_error";
	
	public static final String URI_LOCAL_HEAD = OS.contains("win") ? "file:/" : "file:";
	
	public static final String NET_ENCODING = "iso-8859-1";
	
	public static void writeArray(OutputPacket packet, int[] array) {
		int length = array.length;
		packet.writeInt(length);
		for (int value : array) {
			packet.writeInt(value);
		}
	}
	
	public static void writeArray(OutputPacket packet, short[] array) {
		int length = array.length;
		packet.writeInt(length);
		for (short value : array) {
			packet.writeShort(value);
		}
	}
	
	public static void writeArray(OutputPacket packet, byte[] array) {
		int length = array.length;
		packet.writeInt(length);
		for (byte value : array) {
			packet.writeByte(value);
		}
	}
	
	public static void writeArray(OutputPacket packet, String[] array) {
		int length = array.length;
		packet.writeInt(length);
		for (String value : array) {
			packet.writeUTF(value);
		}
	}
	
	public static void requestHttpToStream(URL url, URLHandler handler) throws Exception {
		// 
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        // 
        connection.setRequestProperty("accept", "*/*");
        connection.setRequestProperty("connection", "Keep-Alive");
        connection.connect();
        // 
        Map<String, List<String>> map = connection.getHeaderFields();
        StringBuilder builder = new StringBuilder();
        // 
        for (String key : map.keySet()) {
        	builder.append(key + "--->" + map.get(key) + " ; ");
        }
        InputStream is = connection.getInputStream();
        handler.handle(is, builder.toString() + url.toString());
        is.close();
        connection.disconnect();
	}
	
	public static void requestHttpToStream(String address, URLHandler handler) throws Exception {
        requestHttpToStream(new URL(address), handler);
	}
	
	public static void requestHttpToStream(URI uri, URLHandler handler) throws Exception {
        requestHttpToStream(uri.toURL(), handler);
	}
	
	public static void requestFileToStream(File file, URLHandler handler) throws Exception {
		InputStream is = new FileInputStream(file);
		handler.handle(is, file.getPath());
		is.close();
	}
	
	public static void requestFileToStream(URI uri, URLHandler handler) throws Exception {
		requestFileToStream(new File(uri), handler);
	}
	
	public static void requestFileToStream(String address, URLHandler handler) throws Exception {
		requestFileToStream(new File(address), handler);
	}
	
	public static void getStream(URI uri, URLHandler handler) throws Exception {
		if (uri.getHost() == null) {
			requestFileToStream(uri, handler);
		} else {
			requestHttpToStream(uri, handler);
		}
	}
	
	public static void getStream(String address, URLHandler handler) throws Exception {
		getStream(new URI(address), handler);
	}
	
	public static String codeString(String str, String sourceEncoding, String targetEncoding) throws UnsupportedEncodingException {
		String s = str;
		byte[] temp = s.getBytes(sourceEncoding);
		return new String(temp, targetEncoding);
	}
	
	public static String codeString(String str, String sourceEncoding) throws UnsupportedEncodingException {
		return codeString(str, sourceEncoding, ENCODING);
	}
	
	public static String codeString(String str) throws UnsupportedEncodingException {
		return codeString(str, ENCODING);
	}
	
	public static String encode(String str) throws UnsupportedEncodingException {
		return URLEncoder.encode(str, ENCODING);
	}
	
	public static String decode(String str) throws UnsupportedEncodingException {
		return URLDecoder.decode(str, ENCODING);
	}
	
	public static void outputStreamWrite(OutputStream os, String message) throws Exception {
		os.write(message.getBytes(ENCODING));
	}
	
	public static Class<?> getClass(String key, String def) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<?> cls = null;
		String nm = System.getProperty(key, def);
        try {
        	cls = Class.forName(nm.equals("") ? key : nm);
        } catch (ClassNotFoundException e) {
            ClassLoader cl = ClassLoader.getSystemClassLoader();
            if (cl != null) {
            	cls = Class.forName(nm.equals("") ? key : nm);
            }
        }
		return cls;
	}
	
	public static Class<?> getClass(String key) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		return getClass(key, "");
	}
	
	public static Object getObject(String key, String def) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		return getClass(key, def).newInstance();
	}
	
	public static Object getObject(String key) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		return getObject(key, "");
	}
	
	public static Object[] getObjects(String key, String def, int size) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Object[] objects = new Object[size];
		for(int i = 0;i < size;i++){
			objects[i] = getObject(key, def);
		}
		return objects;
	}
	
	public static Object[] getObjects(String key, int size) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		return getObjects(key, "", size);
	}
	
	public static String URIToString(URI uri) {
		return uri.getHost() == null ? uri.getPath() : uri.toString();
	}

}
