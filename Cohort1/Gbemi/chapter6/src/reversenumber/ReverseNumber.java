package reversenumber;

public class ReverseNumber {
	
	public static void printReverse(int numb) {
		String store =" ";
		
		
		if(numb>=1&&numb<100000) {
			while(numb!=0) {
				int result=numb%10;
				store = store +"  " + result;
				numb/=10;
				System.out.print(result);
			}
	    }
	}
	
	public static void main(String[] args) {
		printReverse(63145);
	}
}
