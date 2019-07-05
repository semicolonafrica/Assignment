package chapter5.exercise5_16;


public class BarChart {

	public static void displayAsterisks() {
		
//		int counter = 1;
//		
//		while(counter <= 5) {

//		System.out.println("enter number");
//		int number = randomNumbers.nextInt(30);
//		
//		
//		switch (number) {
//		
//		case 7:
//			System.out.println("*******");
//			break;
//		case 5:
//			System.out.println("*****");
//			break;
//		case 4:
//			System.out.println("****");
//			break;
//		case 6:
//			System.out.println("******");
//			break;
//		case 3:
//			System.out.println("***");	
//		}
//
//		System.out.println(number);
//		counter++;
		int j;
		for( j =1; j <= 10; j++) {
			
			System.out.println(j);
		
			if(j == 2)
				System.out.println("**");
			else if(j == 6)
				System.out.println("******");
			else if (j == 10)
				System.out.println("*********");
			else if (j == 4)
				System.out.println("****");
			
		
		}

}
}