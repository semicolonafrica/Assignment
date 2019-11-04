package exercise7_17;

import java.util.Scanner;

public class AirLine {
	
	Scanner insert = new Scanner(System.in);
	
	private Seat[][] seatFirstClass = new Seat[3][2];
	
	private Seat[][] seatSecondClass = new Seat[5][2];
	
	
	
	boolean[] seatStateFirstClass = new boolean[6];
	
	boolean[] seatStateEconomy = new boolean[10];
	
	
	public void assignSeat(int value) {
		
		if(value == 1) {
			for(int i = 0;i < seatFirstClass.length;i++) {
				
				for(int j=0;j< seatFirstClass[i].length;j++) {
					seatStateFirstClass[i] = true;
					System.out.println("Enter 1 for first class or 2 for economy:");
					value = insert.nextInt();
					if(value !=1) {
						break;
					}
					System.out.println(seatStateFirstClass[i]);
				}
			}
		}
		else if(value == 2) {
			for(int i = 0;i < seatSecondClass.length;i++) {
				
				for(int j=0;j< seatSecondClass[i].length;j++) {
					seatStateEconomy[i] = true;
					System.out.println("Enter 1 for first class or 2 for economy:");
					value = insert.nextInt();
				}
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		AirLine line2 = new AirLine();
		Scanner insert = new Scanner(System.in);
		int value = insert.nextInt();
		line2.assignSeat(value);
	}
	
	
}
