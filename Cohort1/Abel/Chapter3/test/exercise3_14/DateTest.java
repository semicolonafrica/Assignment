package exercise3_14;

import java.util.Scanner;

public class DateTest {
    public static void main (String [] args) {
         
      Scanner input = new Scanner(System.in) ;
 
            
       
        System.out.print ("Enter Day: ");
        int day = input.nextInt();
        

        System.out.print ("Enter Month: ");
        int month = input.nextInt();
      
         
        System.out.print ("Enter Year: ");
        int year = input.nextInt();
        
      
         Date show = new Date (day ,month, year);
         show.setday(day);
         System.out.println ();
         show.setMonth(month);
         System.out.println ();
         show.setYear(year);
         System.out.println ();
        show.displayDate();
 input.close();
    }
}
