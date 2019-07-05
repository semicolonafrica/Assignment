package exercise5_12;

public class OddNumbers {
	public void calculateProduct() {
		int product = 1;
		
		System.out.println("\t odd"+"\tproduct" );
		for(int odd = 1; odd <= 15;odd +=2 ) {
			product *= odd;
			
			
			System.out.println("\t"+odd+"\t"+product );
		}
	}
}
