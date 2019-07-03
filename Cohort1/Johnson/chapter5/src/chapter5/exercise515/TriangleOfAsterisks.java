package chapter5.exercise515;

/* Author: ADEBAYO Johnson
Date: 08/06/2019 
Exercies4: Question 4.29 
Purpose: To print square of asterisk
*/ 

import java.util.Scanner; // importing class Scanner
public class TriangleOfAsterisks {
   public static void main(String[] args){ // declaration of main method
       TriangleOfAsterisks triangle1 = new TriangleOfAsterisks();
       TriangleOfAsterisks triangle2 = new TriangleOfAsterisks();
       TriangleOfAsterisks triangle3 = new TriangleOfAsterisks();
       TriangleOfAsterisks triangle4 = new TriangleOfAsterisks();

       System.out.println("a");
       triangle1.trianglePattern1();
       
       System.out.println("\nb\n");
       triangle2.trianglePattern2();

       System.out.println("\nc\n");
       triangle3.trianglePattern2();

       System.out.println("\nd\n");
       triangle4.trianglePattern1();
   }
   public void trianglePattern1(){    
       int row = 10; // declare and instantiate the number of row
       //int counter = 1; // declaring and initializing counter

       for(int counter = 1; counter <= row; counter++){ // creating a while loop using counter and size to set the "loop continuation condition"
           //int column =1 ; // declaring and initializing variable 'top'
           //while (column <=counter ){ // creating second loop 
           for(int column =1; column <= counter; column++){

               // print the output of the ternary operators if the while loop and their conditions are satisfied
               //System.out.print("*");
        	   System.out.print(counter ==1 || counter == row ? "*" : "");
               System.out.print((((counter !=1 && counter != row) && (column ==1 || column == row))  ? "*" : ""));
               System.out.print((((counter !=1 && counter != row) && (column !=1  && column != row))  ? "*"  : ""));               
               //column++; // increment top
           }
           System.out.println("\n"); // Move the cursor to the nextline after each loop of the first while loop
           //counter++; // increment counter
       }
   }
   public void trianglePattern2(){
       
       int row2 = 1; // store the value entered by the user into variable size

       for(int counter2 =10; counter2 >= row2; counter2-- ){ // creating a while loop using counter and size to set the "loop continuation condition"
           //int column2 =10 ; // declaring and initializing variable 'top'
           for ( int column2 =1; column2 <=counter2; column2++ ){ // creating second loop 

               // print the output of the ternary operators if the while loop and their conditions are satisfied
        	   //System.out.print("*");
        	   System.out.print(counter2 ==1 || counter2 == row2 ? "*" : "");
               System.out.print((((counter2 !=1 && counter2 != row2) && (column2 ==1 || column2 == row2))  ? "*" : ""));
               System.out.print((((counter2 !=1 && counter2 != row2) && (column2 !=1  && column2 != row2))  ? "*"  : ""));
               
               
               //column2--; // increment top
           }
           System.out.println("\n"); // Move the cursor to the nextline after each loop of the first while loop
           //counter++; // increment counter
       }
   }
}