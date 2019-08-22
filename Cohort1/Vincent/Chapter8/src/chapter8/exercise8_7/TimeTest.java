package chapter8.exercise8_7;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time2 t1 = new Time2(); // 00:00:00
		Time2 t2 = new Time2( 2 ); // 02:00:00
		Time2 t3 = new Time2( 21, 34 ); // 21:34:00
		Time2 t4 = new Time2( 12, 25, 42 ); // 12:25:42
		Time2 t5 = new Time2( t4 ); // 12:25:42
		
		System.out.println( "Constructed with:" );
		System.out.println( "t1: all arguments defaulted" );
		System.out.printf( " %s\n", t1.toUniversalString() );
		System.out.printf( " %s\n", t1.toString() );
		
				System.out.println(
					"t2: hour specified; minute and second defaulted" );
				 System.out.printf( " %s\n", t2.toUniversalString() );
				 System.out.printf( " %s\n", t2.toString() );
	}

}
