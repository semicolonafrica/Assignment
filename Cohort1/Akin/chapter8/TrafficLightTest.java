package chapter8;

import java.util.EnumSet;

public class TrafficLightTest {

	public static void main(String[] args) {
		
		System.out.println("Display traffic status and the duration");
		
		for(TrafficLight traffic: TrafficLight.values())
			System.out.printf("%s%15d%n",traffic, traffic.getDuration());
	}

}
