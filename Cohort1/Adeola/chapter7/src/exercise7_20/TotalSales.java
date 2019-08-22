package exercise7_20;
import java.security.SecureRandom;

public class TotalSales {

	public static void main(String[] args) {
		SecureRandom random = new SecureRandom();
		int total1 = 0;
		int total2 = 0;
		int[][] array= new int[5][4];
		
		for(int p = 0; p<array.length; p++) {
			for(int sp = 0; sp<array[p].length; sp++) {
				array[p][sp] =random.nextInt(100);
			}
		}
		for(int p = 0; p<array.length; p++) {
			for(int sp = 0; sp<array[p].length; sp++) {
					System.out.print(array[p][sp] + "   ");
					total1 +=array[p][sp];
			}
			System.out.print("total = "+ total1);
			System.out.println();
			total1=0;
		}
		int sp = 0;
		for(int p =0; p<array.length;p++) {
			
				total2 += array[p][sp];
				if(p==array[sp].length) {
					System.out.print(total2+ "  ");
					total2 = 0;
					sp++;
					p=0;
				}
				if(sp==array[p].length)
					break;
			}
	}

}
