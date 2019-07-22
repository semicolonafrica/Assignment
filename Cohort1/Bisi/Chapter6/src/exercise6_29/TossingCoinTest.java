package exercise6_29;
import java.util.Scanner;

public class TossingCoinTest {	
	public static Scanner input = new Scanner (System.in);
	
	private static TossingCoin coin = new TossingCoin();
	
	public static void main(String[] args) {
		
		boolean quit = false;
        int choice = 0;
        
        printInstruction();
		while (!quit) {
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();
            
            switch(choice){
            case 0:
            printInstruction();
            break;
            case 1:
            TossingCoin.flip();
            break;
            case 2:
            System.out.println("You exit the game");
            quit = true;
            break;
		}
	}
	}
	 public static void printInstruction(){
	        System.out.println("\nPress");
	        System.out.println("\t 0 - To print game options.");
	        System.out.println("\t 1 - To flip coin.");
	        System.out.println("\t 2 - To exit.");
	 }
	 

}
