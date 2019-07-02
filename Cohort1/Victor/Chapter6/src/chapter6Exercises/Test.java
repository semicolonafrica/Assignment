package chapter6Exercises;

public class Test {
	
	static int x = 0;
	
	public void count() {
		x++;
	}
	

	public static void main(String[] args) {
		Test test = new Test();
		test.count();
		test.count();
		test.count();
		System.out.println(x);
	}

}
