package exercise8_5;

public class Time2 {
	private int hour;
	private int minute;
	private int second;
	
	
	public Time2() {
		this(0, 0, 0);
	}
	
	public Time2(int hour) {
		this(hour , 0 , 0);
	}
	
	public Time2(int hour, int minute) {
		this(hour, minute, 0);
	}
	
	public Time2(int hour, int minute, int second) {
		setTime(hour, minute, second);
	}
	
	public Time2(Time2 time) {
		this(time.getHour(), time.getMinute(), time.getSecond());
	}
	
	public void setTime(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public int getHour() {
		return hour*60*60;
	}
	public void setHour(int hour) {
		if(hour >= 0 && hour < 24)
			this.hour = hour;
		else
			throw new IllegalArgumentException( "hour must be 0-23" );
	}
	public int getMinute() {
		return minute*60;
	}
	public void setMinute(int minute) {
		if(minute >= 0 && minute < 60)
			this.minute = minute;
		else
			throw new IllegalArgumentException( "minute must be 0-59" );
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second >= 0 && second < 60)
			this.second = second;
		else
			throw new IllegalArgumentException( "second must be 0-59" );
	}
	
	public void repTime() {
		int h = getHour();
		int m = getMinute();
		int s = getSecond();
		
		System.out.println(h+m+s +" seconds");
	}
	
}
