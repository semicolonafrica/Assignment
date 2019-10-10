package fig_17_3;

import java.util.stream.IntStream;

public class StreamMapReduce {
	public static void main(String[]args) {
		int total = IntStream.rangeClosed(1,10)
							 .map((int x)->{return x*2;})
							 .sum();
		System.out.println(total);
	}

}
 