package chapter5.exercise520;

/* Author: ADEBAYO Johnson
Date: 08/06/2019 
Exercies4: Question 4.29 
Purpose: To print square of asterisk
		pi = (4/1)-(4/3)+(4/5)-(4/7)+(4/9)-(4/11)+(4/13)...
*/ 
public class CalculatePi {
   public void piCalculator(){
       double x = 4;
       double division;
       double division1 =1;
       double pi1 =0; // initializing pi
       System.out.println("Terms" + "\t" + "Term value" + "\t\tpi value");
       for (int counter =1 ; counter <=4000; counter +=2){ // looping to obtain the odd value of denominators
           if (((counter - 1) % 4 == 0) ||(counter ==1 ) ) { // setting condition in order to add negative to make the terms negative or positive 
               division = x/counter; // dividing the constant numerator by the varying odd denominator
               division1 = division; // the result of the division above remain positive fraction (or decimal)
           }
           else {
               division = x/counter; // dividing the constant numerator by the varying odd denominator
               division1 = (-1 * division); // the result of the above is multiply by -1 to have negative fraction (or decimal)
           }
           pi1 += division1; // add the terms of the series together to obtain pi1
           System.out.println("\t" + division1 + "\t" + pi1); // print the result  
       }
       System.out.println(pi1); // print pi1
   }
	public static void main(String[] args) {

       CalculatePi calculator1 = new CalculatePi();
       calculator1.piCalculator();    
   }
}