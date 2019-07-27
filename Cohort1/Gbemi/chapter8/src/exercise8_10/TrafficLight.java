/**
 * 
 */
package exercise8_10;

/**
 * @author User
 * Write an enum type TrafficLight, whose constants (RED, GREEN, YELLOW) take one parameter—
the duration of the light. Write a program to test the TrafficLight enum so that it displays the
enum constants and their durations.
 *
 */
public enum TrafficLight {
RED("60 Second"),GREEN("180 Second"),YELLOW("30 Second");
	
	private final String duration;
	
	TrafficLight(String duration){
		this.duration=duration;
	}

	public String getDuration() {
		return duration;
	}
	
	
}
