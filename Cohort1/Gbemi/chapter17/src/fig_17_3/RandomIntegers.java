package fig_17_3;

import java.security.SecureRandom;
import java.util.stream.Collectors;

public class RandomIntegers {
	public static void main(String[] args) {
		SecureRandom ran = new SecureRandom();
		System.out.println("Randoms numbers");
		ran.ints(10, 1, 7)
			.forEach(System.out::println);
		String numbers = ran.ints(10,1, 7)
							.mapToObj(String::valueOf)
							.collect(Collectors.joining(""));
		System.out.print(numbers);
	}

}
