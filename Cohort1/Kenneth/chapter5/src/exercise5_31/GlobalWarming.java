package exercise5_31;


import java.util.Scanner;

public class GlobalWarming {
	
	public void setQuiz() {
		
		Scanner insert = new Scanner(System.in);
		
	
		int counter = 1;
		int answer;
		int total = 0;
		
		while(counter <= 5) {
			
			switch(counter) {
			
			case 1:
				System.out.println("A - What is the hottest country in the world?\n" 
						+"1) Libya\n2) Botswana\n3) United Arab Emirates\n4) Vietnam");
				System.out.print("Enter answer: ");
				answer = insert.nextInt();
				if(answer == 1) {
					System.out.println("Correctamundo");
				total+=1;
				}
				System.out.println();
				break;
				
			case 2:
				System.out.println("B - What is global warming?\n" 
						+"1) The rate which the sun shines on earth\n2) It is a phenomenom of climate change"
						+ "characterized by a general increase in temperature of the earth"
						+ "\n3) Anywhere that is warm\n4) When you keep burning down the forest");
				System.out.print("Enter answer: ");
				answer = insert.nextInt();
				if(answer == 2) {
					System.out.println("Correctamundo");
				total+=1;
				}
				System.out.println();
				break;
				
			case 3:
				System.out.println("C - Mention one of the ways that we cannot stop global warming?\n" 
						+"1) Renewable energies\n2) Sustainable infrastructures\n3"
						+ ") Sustainable transportation\n4) Deforestation");
				System.out.print("Enter answer: ");
				answer = insert.nextInt();
				if(answer == 4) {
					System.out.println("Correctamundo");
				total+=1;
				}
				System.out.println();
				break;
				
			case 4:
				System.out.println("D - Causes of global warming does not include?\n" 
						+"1) Intensive farming\n2) Fossil fuels\n3) Mining\n4) Responsible consumption and recycling");
				System.out.print("Enter answer: ");
				answer = insert.nextInt();
				if(answer == 4) {
					System.out.println("Correctamundo");
				total+=1;
				}
				System.out.println();
				break;
				
			case 5:
				System.out.println("A) Which city was the highest temperature recorded?\n" 
						+"1) Lagos\n2) Sydney\n3) California\n4) Dublin");
				System.out.print("Enter answer: ");
				answer = insert.nextInt();
				if(answer == 1) {
					System.out.println("Correctamundo");
				total+=1;
				}
				System.out.println();
				break;
				
			default:
				
				break;
			
			}
			counter++;
		}
		System.out.println("Your score is: "+ total);
		if (total == 5) {
			System.out.println("Excellent!");
		}
		if(total == 4) {
			System.out.println("Very good!");
		}
		if (total <= 3) {
			System.out.println("Time to brush up your knowledge on global warming!"
					+ "\nvisit wwww.solarimpulse.com\nvisit www.legit.ng");
		}
		insert.close();
	}
	

}
