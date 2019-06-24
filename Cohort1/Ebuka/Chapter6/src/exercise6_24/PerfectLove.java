package exercise6_24;

// @author CHIMA CHUKWUEBUKA
	import java.util.Scanner;
	public class PerfectLove {

		public static boolean love(int digit) {
			
			String name; 
			int temp;
			
			int a = digit / 2, b = 0;
		    name = " ";
			
			for(int i = 1; i <= a; i++) {
				
				temp = digit % i;
				
				if(temp == 0) {
					b += i;
					name= name + i + ", ";
				}
			}
				if(b == digit) {
				System.out.print("" + name + "= " + b);
				}
				return true;
				
		}
		
		public static void pet() {
			
			for(int i = 1; i <= 1000; i++) {
					love(i);
			}
		}
		
		public static void main(String[] args) {
			Scanner love = new Scanner(System.in);
		}
	}