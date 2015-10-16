package cg.base.option;

import java.util.Map;
import java.util.Set;

import com.google.common.collect.Maps;

public class Options {
	
	public static final String OPTION_PK = "PK";
	
	public static final String OPTION_CHAT = "CHAT";
	
	public static final String OPTION_TEAM = "TEAM";
	
	public static final String OPTION_MAIL = "MAIL";
	
	public static final String OPTION_EXCHANGE = "EXCHANGE";
	
	public static final String OPTION_GUID = "GUID";
	
	public static final String OPTION_CHAT_WIDTH = "CHAT_WIDTH";
	
	public static final String OPTION_CHAT_HEIGHT = "CHAT_HEIGHT";
	
	public static final String OPTION_CHAT_RANGE = "CHAT_RANGE";
	
	public static final String OPTION_CHAT_COLOR = "CHAT_COLOR";
	
	public static final String OPTION_CHAT_SIZE = "CHAT_SIZE";
	
	public static final String OPTION_ITEM_MOVE = "ITEM_MOVE";
	
	public static final String OPTION_MOUSE = "MOUSE";
	
	public static final String OPTION_HOTKEY = "HOTKEY";
	
	public static final String OPTION_SCANNING_SYNCHRONOUS = "SCANNING_SYNCHRONOUS";
	
	public static final String OPTION_SCANNING = "SCANNING";
	
	public static final String OPTION_MUSIC_VOLUME = "MUSIC_VOLUME";
	
	public static final String OPTION_SOUND_VOLUME = "SOUND_VOLUME";
	
	public static final String OPTION_SOUND = "SOUND";
	
	public static final String OPTION_INFO_SOUND = "INFO_SOUND";
	
	public static final String OPTION_LEFTTOP_PANEL = "LEFTTOP_PANEL";
	
	public static final String OPTION_RIGHTTOP_PANEL = "RIGHTTOP_PANEL";
	
	public static final String OPTION_ACTION_PANEL = "RIGHTTOP_PANEL";
	
	public static final String OPTION_MINI_MAP = "MINI_MAP";
	
	public static final String OPTION_BATTLE_LOCAL = "BATTLE_LOCAL";
	
	public static final String CHAT_NAME_SAY = "say";
	
	public static final String CHAT_NAME_TEAM = "team";
	
	private final Map<String, Byte> options = Maps.newHashMap();
	
	public byte getState(String name) {
		return options.get(name);
	}
	
	public void setState(String name, byte state) {
		options.put(name, state);
	}
	
	public Set<String> getNameSet() {
		return options.keySet();
	}
	
	@Override
	public Options clone() {
		Options ret = new Options();
		ret.options.putAll(options);
		return ret;
	}

}
