
package chapter8.exercise8_7;
/**
 * @author Emmanuel Akinbode
 *
 */
public class Time2 {

	private int hour; // 0 - 23
	private int minute; // 0 - 59
	private int second; // 0 - 59


	public Time2() {
		this(0, 0, 0); // invoke constructor with three arguments
	}


	public Time2(int hour) {
		this(hour, 0, 0); // invoke constructor with three arguments
	}

	public Time2(int hour, int minute) {
		this(hour, minute, 0); // invoke constructor with three arguments
	}


	public Time2(int hour, int minute, int second) {

		if (hour < 0 || hour >= 24) 
		{
			throw new IllegalArgumentException("hour must be 0-23");
		}

		if (second < 0 || second >= 60) 
		{
			throw new IllegalArgumentException("minutes must be 0-59");
		}
		if (second < 0 || second >= 60) 
		{
			throw new IllegalArgumentException("second must be 0-59");
		}

		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public Time2(Time2 time) {
		this(time.hour, time.minute, time.second);
	}

	// set a new time value using universal time;
	// validate the data
	public void setTime(int hour, int minute, int second) {
		if (hour < 0 || hour >= 24) {
			throw new IllegalArgumentException("hour must be 0-23");
		}

		if (minute < 0 || minute >= 60) {
			throw new IllegalArgumentException("minute must be 0-59");
		}

		if (second < 0 || second >= 60) {
			throw new IllegalArgumentException("second must be 0-59");
		}

		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	// validate and set hour
	public void setHour(int hour) {
		if (hour < 0 || hour >= 24) {
			throw new IllegalArgumentException("hour must be 0-23");
		}

		this.hour = hour;
	}

	// validate and set minute
	public void setMinute(int minute) {
		if (minute < 0 || minute >= 60) {
			throw new IllegalArgumentException("minute must be 0-59");
		}

		this.minute = minute;
	}

	// validate and set second
	public void setSecond(int second) {
		if (second < 0 || second >= 60) {
			throw new IllegalArgumentException("second must be 0-59");
		}

		this.second = second;
	}

	
	public int getHour() {return hour;}

	public int getMinute() {return minute;}
	
	public int getSecond() {return second;}
	
	public int tick() {
		 int second = getSecond();
		 
		 ++second;
		 return second;
	}
	
	public int incrementMinute() {
		 int minute = getMinute();
		 if(minute>=0 && minute<=59) {
			++ minute; 
		 }
		 
		 return minute;
	}
	
	public int incremenHour() {
		 int hour = getHour();
		 ++hour ;
		 return hour;
	}

	// convert to String in universal-time format (HH:MM:SS)
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}

	// convert to String in standard-time format (H:MM:SS AM or PM)
	public String toString() {
		return String.format("%d:%02d:%02d %s",
				((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
				getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
	}
}

