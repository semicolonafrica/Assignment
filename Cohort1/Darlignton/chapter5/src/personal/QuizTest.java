package personal;
import java.util.Scanner;

public class QuizTest {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int counter = 0;
		String question1 = "How are you";
		String question2 = "what is your name";
		String question3 = "who are you";
		String question4 = "where are you";
		String question5 = "where is it"; 
		int answer1 = 1 ;
		int answer2 = 3;
		int answer3 = 2;
		int answer4 = 5;
		int answer5 = 4;
		int answer;
		
		for(int i  = 1; i <=5; i++ ) {
			switch(i) {
			case 1:
				System.out.println(question1);
				System.out.println("1. fine");
				System.out.println("2. good");
				System.out.println("3. i'm good");
				System.out.println("4. i'm ok");
				System.out.print("Select 1-5");
				answer = input.nextInt();
				if(answer == answer1) {
					counter++;
				}
				break;
			case 2:
				System.out.println(question2);
				System.out.println("1. fine");
				System.out.println("2. good");
				System.out.println("3. i'm good");
				System.out.println("4. i'm ok");
				System.out.print("Select 1-5");
				answer = input.nextInt();
				if(answer == answer2) {
					counter++;
				}
				break;
			case 3:
				System.out.println(question3);
				System.out.println("1. fine");
				System.out.println("2. good");
				System.out.println("3. i'm good");
				System.out.println("4. i'm ok");
				System.out.print("Select 1-5");
				answer = input.nextInt();
				if(answer == answer3) {
					counter++;
				}
				break;
			case 4:
				System.out.println(question4);
				System.out.println("1. fine");
				System.out.println("2. good");
				System.out.println("3. i'm good");
				System.out.println("4. i'm ok");
				System.out.print("Select 1-5");
				answer = input.nextInt();
				if(answer == answer4) {
					counter++;
				}
				break;
			case 5:
				System.out.println(question5);
				System.out.println("1. fine");
				System.out.println("2. good");
				System.out.println("3. i'm good");
				System.out.println("4. i'm ok");
				System.out.print("Select 1-5");
				answer = input.nextInt();
				if(answer == answer5) {
					counter++;
				}
				break;
				
			}
		}
		if(counter == 5) {
			System.out.println("Excellent");
		}
		else if(counter == 4) {
			System.out.println("Very Good");
		}
		else {
			System.out.println("Time to brush up your knowledge of global warming.");
			System.out.println("http://www.google.com");
		}
	}

}
