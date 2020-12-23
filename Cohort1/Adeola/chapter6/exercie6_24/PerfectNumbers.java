package exercie6_24;

public class PerfectNumbers {
	public static boolean isPerfect(int number) {
		int total=1;
		boolean result;
		for(int i=2; i<=number/2; i++) {
			if(number%i==0) {
				System.out.print(i+" ");
				total +=i;
			}
			else {
				continue;
			}
		}
		if(total == number) {
			result = true;
		}
		else {
			result = false;
		}
		return result;
	}
	public static void displayPerfect(int num) {
		for (int i =1; i<=num; i++ ) {
			if(isPerfect(i)==true) {
				System.out.print(i + " ");
				System.out.println();
			}
			else {
				continue;
			}
		}
//		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		isPerfect(496);
		displayPerfect(1000);
	}

}
