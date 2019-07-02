/**
 * 
 */
package chapter5.exercise5_31;

import java.util.Scanner;

/**
 * @author USER
 *
 */
public class Quiz {
	
	public void getAnswer() {
		
		int answer = 0;
		int response = 0;
		int counter = 1;
		
		Scanner input = new Scanner(System.in);
		
		while(counter<=5) 
		{
			switch(counter) {
			
			case 1:
				System.out.println("What causes Global warming? "
						+ " \n1. Carbon dioxide 2. Oxygen 3. Water 4. Cold");
				
				answer = input.nextInt();
				if(answer == 1) {
					response=response+1;
				}
				break;
				
			case 2:
				System.out.println("What is Ocean acidification? "
						+ " \n 1. change in alkaline level of water "
						+ "\n 2. Oxygen in water 3. change in chemical composition of sea water"
						+ " 4. non of the above");
				
				answer = input.nextInt();
				if(answer == 3) {
					response=response+1;
				}
				break;
				
			case 3:
				System.out.println("What can we do to stop Global warming? "
						+ " \n1. Producing more companies 2. Using fewer CO2 emission"
						+ "\n 3. Burning bushes 4. all of the above");
				
				answer = input.nextInt();
				if(answer == 2) {
					response=response+1;
				}
				break;
				
			case 4:
				System.out.println("What are renewable source of energy? "
						+ " \n 1. Sunlight 2. Biomass 3. Water  4. All of the above");
				
				answer = input.nextInt();
				if(answer == 4) {
					response=response+1;
				}
				break;
				
			case 5:
				System.out.println("What is CO2? "
						+ " \n 1. Carbon oxide 2. Carbon dioxide 3. Carbon oxygen 2  4. Car Oil 2");
				
				answer = input.nextInt();
				if(answer == 4) {
					response=response+1;
				}
				break;
			
			}		
			counter++;
			
						
		}
		if(counter==5) {
			System.out.println("Excellent");
		}
		else if(counter==4) {
			System.out.println("Very good");
		}
		else if(counter <= 3) {
			System.out.println("Time to brush up on your knowledge of global warming");
		}
		
		
	
		
	}

}
