package chapter8.exercise8_7;

public class Time2 {
	
//	 private int hour; 
//	 private int minute; 
//	 private int second; 
	private int secondsAfterMidnight;
	 public Time2()
	 {
	 this( 0, 0, 0 ); // invoke Time2 constructor with three arguments
	 } // end Time2 no-argument constructor
	 // Time2 constructor: hour supplied, minute and second defaulted to 0
	 public Time2( int h )
	 {
	 this( h, 0, 0 ); // invoke Time2 constructor with three arguments
	 } // end Time2 one-argument constructor
	 // Time2 constructor: hour and minute supplied, second defaulted to 0
	 public Time2( int h, int m )
	 {
	 this( h, m, 0 ); // invoke Time2 constructor with three arguments
	 } // end Time2 two-argument constructor
	 // Time2 constructor: hour, minute and second supplied
	 public Time2( int h, int m, int s )
	 {
	 setTime( h, m, s ); // invoke setTime to validate time
	 } // end Time2 three-argument constructor
	 // Time2 constructor: another Time2 object supplied
	 public Time2( Time2 time ) { 
	    this( time.getHour(), time.getMinute(), time.getSecond() );
	}
	public void setTime( int h, int m, int s )
	
	 { 
//	 setHour( h ); // set the hour
//	 setMinute( m ); // set the minute
//	 setSecond( s ); // set the second
		if(((h >= 0) && (h > 24)))
			secondsAfterMidnight = h * 60 *60;
		else
			secondsAfterMidnight = 0;
		if(((m >=0)&& (m < 60)))
			secondsAfterMidnight += m * 60;
		if(((s >=0) &&(s < 60)))
			secondsAfterMidnight += s;
	 } // end method setTime

	 // validate and set hour
	  public int getHour( )
	 {
//	     hour = ( ( h >= 0 && h < 24 ) ? h : 0 );
		  return secondsAfterMidnight / 3600;
	 } // end method setHour

	 // validate and set minute
	     public int getMinute( )
	 {
//	      minute = ( ( m >= 0 && m < 60 ) ? m : 0 );
			  return secondsAfterMidnight % 3600 / 60;	 
	}

	// validate and set second
	     public int getSecond(  )
	 {
//	     second = ( ( s >= 0 && s < 60 ) ? s : 0 );
			  return secondsAfterMidnight % 60;
	 } // end method setSecond

	    // Get Methods
	    // get hour value
//	     public int getHour()
//	 {
//	     return hour;
//	 } // end method getHour
//
//	     // get minute value
//	     public int getMinute()
//	 {
//	     return minute;
//	 } // end method getMinute
//
//	     // get second value
//	     public int getSecond()
//	 {
//	 return second;
//	  } // end method getSecond

	 // convert to String in universal-time format (HH:MM:SS)
	     public String toUniversalString()
	 {
	 return String.format(
	 "%02d:%02d:%02d", getHour(),getMinute(), getSecond() );
	 } // end method toUniversalString

	 // convert to String in standard-time format (H:MM:SS AM or PM)
	 public String toString()
	 {
	 return String.format( "%d:%02d:%02d %s",
	 ( (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12 ),
	 getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM" ) );
	 } 

}
