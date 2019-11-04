package figure7;

import java.security.SecureRandom;

public class BarChat {
	
	
	public static void gradeDistribution() {
		
		int[] grade = {0,0,0,0,6,0,1,2,4,2,1};
		
		System.out.println("Grade Distribution");
		
		for(int i =0;i< grade.length;i++) {
			
			if(i == 10) {
				System.out.printf("%5d: ", 100);
				
			}
			else {
				System.out.printf("%02d -%02d: ", i *10, i * 10 + 9);
			}
			
			for(int j =0;j<grade[i];j++) {
				System.out.print("*");
			}
				System.out.println();
			
		}
	}
	
	
	public static void rollDice() {
		
		SecureRandom random = new SecureRandom();
		final int ARRAY_LENGTH = 6000000;
		int[] frequency = new int[7];
		for(int i =1;i<=ARRAY_LENGTH;i++) {
			++frequency[1 + random.nextInt(6)];
		}
		
		System.out.printf("%s%10s%n","Face","Frequency");
		
		for(int j =1;j<frequency.length;j++) {
			System.out.printf("%4d%10d%n", j,frequency[j]);
		}
		
		
	}
	
	public static void responses() {
		int[] response = {1,2,1,4,5,5,1,3,4,2,2,2,1,4,3,1,2,4,4,1};
		int[] frequency = new int[6];
		
		for(int i =0;i<response.length;i++) {
			++frequency[response[i]];
		}
		
		System.out.printf("%s%10s%n","Response","Frequency");
		
		for(int j = 1;j<frequency.length;j++) {
			System.out.printf("%4d%10d%n", j,frequency[j]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gradeDistribution();
		//rollDice();
		responses();
	}

}
