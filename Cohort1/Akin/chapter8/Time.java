package chapter8;

public class Time {

	private int hour;
	private int minute;
	private int second;
	
	//Time2 no-argument constructor;
	//Initializes each instance variable to zero
	
	public Time() {
		this(0,0,0);
	}
	
	public Time(int hour) {
		this(hour,0,0);
	}
	
	public Time(int hour, int minute) {
		this(hour,minute,0);
	}
	
	
//	public Time(int second) {
//		this(0,0,second);
//	}
	
	public Time(int hour, int minute, int second) {
		if(hour < 0 || hour >= 24) {
			throw new IllegalArgumentException("hour must be 0-23");
		}
			if(minute < 0 || minute >= 60) {
			throw new IllegalArgumentException("minute must be 0-59");
		}
			if(second < 0 || second >= 60) {
			throw new IllegalArgumentException("second must be 0-59");
		}
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public Time(Time time) {
		this(time.getHour(), time.getMinute(),time.getSecond());
	}
	
	public void setTime(int hour, int minute, int second) {
		if(hour < 0 || hour >= 24) {
			throw new IllegalArgumentException("hour must be 0-23");
		}
			if(minute < 0 || minute >= 60) {
			throw new IllegalArgumentException("minute must be 0-59");
		}
			if(second < 0 || second >= 60) {
			throw new IllegalArgumentException("second must be 0-59");
		}
			
			this.hour = hour;
			this.minute = minute;
			this.second = second;
			
	}
	
	public void setHour(int hour) {
		if(hour < 0 || hour >= 24)
			throw new IllegalArgumentException("hour must be 0-23");
		this.hour = hour;
	}
	
	public void setMinute(int minute) {
		if(hour < 0 || hour >= 60)
			throw new IllegalArgumentException("minute must be 0-59");
		this.minute = minute;
	}
	
	public void setSecond(int second) {
		if(hour < 0 || hour >= 24)
			throw new IllegalArgumentException("second must be 0-59");
		this.second = second;
	}
	
	public int getHour() {
		int newhour = hour * 3600;
		return newhour;
	}
	
	public int getMinute() {
		int newMinute = minute * 60;
		return minute;
	}
	
	public int getSecond() {
		
		return second;
	}
	
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
	
	
	
	public String toString()
	{
		return String.format("%d:%02d:%02d %s",
				((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
				getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
	}
	
	public int addSecond() {
		int sum;
		sum = getHour() + getMinute() + getSecond();
		return sum;  
	}
	
}
