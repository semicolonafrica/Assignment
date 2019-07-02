package chapter5.exercise518;

import java.util.Scanner;

public class GlobalWarming {

	private int question;
	private int answer;
	

	public int getQuestion() {
		return question;
	}

	public void setQuestion(int question) {
		this.question = question;
	}

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}
	
	public int getCorrectAnswer() {
		Scanner input = new Scanner(System.in);
		int count = 1;
		int value = 1;
		int question2 = 0;
		int correct = 0;

		while(count <= 2) {
			
			switch(question2) {
			
			case 1:
						System.out.printf("%n%n%s%n%n%s%n%s%n%s%n%s%n%n ","What is global warming?", "1. Global Warming is a Static process.",
						"2. It is the average global temperature since the industrial revolution",
						"3. Scientist expect the global temperature to use an additional 0.5-1.8degree celsuis!!!",
						"4. Increase in the global temperature by 1.8degrees celsuis since 1990.");
				
						System.out.print("Enter correct answer from the options above: ");
						value = input.nextInt();
				switch(value) {
				case 1: 
					System.out.print("Wrong!!!");
					break;
				
				case 2: 

					System.out.print("Correct");
					correct++;
					break;
				case 3:
					System.out.print("Wrong");
					break;
				case 4:
					System.out.print("Wrong!!!");
					break;
				}
			case 2:
						System.out.printf("%n%n%s%n%n%s%n%s%n%s%n%s%n%n ","What is the cause of global warming?",
								"1. Water","2. Rain","3.Toxic gases","4. EarthQuake");
						
						System.out.print("Enter correct answer from the options above: ");
						value = input.nextInt();
				switch(value) {
				case 1: 
					System.out.print("Wrong!!!");
					break;
				
				case 2: 

					System.out.print("Wrong");
					break;
				case 3:
					System.out.print("Correct");
					correct++;
					break;
				case 4:
					System.out.print("Wrong!!!");
					break;
				}
			case 3:
				
						System.out.printf("%n%n%s%n%n%s%n%s%n%s%n%s%n%n ","What are united nation doing to combat climate change?",
						"1. Instrumental in facilitating international negotiations on effort to combat climate change through UNFCCC",
						
						"2. They combat countries that aid global warming",
						"3. They visit nations that are not affected",
						"4. Propose laws that aids the isues");
			
						System.out.print("Enter correct answer from the options above: ");
						value = input.nextInt();
						
					switch(value) {
					case 1: 
						System.out.print("Correct");
						correct++;
						break;					
					case 2: 
						System.out.print("Wrong");
						break;
					case 3:
						System.out.print("Wrong");
						break;
					case 4:
						System.out.print("Wrong!!!");
						break;
					}
			
			case 4:
				
				System.out.printf("%n%n%s%n%n%s%n%s%n%s%n%s%n%n ",
						"How does climate change affect food supply?",
						"1. Storms reduction",
						"2. Lower level of carbon dioxide",
						"3. Decreased rainfall and warmer  temperatures.",
						"4. Real threat to worlds's growing population.");
					
					
						System.out.print("Enter correct answer from the options above: ");
						value = input.nextInt();
						
					switch(value) {
						case 1: 
							System.out.print("Wrong!!!");
							break;					
						case 2: 
							System.out.print("Wrong");
							break;
						case 3:
							System.out.print("Wrong");
							break;
						case 4:
							System.out.print("Correct");
							correct++;
							break;	
						}
					
			case 5:
				System.out.printf("%n%n%s%n%n%s%n%s%n%s%n%s%n%n ",
						"What is the United States doing to combat global warming?",
						"1. Transportation is the lowest source of carbon.",
						"2. Iron pollution standards regulation",
						"3. Increase in renewable energy use",
						"4. Increase carbon emission");
					
				System.out.print("Enter correct answer from the options above: ");
				value = input.nextInt();
				
				switch(value) {
				case 1: 
					System.out.print("Wrong!!!");
					break;					
				case 2: 
					System.out.print("Wrong");
					break;
				case 3:
					System.out.print("Correct");
					correct++;
					break;
				case 4:
					System.out.print("Wrong");
					break;	
				}
			}
			count++; question2++;
			if(count == 1) {
				break;
			}
		}
		System.out.println();
		if(correct == 5) {
			System.out.print("Excellent");
		}else if(correct == 4) {
			System.out.print("Very good!!!");
		}else {
			System.out.print("Time to brush up on your knowledge of global warming");
		}
		System.out.println();
			return correct;
	}
	
	
	
}
