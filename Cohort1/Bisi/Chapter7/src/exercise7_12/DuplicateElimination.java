package exercise7_12;
import java.util.Scanner;

public class DuplicateElimination {

	public static void main(String[] args) {
		
	int[] digit = new int[5];
	int value = 0;
	int count;	
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter your value:");
	for(count = 0; count <= digit.length; count++) {
		value = in.nextInt();
		if(value == digit[count]) {
			System.out.println("Enter new value:");
		} else if(value != digit[count]) {
	}
		
	}
		digit[count] = value;	
	
		
//		for(count = 0; count < digit.length; count++) {
//			System.out.println("Put in your values:");
//			 number = in.nextInt();
//	//	if (number > 10 && number <= 100) {
//		
//		// if(number != digit[count]){	
//			if(number == digit[0] && number == digit[1] && number == digit[2] && number == digit[3] && number == digit[4]) {
//				System.out.println("Value already exist, please enter a new value:");
//				 number = in.nextInt();
//				}
//			//	else { System.out.println("Ok");//("Value already exist, please enter a new value:");
//			//	number = in.nextInt();
//				//	}
//			  digit = number;
//				}		
			System.out.println("Index \t Numbers");
			 System.out.println(count + "\t"+ value);
	}	
			
	
}
