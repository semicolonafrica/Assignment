package chapter4.exercise4_34;

public class InfiniteLoop {

	public static void main(String[] args) {

		long answer = 1;
		int counter = 2;
		while(counter < 10000)
		{
			answer = answer * 2;
			System.out.println(answer );
			counter += 2;
			
		}
	}

}
