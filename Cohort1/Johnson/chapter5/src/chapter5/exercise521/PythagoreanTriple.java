package chapter5.exercise521;

/* Author: ADEBAYO Johnson
Date: 14/06/2019 
Exercies4: Question 5.21
Purpose: Program displaying table of Pythagorean triples

*/ 

public class PythagoreanTriple {

   public void pythagoras(){
       int sqr1 = 0;
       int sqr2 = 0;
       int sqrSum = 0;
       int sqrRt =0;
       int productOfSqrRt;
       for(int counter1 = 1; counter1<=500; counter1++){ // looping to obtain the first side of the right angle triangle
           for (int counter2 =1; counter2 < counter1; counter2++){ // looping to obtain values less than counter1 i.e. second sides of the triangle
               sqr1 = counter1 *counter1; // calculating the square of first side
               sqr2 = counter2 * counter2; // calculating the square of second side
               sqrSum = sqr1 + sqr2; // adding the square of the two sides 
               sqrRt = (int)Math.sqrt(sqrSum); // calculating the square root of their sum & converting to int
               productOfSqrRt = sqrRt * sqrRt; // multiplying the sqrt above with itself to obtain its square

               //checking if the productOfSqrRt = sqrSum in order to confirm if the three sides are perfect sides of a right angle triangle
               if (sqrSum == productOfSqrRt ){ 
            	   System.out.println(counter1 + "\t" + counter2 + "\t" + sqrRt + "\t\t" + sqrSum);
               } // end of "if" condition
           } // end of second loop (subloop)
       } // end of first loop (superloop)
   } // end of pythogas method
   public static void main(String[] args){
       PythagoreanTriple triangle = new PythagoreanTriple();
       System.out.println("Side1" + "\tSide2" + "\tHypotenuse" + "\tSquare of hypotenuse");
       triangle.pythagoras();    
   } // end of main method
} // end of class PythagoreanTriple

