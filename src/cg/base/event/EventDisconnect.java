package cg.base.event;

public class EventDisconnect {
	
	private final String sessionId;
	
	private final String address;
	
	public EventDisconnect(String sessionId, String address) {
		this.sessionId = sessionId;
		this.address = address;
	}

	public String getSessionId() {
		return sessionId;
	}

	public String getAddress() {
		return address;
	}

}
