
package exercise5_31;


import java.util.Scanner;
public class GlobalWarming {
		public void setQuestion() {
			
			Scanner input= new Scanner (System.in);
			int question;
			int answer=0;
			int value=0;
			
			for(question=0;question<=5;question++) {
			
			switch(question) {
			case 1:
				System.out.print("QUESTION1: \n choose the correct option\n");
				System.out.println("what role can business play in curbing climate change");
				System.out.println("Options :\n 1.  Designing product with fewer materials"
						+ "\n 2.  Desigining more product with more materials"
						+ "\n 3.  Dore packaging of their materials");
				
				value=input.nextInt();
				if(value==1) {
					answer+=1;
				}
				else {
					answer = 0;
				}
				break;
			case 2:
				System.out.print("QUESTION2: \n choose the correct option\n");
				System.out.println("what role can government play in addressing climate change");
				System.out.println("Options :\n 1.  By increasing investment in public transportation"
						+ "\n 2.  by reducing numbers of factories in d country"
						+ "\n 3.  Dore packaging of their materials");
				
				value=input.nextInt();
				if(value==3) {
					answer+=1;
				}
				else {
					answer=2;
				}
				break;
			case 3:
				System.out.print("QUESTION3: \n choose the correct option\n");
				System.out.println("what is your name");
				System.out.println("Options :\n 1.  Nimat"
						+ "\n 2.  Imran"
						+ "\n 3.  Gbemisola");
				
				value=input.nextInt();
				if(value==2) {
					answer+=1;
				}
				else {
					answer=answer;
				}
				break;
			case 4:
				System.out.print("QUESTION4: \n choose the correct option\n");
				System.out.println("what is your name");
				System.out.println("Options :\n 1.  Nimat"
						+ "\n 2.  Imran"
						+ "\n 3.  Gbemisola");
				
				value=input.nextInt();
				if(value==1) {
					answer+=1;
				}
				else {
					answer=answer;
				}
				break;
			case 5:
				System.out.print("QUESTION5: \n choose the correct option\n");
				System.out.println("what is your name");
				System.out.println("Options :\n 1.  Nimat"
						+ "\n 2.  Imran"
						+ "\n 3.  Gbemisola");
				
				value=input.nextInt();
				if(value==3) {
					answer+=1;
				}
				else {
					answer=answer;
				}
				break;
			}
			
		  }
			if(answer==5) {
				System.out.println("your score is:" +answer);
				System.out.println("excellent");
			}
			else if(answer==4) {
				System.out.println("your score is:" +answer);
				System.out.println("very Good");
			}
			else {
				System.out.println("your score is:" +answer);
				System.out.println("olodo");
			}
			input.close();
		}


}
