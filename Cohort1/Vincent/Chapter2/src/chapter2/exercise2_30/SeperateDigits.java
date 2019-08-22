package chapter2.exercise2_30;

import java.util.Scanner;
public class SeperateDigits {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 

		    System.out.println("Enter the digits");
		    int num1 = input.nextInt();
		    String store = "";
		   
		    int hold = num1 % 10; 
		    int numb = num1 /10;
		    int num = numb % 10;
		    int nu = numb / 10;
		    int n = nu % 10;
		    int ni = nu /10;
		    int na = nu / 10;
		    
		    System.out.printf("%d\t%d\t%d\t%d",ni,n,num,hold);
		}
		 
		

	}


