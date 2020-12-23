package chapter5.exercise515;

/* Author: ADEBAYO Johnson
Date: 08/06/2019 
Exercies4: Question 4.29 
Purpose: To print square of asterisk
*/ 

import java.util.Scanner; // importing class Scanner
public class SquareOfAsterisks4 {
   public static void main(String[] args){ // declaration of main method
       SquareOfAsterisks4 triangle1 = new SquareOfAsterisks4();
       SquareOfAsterisks4 triangle2 = new SquareOfAsterisks4();
       SquareOfAsterisks4 triangle3 = new SquareOfAsterisks4();
       SquareOfAsterisks4 triangle4 = new SquareOfAsterisks4();

       System.out.println("a");
       triangle1.trianglePattern1();
       
       System.out.println("\nb\n");
       triangle2.trianglePattern2();

       System.out.println("\nc\n");
       triangle3.trianglePattern4();

       System.out.println("\nd\n");
       triangle4.trianglePattern3();
   }
   public void trianglePattern1(){    
       int row = 10; // declare and instantiate the number of row
       for(int counter = 1; counter <= row; counter++){ // creating a while loop using counter and size to set the "loop continuation condition"
           for(int column =1; column <= counter; column++){
               System.out.print("*");
           }
           System.out.println(" ");
           //System.out.println("\n"); // Move the cursor to the nextline after each loop of the first while loop
       }
   }
   public void trianglePattern2(){      
       int row2 = 1; // store the value entered by the user into variable size     
       for(int counter2 =10; counter2 >= row2; counter2-- ){ // creating a while loop using counter and size to set the "loop continuation condition"
           //int column2 =10 ; // declaring and initializing variable 'top'
           for ( int column2 =1; column2 <=counter2; column2++ ){ // creating second loop 
               // print the output of the ternary operators if the while loop and their conditions are satisfied
               System.out.print("*");
           }
           System.out.println(" ");
           //System.out.println("\n"); // Move the cursor to the nextline after each loop of the first while loop
       }
   }
   public void trianglePattern3(){    
       int row3 = 10; // declare and instantiate the number of row
       for(int counter3 = 1; counter3 <= row3; counter3++){ // creating a for loop using counter and size to set the "loop continuation condition"
           for (int r = row3 -counter3; r >=1; r--){
               System.out.print(" ");
           }    
           for(int column3 =counter3; column3>0; column3--){ 
               System.out.print("*");   
           }
           System.out.println(" ");
           //System.out.println("\n");    
       }
   }
   public void trianglePattern4(){
       
       int row4 = 1; // store the value entered by the user into variable size
       for(int counter4 =10; counter4 >= row4; counter4-- ){ // creating a while loop using counter and size to set the "loop continuation condition"
           for ( int column4 =counter4 - 8; column4 <=row4; column4++ ){ // creating second loop 
               System.out.print(" ");
           }
           for (int i = counter4; i >0; i--){ // loop base on the value of i = counter4 
               System.out.print("*");
           }
           System.out.println(" ");
           //System.out.println("\n"); // Move the cursor to the nextline after each loop of the first while loop
       }
   }
}