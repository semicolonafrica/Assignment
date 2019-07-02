package chapters;
	import java.util.Scanner;
public class Cryptography2 {

	public int decrypt() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number to decrypt: ");
		int encryptedValue = input.nextInt();
		
		 int value4 = encryptedValue % 10;
		 encryptedValue /= 10;
		 int value3 = encryptedValue % 10;
		 encryptedValue /= 10;
		 int value2 = encryptedValue % 10;
		 encryptedValue /= 10;
		 int value1 = encryptedValue % 10;
		 
		 String numberTo = value3 + "" + value4 +""+ value1 +""+ value2;
		System.out.print(numberTo);
		 int numberFrom = Integer.parseInt(numberTo);
		 
		 
		 String store = "";
			
			while(numberFrom != 0) {
				int digit =numberFrom % 10;
				digit -= 7;
				if(digit < 0) {
					digit += 10;
				}
				//digit = numberFrom % 10;
				store = digit + "" + store;
				
				numberFrom /= 10;
				//--count;
			}
			System.out.println();
		//System.out.print(store);
		 
		
		input.close();
		return store;
	}
}
