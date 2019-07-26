package chapter8;

import java.util.Scanner;

public class TimeTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		

		Time time = new Time(12,20,40);
		System.out.printf("The time in Seconds: %dsec",time.addSecond());
		
		input.close();

	}

}
