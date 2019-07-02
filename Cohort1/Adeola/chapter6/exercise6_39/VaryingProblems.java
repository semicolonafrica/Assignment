package exercise6_39;
import java.util.Scanner;
import java.security.SecureRandom;
public class VaryingProblems {
	static SecureRandom random = new SecureRandom();
	static Scanner input = new Scanner(System.in);
	
	static int diffultyLevel = 10;
	static int type = 0;
	static double correctCounter = 0;
	static double incorrectCounter = 0;
	
	public static void level() {
		System.out.println("enter level");
		int num = input.nextInt();
		int lev = num* 10;
		diffultyLevel = lev;
	}
	public static double percentCalculator() {
		double percent = (correctCounter/(correctCounter+incorrectCounter)) *100;
		return percent;
	}
	public static String response(int response) {
		String remark = "";
		if (response<=4) {
			switch(response) {
			case 1:
				remark = " Very good! ";
				break;
			case 2:
				remark = " Excellent! ";
				break;
			case 3:
				remark = " Nice work! ";
				break;
			case 4:
				remark = " Keep up the good work! ";
				break;
			}
		}
		if(response >4) {
			switch(response) {
			case 5:
				remark = " No! please try again ";
				break;
			case 6:
				remark = " Wrong. Try once more";
				break;
			case 7:
				remark = " Don't give up! ";
				break;
			case 8:
				remark = " No. Keep trying! ";
				break;
			}
		}
		return remark;
	}
	public static int returnAnswer(int a,int b) {
		int answer =0;
		
		switch(type) {
		case 1:
			System.out.println("what is the product of "+ a +" + " + b);
			answer = a+b;
			break;
		case 2:
			System.out.println("what is the answer of "+ a +" - " + b);
			answer = a-b;
			break;
		case 3:
			System.out.println("what is the product of "+ a +" x " + b);
			answer = a*b;
			break;
		case 4:
			System.out.println("what is the answer of "+ a +" / " + b);
			answer = a/b;
			break;
		}
		return answer;
	}
	public static void generateQuiz(int type) {
		int a =1 + random.nextInt(diffultyLevel);
		int b =1 + random.nextInt(diffultyLevel);
		int answer = returnAnswer(a,b);
		int response = 1;
		while(answer != response) {
			int c =1 + random.nextInt(4);
			int d =5 + random.nextInt(4);
			System.out.print("please enter your answer: ");
			response = input.nextInt();
			if(response == answer) {
				System.out.println(response(c));
				correctCounter++;
				break;
			}
			else {
				System.out.println(response(d));
				incorrectCounter++;
				break;
			}
		}
	} 
	
	public  static void monitor() {
		level();
		System.out.println("enter (1) for addition, (2) for subtraction, (3) for multiplication and (4) for division");
		type = input.nextInt();
		for(int i=1; i<=5; i++) {
			generateQuiz(type);
		}
		System.out.println("you scored "+percentCalculator()+"% in total");
		if(percentCalculator()>=75) {
			System.out.println("Congratulations, you are ready to go to the next level!");
		}
		else {
			System.out.println("Please ask your teacher for extra help");
		}
	}


	public static void main(String[] args) {
		monitor();
	}

}
