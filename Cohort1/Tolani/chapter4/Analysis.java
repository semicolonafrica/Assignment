/*
*/

import java.util.Scanner;

public class Analysis{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int counter = 1;
    
        while(counter <= 10){
    
            System.out.print("Enter exam result, 1 for pass and 0 for 2 for failure: ");
            int result = input.nextInt();
            
            if(result == 1){
                passes = passes + 1;
            }
            else {
                failures = failures + 1;
            }
            counter++;
        }
        System.out.println("Number of passes is: " + passes);
        System.out.println("Number of failures is: " + failures);

        if(passes > 8){
            System.out.println("Bonus to instructors");
        } 
        input.close();
    } 

}