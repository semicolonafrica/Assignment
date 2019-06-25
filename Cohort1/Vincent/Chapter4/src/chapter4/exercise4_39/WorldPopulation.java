package chapter4.exercise4_39;
import java.util.Scanner;
public class WorldPopulation {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter population");
		double population = input.nextInt();
		int increase = 0;
		
		System.out.println( "Year:\t  Yearly population\t   \tnumerical increase" );
		
		
		for( int year =1; year <= 75; year +=1) {
		
			
			population = Math.floor(population * 2);
			
			increase = (int) (population / 2);
			
			
			if(increase == 2097152000) {
				System.out.println("the break point");
			}
					
					System.out.printf( "%d\t%2f\t\t  \t%d\t\n", year, population, increase );
		}
		
		input.close();
		}
}

