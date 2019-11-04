package exercise8_10;

public class TrafficLightTest {

	public static void main(String[] args) {
		
		for(TrafficLight light : TrafficLight.values()) {
			System.out.printf("%-10s%-10s%d%n", light,light.getAction(),light.getDuration());
		}

	}

}
