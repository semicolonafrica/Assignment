package chapter15;

import java.security.SecureRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LamdaStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SecureRandom randomNumbers = new SecureRandom();
		
		int[] values = {3,4,2,1,6,7,10,9,8,5};
		
		System.out.printf("Sum of 1 through 10 is: %d%n", IntStream.rangeClosed(1,10)
																   .sum());
		
		System.out.printf("Sum of 1 through 10 is: %d%n", IntStream.rangeClosed(1,10)
																   .map((int x) -> {return x * 2;})
				   												   .sum());
		
		System.out.println("Random numbers on seperate line:");
		randomNumbers.ints(10, 1, 7)
					 .forEach(System.out::println);
		String numbers = 
				randomNumbers.ints(10,1,7)
							 .mapToObj(String::valueOf)
							 .collect(Collectors.joining(" "));
		System.out.printf("%nRandom numbers on same line: %s%n",numbers);
		
		System.out.print("Original values: ");
		
		System.out.println(
				IntStream.of(values)
						.mapToObj(String::valueOf)
						.collect(Collectors.joining(" ")));
		
		System.out.printf("%nCount: %d%n", IntStream.of(values).count());

	}

}
