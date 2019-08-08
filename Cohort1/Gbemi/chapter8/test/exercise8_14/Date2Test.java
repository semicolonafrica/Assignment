package exercise8_14;



public class Date2Test {

	public static void main(String[] args) {
		Date2 myDate=new Date2(5,10,1994);
		Date2 myDate2=new Date2("aug",10,1994);
		Date2 myDate3=new Date2(59,1994);
		
	
		
		displayTime("t1",myDate);
		displayTime("t2",myDate2);
		displayTime("t1",myDate3);
		
	}
	private static void displayTime(String header,Date2 myDate) {
		System.out.printf("%s%n  %s%n ", header, myDate.toString());
		
	}

}
