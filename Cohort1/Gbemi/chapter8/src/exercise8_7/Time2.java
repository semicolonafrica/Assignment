/**
 * 
 */
package exercise8_7;

/**
 * @author User
 *(Enhancing Class Time2) Modify class Time2 of Fig. 8.5 to include a tick method that increments
the time stored in a Time2 object by one second. Provide method incrementMinute to increment
the minute by one and method incrementHour to increment the hour by one. Write a
program that tests the tick method, the incrementMinute method and the incrementHour method
to ensure that they work correctly. Be sure to test the following cases:
a) incrementing into the next minute,
b) incrementing into the next hour and
c) incrementing into the next day (i.e., 11:59:59 PM to 12:00:00 AM).
 */
public class Time2 {
	private int hour; // 0 - 23
	 private int minute; // 0 - 59
	 private int second; // 0 - 59
	 
	 	public Time2()
	 	{
	 		this(0,0,0);
	 		
	 	}
	 	
	 	public Time2(int hour) {
	 		this(hour,0,0);
	 	}
	 	
	 	public Time2(int hour,int minute) {
	 		this(hour,minute,0);
	 	}
	 	public Time2(int hour,int minute,int second){
	 		
	 		
	 		if(hour<0|| hour>=24)
	 			throw new IllegalArgumentException();
	 		if(minute<0 || minute>=60)
	 			throw new IllegalArgumentException();
	 		if(second<0 || second>=60)
	 			throw new IllegalArgumentException();
	 		
	 		this.hour=hour;
	 		this.minute=minute;
	 		this.second=second;
	 	}
	 	
	 	public Time2(Time2 time) {
	 		
	 		this(time.getHour(), time.getMinute(), time.getSecond());
	 		
	 	}
	 	
	 	public void setTime(int hour,int minute,int second) {
	 		if(hour<0 || hour>=24)
	 			throw new IllegalArgumentException();
	 		
	 		if(minute<0 || minute>=60)
	 			throw new IllegalArgumentException();
	 		
	 		if(second<0 || second>=60)
	 			throw new IllegalArgumentException();
	 		
	 		this.hour=hour;
	 		this.minute=minute;
	 		this.second=second;
	 		
	 	}
	 	
	 	public void setHour(int hour) {
	 		if(hour<0 || hour>=24)
	 			throw new IllegalArgumentException();
	 		
	 		this.hour=hour;
	 	}
	 	
	 	public void setMinute(int minute) {
	 		if(minute<0 || minute>=60)
	 			throw new IllegalArgumentException();
	 		
	 		this.minute=minute;
	 	}
	 	
	 	public void setSecond(int second) {
	 		if(second<0 || second>=60) {
	 			
	 			throw new IllegalArgumentException();
	 			
	 		}
	 		
	 		this.second=second;
	 	}
	 	
	 	public int getHour() {
	 		return hour;
	 	}
	 	
	 	public int getMinute() {
	 		return minute;
	 	}
	 	
	 	public int getSecond() {
	 		return second;
	 	}
	 	
	 	public String toUniversalString() {
	 		return String.format("%02d:%02d:%02d", increaseHour(),increaseMinute(),tickSecond());
	 		
	 	}

	 	public String toString() {
	 		return String.format("%02d:%02d:%02d", ((increaseHour()==0 ||increaseHour()==12) ? 12  : increaseHour() %12),increaseMinute(), tickSecond(),(increaseHour()<12?"AM" :"PM"));
	 	}
	

	 	
	 	public int tickSecond() {
	 		
	 		if(second>=0&&second<59) {
	 			second++;
	 		}
	 		else {
	 			second=0;
	 		}
	 		return(second);
	 	}
	 	
	 	public int increaseHour() {
	 		
	 		if(hour>=0&&hour<24) {
	 			hour++;
	 		}
	 		else {
	 			hour=0;
	 		}
	 		return (hour);
	 		
	 	}
	 	public int increaseMinute() {
	 		if(minute>=0&&minute<59) {
	 			minute++;
	 		}
	 		else {
	 			minute=0;
	 		}
	 		return(minute);
	 	}

	 	

}
