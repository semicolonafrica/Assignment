package chapter7;
import java.util.Scanner;
public class FibonacciTest {
    
 


	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number of fibonacci");
		int number=input.nextInt();
		Fibonacci fibo=new Fibonacci();
		fibo.printFibonacci(new int[number]);
		fibo.doubleFibonacci(new double[number]);
		// TODO Auto-generated method stub

	}

}
