package chapter5.exercise513;

import java.util.Scanner;
public class Factorial{
	
    public static void main(String[] args){
        Factorial factorial1 = new Factorial();
        System.out.println("Factorial of the number entered is: " + factorial1.factorial());
    }
    public long factorial(){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter number of factorial: "); // Enter the factorial you want to find 
        int num1 = input.nextInt(); 

        long factorial = 1;

        for(int counter = 1; counter <=num1; counter++){
            if (num1 != 0){
                factorial = factorial * counter;
            }
            else{
                factorial = factorial;
            }          
        }
        return factorial;
    }
}