package calculator;

public class CreditLimitCalTest {

	public static void main(String[] args) {
		
		CreditLimitCalculator customer1 = new CreditLimitCalculator(0, 9 , 8, 9, 4, 7);
		
				
//		System.out.println(customer1.newBalance());
		System.out.println(customer1.checkNewBalance());

	}

}
