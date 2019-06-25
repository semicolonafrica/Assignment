
package chapter4.exercise4_18;
import java.util.Scanner;

public class CreditCalculator{

	
	public static void calculateBalance() {

        Scanner input = new Scanner(System.in);
		
		System.out.println("enter allowed credit limit: ");
		int creditLimitAllowed = input.nextInt();
		System.out.println();
        
		System.out.println("enter beginningBalnce: ");
        int beginningBalance = input.nextInt();
        
		System.out.println("enter credit applied: ");
        int creditApplied = input.nextInt();
        
		System.out.println("enter items charged: ");
		int itemCharged = input.nextInt();
		
       int newBalance = beginningBalance+ itemCharged - creditApplied;
        
        System.out.println(newBalance);
        
        System.out.println();
        
        if(newBalance > creditLimitAllowed) {
        	System.out.println("credit limit exceeded");
        }
        else
        	System.out.println("spend!"); 
    
        input.close();
	}
   
}