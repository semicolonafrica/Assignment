package exercise8_10;

public enum TrafficLight {
	RED("STOP",30),
	YELLOW("READY",10),
	GREEN("GO",45);
	
	private final String action;
	
	private final int duration;
	
	TrafficLight(String action,int duration ){
		
		this.action= action;
		this.duration = duration;
	}
	
	public String getAction() {
		return action;
	}
	
	public int getDuration() {
		return duration;
	}
	
	

}
