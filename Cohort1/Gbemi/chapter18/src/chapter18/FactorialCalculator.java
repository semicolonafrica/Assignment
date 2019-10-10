package chapter18;

import java.math.BigInteger;

public class FactorialCalculator {
	public static BigInteger factorial(BigInteger number) {
		if(number.compareTo(BigInteger.ONE)<=0) {
			return BigInteger.ONE;
		}
		else {
			return number.multiply(factorial(number.subtract(BigInteger.ONE)));
		}
	}
	
	public static void main(String[] args) {
		for(int y=0;y<=50;y++)
		{
			BigInteger answer = factorial(BigInteger.valueOf(y));
			System.out.println(answer);
		}
	}

}
