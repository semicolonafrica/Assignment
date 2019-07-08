package chapter6.exercise625;


public class PrimeNumbers {
	public boolean isPrime(int number) {
		int i;
		//int number = 7;
		//int counter;
		boolean flag = true;
		for (i=2; i<=number/2; i++) {
			if (number % i ==0) {
				//System.out.println("is not prime");
				flag = false;
				break;
				
			}
		}
		if (flag == true) {
			//System.out.println("is not prime");
			return flag = true;
		}
		else  //System.out.println("is  prime");
			return false;
		
	}
	
	public void displayPrimeNumbers() {
		boolean flag;
		int number = 10000;
		for (int i = 2; i < number; i ++) {
			int counter =1;
			flag = isPrime(i);
			if (flag == true) {
				System.out.println(i);
				
			}
			//counter++;
		}
	}

}
