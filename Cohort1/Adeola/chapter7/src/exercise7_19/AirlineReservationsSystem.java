package exercise7_19;
import java.util.Scanner;

public class AirlineReservationsSystem {
	static Scanner input = new Scanner(System.in); 
	public static boolean scanSeats(boolean[] array, int num) {
		boolean result = false;
		for(int i=0; i<array.length;i++) {
			if(array[num] == false ) {
				result = false;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int a;
		int b=0;
		boolean[] seats = new boolean[10];
		for(int i =0; i < seats.length; i++) {
			System.out.println("enter 1 to book firstclass or 2 for economy");
			a = input.nextInt();
			if(a==1) {
				if(!(scanSeats(seats,i))) {
					seats[i]=true;
				}
			}
			else if(a==2) {
				if(!(scanSeats(seats,5+b))) {
					seats[5+b]=true;
					b++;
				}
			}
			else {
				System.out.println("wrong input");
				i-=1;
			}
		}
		for(int i = 1; i <= seats.length;i++) {
			System.out.printf("%7s", seats[i-1]);
			if(i%4==0)
				System.out.println();
		}
	}

}
