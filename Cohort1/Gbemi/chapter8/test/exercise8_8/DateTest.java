package exercise8_8;

import exercise8_8.Date;

public class DateTest {

	public static void main(String[] args) {
		Date obj= new Date(01,01,1992);
		System.out.println("month"+" "+obj.getMonth()+"                  "+obj.getYear());
		
		for(int i=1;i<400;i++) {
			obj.nextDay();
			
			System.out.print(obj.getDay()+"     ");
			if(i%6==0) {
				System.out.println();
			}
			if(obj.getDay()==1) {
				System.out.println();
				System.out.println("month"+" "+obj.getMonth()+"                  "+"Year"+"  "+obj.getYear());
			}
			
				
			}
			

	}

}
