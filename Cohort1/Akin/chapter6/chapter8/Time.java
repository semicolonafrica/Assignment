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
	
	public int getHour1() {
		int newhour = hour * 3600;
		return newhour;
	}
	
	public int getMinute1() {
		int newMinute = minute * 60;
		return newMinute;
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
		return String.format("%02d:%02d:%02d", incrementHour(), incrementMinute(), tick());
	}
	
	public int tick() {
		
		int newSecond = getSecond() + 1; 
		
		return newSecond;
		
	}
	
	public int incrementMinute() {
		
		int incMinute = getMinute() + 1;
		
		return incMinute;
		
	}
	
	public int incrementHour() {
		int incHour = 0;
		if(hour > 0 && hour <= 12) {
		incHour = getHour() + 1;
		}else {
			//System.out.printf("You have moved to the next day",hour);
		}
		return incHour;
	}
	
	
	public String toString()
	{
		return String.format("%d:%02d:%02d %s",
				((incrementHour() >= 0 && incrementHour() <= 12) ? incrementHour() : incrementHour() % 12),
				((incrementMinute() >= 0 && incrementMinute() < 60) ? incrementMinute() : incrementMinute() % 60), ((tick() >= 0 && tick() < 60) ? tick() : tick() % 60), (incrementHour() < 12 ? "AM" : "PM"));
	}
	
	public int addSecond() {
		int sum;
		sum = getHour1() + getMinute1() + getSecond();
		return sum;  
	}
	
}
