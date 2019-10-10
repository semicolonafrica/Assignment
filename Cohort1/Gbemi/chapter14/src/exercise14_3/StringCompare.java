

package exercise14_3;

import java.util.NoSuchElementException;
import java.util.Scanner;
 public class StringCompare {
	
	 
//public static void main(String[] args) {
	String str1;
	 String str2;
	 public void compare() {
	try {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter two words to compare");
	str1 =input.next();
	 str2 = input.next();
	if(str1.compareTo(str2)==0){
		System.out.println("passed the two String are equal");
		
	}
	else if(str1.compareTo(str2)<0) {
		System.out.println("first String is greater than Second String");
	}
	
	else if(str1.compareTo(str2)>0) {
		System.out.println("first String is less than Second String");
		
	}
	
	}
	catch(NoSuchElementException e) {
		System.err.print("input must be a letter");
	}
	finally {
		System.out.println("i try the finally block");
	}

 
 }
 
}