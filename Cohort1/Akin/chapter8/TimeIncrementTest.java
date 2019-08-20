package chapter8;

public class TimeIncrementTest {

	public static void main(String[] args) {
		
		Time time = new Time();
		

		
		Time t1 = new Time();
		Time t2 = new Time(2);
		Time t3 = new Time(21,34,45);
		Time t4 = new Time(10,55,53);
		Time t5 = new Time(t3);
		
//		if(checkMinute >= 60 || checkHour >= 24 || checkMinute >= 60) {
//			System.out.print
//		}
		
		
//		t4.incrementHour();
//		t4.incrementMinute();
//		t4.tick();
		
		
		displayTime("t1: hour, minute and second specified",t1);
		displayTime("t2: hour, minute and second specified",t2);
		displayTime("t3: hour, minute and second specified",t3);
		displayTime("t4: hour, minute and second specified",t4);
		displayTime("t4: hour, minute and second specified",t5);
//		try {
//			
//		}
//		catch(IllegalArgumentException e) {
//			System.out.printf("%nException while initializing t4: %s%n",e.getMessage());
//		}
		
		
		}
	public static void displayTime(String header, Time t) {
		System.out.printf("%s%n  %s%n  %s%n", header, t.toUniversalString(),t.toString());
	}

}
