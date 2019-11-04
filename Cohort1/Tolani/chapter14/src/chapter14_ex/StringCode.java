package chapter14_ex;

import java.util.Scanner;

public class StringCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Hello there";
		
		char[] charArray = new char[5];
		
		System.out.printf("%s %d%n", "Give me the length of my string: ",name.length());
		
		
		for(int count = name.length()-1; count >=0;count--) {
			System.out.printf("%c", name.charAt(count));
		}
		
		name.getChars(0, 5, charArray, 0);
		System.out.printf("%n The character is: ");
		
		for(char character: charArray)
			System.out.print(character);
		
		System.out.println();
		
		
		String sample = "hello";
		String sample2 = new String("hello");
		String sample3 = "happy birthday";
		String sample4 = "Happy Birthday";
		
		
		if(sample.equals(sample2)) {
			System.out.println("They are the same content");
		}else {
			System.out.println("They are  not the same content");
		}
		
		if(sample == sample2) {
			System.out.println("They are the same object");
		}else {
			System.out.println("They are  not the same object");
		}
		
		if(sample3.equalsIgnoreCase(sample4) ) {
			System.out.println("They are the same content when case is ignored");
		}else {
			System.out.println("They are not the same content when case is ignored");
		}
		
		
			System.out.printf("%nsample.compareTo(sample2) %d",sample.compareTo(sample2));
		
			System.out.printf("%nsample2.compareTo(sample) %d",sample2.compareTo(sample));
			
			System.out.printf("%nsample3.compareTo(sample4) %d%n",sample3.compareTo(sample4));
			
			
			StringBuilder yo = new StringBuilder("Welcome to my house");
			
			System.out.println("The length of the this object is :"+yo.length());
			System.out.println("The capacity of the this object is :"+yo.capacity());
			yo.ensureCapacity(50);
			System.out.printf("%nThe new capaciity is : %d",yo.capacity());
			yo.setLength(60);
			System.out.printf("%nThe new length is : %d%n", yo.length());
//			Tokeniziation 
			Scanner input = new Scanner(System.in);
			System.out.println("Enter your names: ");
			String names = input.nextLine();
			
			String[] seperated = names.split(" ");
			System.out.printf("%nThe length is : %d%n", names.length());
			
			for(String newList : seperated) {
				System.out.println(newList);
			}
		
	}

}
