package exercise5_31;

import java.util.Scanner;

public class GlobalWarmingQuiz {
		
	public void getAnswer() {
			
		int answer = 0;
		int counter = 1;
		int result= 0;
		
	Scanner input = new Scanner(System.in);
			
	while(counter <= 5){
		
	switch(counter) {
		
		case 1:
			System.out.println("1. What causes Global warming? "
			+ " \ni. Carbonmonioxide \nii. Oxygen \niii. Water \niv. Cold");
			answer = input.nextInt();
				
			if(answer == 1) {
				System.out.println("True");
				result+=1;
				
				}else  {
					
						System.out.println("False");
						result=0;
						
				}			
				break;
					
			case 2:
				System.out.println("2. What is Ocean acidification? "
				+ " \ni. change in alkaline level of water \nii. Oxygen in water \niii. change in chemical composition of sea water\niv. non of the above");
				answer = input.nextInt();
				
				if(answer == 3) {
						System.out.println("True");
						result+=1;
					}else {
							System.out.println("False");
							result=1;
					}
					
				break;
			case 3:
				System.out.println("3. What can we do to stop Global warming?"
				+ " \ni. Producing more companies \nii. Using fewer CO2 emission \niii. Burning bushes \niv. all of the above");
				answer = input.nextInt();
			
				if(answer == 2) {
					System.out.println("True");
					result+=1;
				}else  {
						System.out.println("False");
						result=result;
				}
					
				break;
					
				case 4:
					System.out.println("4. What are renewable source of energy?"
					+ "\ni. Sunlight \nii. Biomass \niii. Water  \niv. All of the above");
					answer = input.nextInt();
					
				if(answer == 4) {
					System.out.println("True");
					result+=1;
				}else {
						System.out.println("False");
						result=result;
				}
					
				break;
					
				case 5:
					System.out.println("5. What is CO2? \n1. Carbon oxide \n2. Carbondioxide \n3. Carbon oxygen 2  \n4. Car Oil 2");
					answer = input.nextInt();
				
					if(answer == 2) {
						System.out.println("True");
						result+=1;
					}else  {
							System.out.println("False");
							result=result;
					}
					
					break;				
				}		
				counter++;
				}	
					System.out.println("You Scored : "+result);
				if(result == 5) {
					System.out.println("Excellent");
				}
				else if(result == 4) {
					System.out.println("Very good");
				}
				else if(result <= 3) {
					System.out.println("Time to brush up on your knowledge of global warming"+result);
				}
				
		}
	}
	
