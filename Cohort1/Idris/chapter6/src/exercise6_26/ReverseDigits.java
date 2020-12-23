package exercise6_26;

public class ReverseDigits {
	public static String turn(int a) {
		String reverse =" ";
				int remainder = 0;
					while(a > 0){
			
			remainder= a % 10;
			reverse =reverse +""+ remainder;;
			a = a / 10;
		}
		return reverse;
	}

}
