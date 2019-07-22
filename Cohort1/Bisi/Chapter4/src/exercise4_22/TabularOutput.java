package exercise4_22;

public class TabularOutput {
	
	public void printTable() {
		
		System.out.println("N \t10*N \t100*N \t1000*N");
		System.out.println();		
		int count = 1;
		
		while(count <= 5) {
			System.out.println(count*1+ "\t" + count*10+ "\t" +count*100+ "\t"+ count*1000);
			
			count++;
		}
	}
}
