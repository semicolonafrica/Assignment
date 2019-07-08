package chapters;
	import java.util.Scanner;
public class DecimalEquivalent2 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in); 
		int n = 0;
		int decimal = 0;
		System.out.print("Enter the binary number: ");
		int binary = input.nextInt();
		while(true) {
			if(binary == 0) {
				break;
			} else {
				int modul = binary % 10;
				decimal += modul * Math.pow(2, n);
				binary /= 10;
				n++;
			}
		}
		System.out.printf("The decimal of the binary is: %d",decimal);
		input.close();

	}

}
