package chapter8;

public class Time1Test {

	public static void main(String[] args) {
		 Time1 time = new Time1();
		 
		 displayTime("After time object is created",time);
		 System.out.println();
		 
		 time.setTime(13, 27, 6);
		 displayTime("After calling setTime", time);
		 System.out.println();
	}
		 private static void displayTime(String header, Time1 t) {
			 
			 System.out.printf("%s%n"
			 		+ "Universal time: %s%nStandard time: %s%n", header, t.toUniversalString(), t.toString());
			 
		 }
		 
		 
	

}
