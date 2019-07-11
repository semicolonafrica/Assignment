package chapter6.exercises;

	import java.security.SecureRandom;
	import java.util.Scanner;

	/**
	 * @author LEMON
	 *
	 */
	public class ComputerAssisted4 {

		static SecureRandom random = new SecureRandom();
		static Scanner input = new Scanner(System.in);

		static int a = 0;
		static int b = 0;
		static int numb = 0;
//		static int difficult =10;
		
		public static int multiply2() {
			a = 1 + random.nextInt(100);
			b = 1 + random.nextInt(100);
			int result = a * b;
			return result;
		}

		// method that multiplies
		public static int multiply() {
			
			int result = 0;
			if (numb ==1) {
				a = 1 + random.nextInt(9);
				b = 1 + random.nextInt(9);
				result = a * b;
			}
			
			else if (numb == 2){
				a = 1 + random.nextInt(100);
				b = 1 + random.nextInt(100);
				result = a * b;
			}
			
			return result;
		}

		// method remark for wrong answers
		public static void wrongRemark() {
			int wrong = 1 + random.nextInt(4);

			switch (wrong) {
			case 1:
				System.out.println("no, please try again");
				break;
			case 2:
				System.out.println("wrong, try once more");
				break;
			case 3:
				System.out.println("don't give up");
				break;
			case 4:
				System.out.println("no, keep trying");
				break;
			}
		}

		public static void rightRemark() {
			int right = 1 + random.nextInt(4);

			switch (right) {
			case 1:
				System.out.println("very good");
				break;
			case 2:
				System.out.println("excellent");
				break;
			case 3:
				System.out.println("nice work!!");
				break;
			case 4:
				System.out.println("keep up the good work");
				break;
			}
		}

		// method that displays remark
		public static void displayRemark() {
			int response = 0;
			int counter = 10;
			double pass = 0;
			System.out.println("Enter difficulty level(enter 0 to quit) \n" + "1 for Level 1 \n2 for 2 Level 2");
			numb = input.nextInt();
			
			if(numb == 0) {
				
			}
			
			else {
			for (int i = 1; i <= counter; i++) {
				int result = multiply();
				System.out.println("what is the answer of " + a + " times " + b);
				response = input.nextInt();
				if (result != response) {
					wrongRemark();
				} 
				else {
					rightRemark();
					pass = pass + 1; // store student pass
				}
			}

			double percentage = (pass / counter) * 100; // to get student performance
			if (percentage < 75) {
				System.out.println(percentage + "% Please ask your teacher for extra help");
				displayRemark();
			} 
			else {
				System.out.println(percentage + "% Congratulations, you are ready to go to the next level!");
				displayRemark();
			}
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			displayRemark();
		}
}
