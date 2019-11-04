package exercise8_8;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date1 myDate = new Date1(12,2,1996);
		int month = myDate.getMonth();
		int year = myDate.getYear();
		int day =0;
	
		for(int i = 0;i<100;i++) {
			if(myDate.nextDay(i) > 31) {
				month++;
				i=0;
				if(month > 12) {
					month =1;
					year++;
				}else if(month<=12) {
					
				}
			}
			System.out.printf("%d/%d/%d%n", myDate.nextDay(i),month,year);
			
		}

	}

}
