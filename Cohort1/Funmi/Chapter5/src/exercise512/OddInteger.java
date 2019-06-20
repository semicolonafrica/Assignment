package exercise512;

 public class OddInteger {
	 
	 public  int calculateOddNum() {
		 int store = 1;
		 for(int i = 1; i <= 15; i += 2) {
			 store *= i;
			 System.out.println(i);
			 
			 System.out.println();
		 }
		 return store;
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddInteger odd = new OddInteger();
		 
		System.out.println(odd.calculateOddNum());
		
		
	}

}
