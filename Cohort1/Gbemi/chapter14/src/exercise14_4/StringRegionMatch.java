package exercise14_4;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class StringRegionMatch {
	String str1;
	 String str2;
	 public void compareRegion() {
	try {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter two words to compare");
	str1 =input.next();
	 str2 = input.next();
	if(str1.regionMatches(true, 4, str2, 4, 3)){
		System.out.println("passed the two String are equal");
		
	}
	else {
		System.out.println("they are not equal");
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
