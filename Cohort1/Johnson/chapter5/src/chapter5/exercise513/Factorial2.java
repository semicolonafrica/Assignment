package chapter5.exercise513;

import java.util.Scanner;
public class Factorial2 {

	public static void main(String[] args) {
		Factorial2 factorial2 = new Factorial2();
        factorial2.factorial();

	}
	public void factorial(){
		//Scanner input = new Scanner (System.in);
        //System.out.print("Enter number of factorial: "); // Enter the factorial you want to find 
        //int num1 = input.nextInt();
        int num1 = 20;

        long factorial = 1;
        System.out.println("Number" + "\t\t\t" + "Factorial");

        for(int counter = 1; counter <=num1; counter++){
            if (num1 != 0){
                factorial = factorial * counter;
                System.out.println(counter + "!" + "\t\t\t" + factorial);
            }
            else{
                factorial = factorial;
                System.out.println(counter + "!" + "\t" + factorial);
            }        
        }
	}
}
