package chapter6.exercise610;

public class RoundingNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("Original value: %.5f%n", 5.456345);
		
		System.out.print("Integer ");
		RoundingNumber.roundToInteger();
		
		System.out.print("Tenth ");
		RoundingNumber.roundToTenths();

		System.out.print("\nHundredths ");
		RoundingNumber.roundToHundredths();

		System.out.print("\nThousandths ");
		RoundingNumber.roundToThousandths();

	}

}
