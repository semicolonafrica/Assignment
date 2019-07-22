package exercise7_20;
import java.security.SecureRandom;;
public class TotalSales {

	public static void main(String[] args) {
		SecureRandom random = new SecureRandom();
		int total1 = 0;
		int total2 = 0;
		int [][] array = new int [5][4];
		
		for(int p = 0; p < array.length; p++) {
			for(int sp = 0; sp < array[p].length; sp++) {
				array[p][sp] = random.nextInt(50);
			}
		}
//			System.out.print("Sp1 Sp2 Sp3 Sp4");
//			System.out.println("\nP1 \nP2 \nP3 \nP4 \nP5");
		for(int p = 0; p < array.length; p++) {
			for(int sp = 0; sp < array[p].length; sp++) {
				System.out.print(array[p][sp] + "\t");
				total1 += array[p][sp];
			}
			System.out.println("\t" + total1);
			total1 = 0;		
		}
		int sp = 0;
		for(int p = 0; p < array.length; p++) {
			total2 += array[p][sp];
			if(p == array[sp].length) {
				System.out.print(" ");
				System.out.print(" " + total2 + "     ");
				total2 = 0;
					sp++;
					p = 0;
			}
			if(sp == array[p].length) {
				break;
			}
		}
	}
}
