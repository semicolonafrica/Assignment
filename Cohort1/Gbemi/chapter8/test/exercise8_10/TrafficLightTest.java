package exercise8_10;
import java.util.EnumSet;

import exercise8_10.TrafficLight;
public class TrafficLightTest {

	public static void main(String[] args) {
		
		System.out.println("Obey the traffic light and duration");
		System.out.println();
		System.out.printf("%2s%25s%n", "Light","Duration");
		for(TrafficLight obey:TrafficLight.values())
			
			System.out.printf("%2s%25s%n", obey,obey.getDuration());
	}

}
