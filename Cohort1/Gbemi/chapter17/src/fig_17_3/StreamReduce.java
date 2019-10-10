package fig_17_3;
import java.util.stream.IntStream;
public class StreamReduce {
	public static void main(String[] args) {
		//System.out.printf(total)
			int total=	IntStream.range(1,10)
						 .sum();
	}

}
