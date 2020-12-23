package exercise6_28;
import java.util.Scanner;
public class StudentAverage {
	static Scanner input = new Scanner(System.in);
	public static int  qualityPoints() {
		System.out.println("enter score: ");
		int grade=input.nextInt();
		if((grade>=90)&&(grade<=100)) {
			return 4;
		}
		else if((grade>=80)&&(grade<=89)) {
			return 3;
		}
		else if((grade>=70)&&(grade<=79)) {
			return 2;
		}
		else if((grade>=60)&&(grade<=69)) {
			return 1;
		}
		else {
			return 0;
		}				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(qualityPoints());

	}

}
