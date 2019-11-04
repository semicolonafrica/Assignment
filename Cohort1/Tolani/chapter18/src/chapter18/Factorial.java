package chapter18;

import java.math.BigInteger;

public class Factorial {
	
	private static BigInteger TWO = BigInteger.valueOf(2);
	
	public static BigInteger factorial(BigInteger number) {
		if(number.compareTo(BigInteger.ONE )<= 0) {
			return BigInteger.ONE;
		}
		else {
			return number.multiply(factorial(number.subtract(BigInteger.ONE)));
		}
	}
	
	public static BigInteger fibonnacci(BigInteger number) {
		if(number.equals(BigInteger.ZERO) || number.equals(BigInteger.ONE)) {
			return number;
		}
		else {
			return fibonnacci(number.subtract(BigInteger.ONE)).add(fibonnacci(number.subtract(TWO)));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.printf("%n%s %25s","number","factorial");
		for(int i =0;i<=50;i++) {
			System.out.printf("%n%d! = %d",i ,factorial(BigInteger.valueOf(i)));
		}
	

	}

}
