/**
 * 
 */
package chapter7;

/**
 * @author User
 *
 */
import java.util.Scanner;

public class DuplicateElimination {
	
	public static boolean compare(int[] store,int number) {
		
			for(int value:store) {
				if(number==value) 
					return true;
				
			}
			
			
		
		return false;
	}
	
	public static void display() {
		int[] array= new int[5];
		int number;
//		if(number>=10||number<=100) {
			
			Scanner accept = new Scanner(System.in);
			
			
			for(int counter=0;counter<array.length;counter++) {
				System.out.println("enter value");
				number=accept.nextInt();
				boolean result=compare(array,number);
				
				if(result==false) {
					array[counter]=number;
				}
				
				for(int value:array)
					if(value!=0)
					System.out.println(value);
				
				
			}
		}
		
		
	
	//}
	
	
	public static void main(String []args) {
		display();
	}
}
