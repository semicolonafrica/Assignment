package exercise5_20;
/**program to compute number of pie terms .
 * Author(s) Idris Wonuola and Nimot Imran Gbemisola  Date: 13/06/2019
 * */
import java.util.Scanner;
public class PieTerms {
	Scanner accept = new Scanner(System.in);
	
	public void findPieTerms() {
		System.out.print("Enter number of terms to compute: ");
		int number = accept.nextInt();
		
		double pie = 0.0;
		int counter;
		
		System.out.println("\t"+"number of term"+"\t"+"value");
		for(counter = 1; counter<=number; counter++) {
			if(counter == 1.0) {
				pie +=4.0;
			}
			else if(counter % 2.0==0) {
				pie -= 4.0/(counter+(counter-1));
			}
			else {
				pie += 4.0/(counter+(counter-1));
			}
			System.out.println("\t"+counter+"\t" +pie);
			
//			if(pie ==3.14159) {
//				System.out.println(counter);
//			}
//			else {
//				System.out.println("\t"+counter+"\t" +pie);
//			}
		}
		
	}
}
