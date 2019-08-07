package chapter8;

public enum TrafficLight {

	RED(10),
	GREEN(15),
	YELLOW(8);
	
	
	private final int duration;
	
	TrafficLight(int duration) {
		this.duration = duration;
	}
	
	//accessor for field duration
	public int getDuration() {
		return duration;
	}
	
	
}
