package chapters;
import java.util.Scanner;
public class BinaryEquivalent {

	public int getBinary() {
		Scanner input = new Scanner(System.in);
		
		String binary = "";
		int count = 0;
		int temp = 0;
		System.out.print("Enter decimal to convert to binary: ");
		int decimal = input.nextInt();
		
		while(true) {
			if(decimal == 0) {
				
				break;
			}
			else {
				temp = decimal % 2;
				binary = temp + "" + binary;
				decimal = decimal / 2;
				count--;
			}
		}
		input.close();
		return (binary);
	}


}
