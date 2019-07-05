package chapter6Exercises;
	
	import java.security.SecureRandom;
	import java.util.Scanner;

	public class ComputerAssistedInstrutions4 {
			
		static Scanner input = new Scanner(System.in);
		static SecureRandom randomNumber = new SecureRandom();
		static int number1;
		static int number2;
		static int correctAnswer;
		static int wrongAnswer;	
		static int level;	
	// method that generates question and prompts the user to enter answer
	public static void chooseDifficultyLevels(){
		
			int userAnswer = 0;
			int question = 0;
			double scoreCounter = 0;
			byte numberOfQuestions =10; 
			
			System.out.println("Enter Difficulty Level\n"
					+ "1 For Level1\n2 For Level2");
			level = input.nextInt();
			
			for( int counter =1; counter <=numberOfQuestions; counter ++) {
				
				switch (level) {
				
				case 1:
					question = multiply1();//first pick of number
					break;
				case 2:
					question = multiply2();//first pick of number
					break;
				default:
					System.out.println("Wrong Input");
					break;
				}
//				if (level == 1) {
//					question = multiply1();//first pick of number
//				}
//				if (level == 2) {
//					question = multiply2();//first pick of number
//				}
				System.out.println("How much is "+ number1 + " times " + number2);
				userAnswer = input.nextInt();
				
				if (userAnswer ==question) {
					displayCorrectRemarks();
					scoreCounter ++;
				}
				else 
					displayWrongRemarks();
				System.out.println();				
			}
			double percentage = (scoreCounter/numberOfQuestions)*100;
			int percent= (int) percentage;
			
			if (percentage<75) {
				System.out.println("You scored "+percent+ "%\n"+ "Please ask your teacher for extra help.");
			}
			else {
				System.out.println("You scored "+percent+ "%\n"+ "Congratulations, you are ready to go to the next level!");
			}
			input.close();
		}	
		// method that picks the random number does the multiplication
	public static void displayCorrectRemarks() {
			
			correctAnswer = 1 + randomNumber.nextInt(4);
			
			switch (correctAnswer) {
			
			case 1:
				System.out.println( "Very good!");
				break;
			case 2:
				System.out.println( "Excellent");
				break;
			case 3:
				System.out.println("Nice work");
				break;
			case 4:
				System.out.println("Keep up the good work!");
				break;
			}
	}
	public static void displayWrongRemarks() {
			
			wrongAnswer = 1 + randomNumber.nextInt(4);
			
			switch (wrongAnswer) {
			
			case 1:
				System.out.println( "No. Please try again.");
				break;
			case 2:
				System.out.println( "Wrong. Try once more.");
				break;
			case 3:
				System.out.println("Don’t give up");
				break;
			case 4:
				System.out.println("No. Keep trying.");
				break;
			}
	}
		// method that picks the random number does the multiplication
	public static int multiply1() {
				
		number1 = 1 + randomNumber.nextInt(10);
		number2 = 1 + randomNumber.nextInt(10);
			
		int multiple = number1*number2; // multiply the two random numbers
		return multiple;
	}
	
	public static int multiply2(){
		
		number1 = 1 + randomNumber.nextInt(100);
		number2 = 1 + randomNumber.nextInt(100);
			
		int multiple = number1*number2; // multiply the two random numbers
		return multiple;
	}
}






