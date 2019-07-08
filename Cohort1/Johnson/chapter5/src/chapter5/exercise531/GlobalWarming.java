package chapter5.exercise531;

import java.util.Scanner;
public class GlobalWarming{
    public void globalWarm(){
        int score = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i<=5; i++){
            if (i==1){
                System.out.println("Question" + i + ": " + "What are some of the impacts of climate change ");
                System.out.println("1. hurricane  2. wildfires  3. heatwaves  4. all of the above: " );
                int answer1 = input.nextInt();
                if (answer1 == 4) {
                    System.out.println("Correct answer");
                    score +=1;
                }
                else{
                    System.out.println("Wrong answer" + "\nCorrect option: 4");
                    score = score;
                }
            }
            if (i==2){
                System.out.println("\nQuestion" + i + ": " + "Which country contribute the most to global warming ");
                System.out.println("1. Japan  2. USA  3. China  4. Russia" + "\n");
                int answer2 = input.nextInt(); 
                if (answer2 == 2) {
                    System.out.println( "Correct answer");
                    score +=1;
                }
                else{
                    System.out.println(  "Wrong answer" + "\nCorrect option: 2");
                    score = score;
                } 
            }
            if (i==3){
                System.out.println("\nQuestion" + i + ": " + "Our atmosphere is made up of the following except ");
                System.out.println("1. Oxygen  1. Carbondioxide  3. Sulphur  4. Nitrogen" + "\n");
                int answer3 = input.nextInt(); 
                if (answer3 == 3 ){
                    System.out.println( "Correct answer");
                    score +=1;
                }
                else{
                    System.out.println(  "Wrong answer" + "\nCorrect option: 3");
                    score = score;
                }
            }
            if (i==4){
                System.out.println("\nQuestion" + i + ": " + "How do we stop global warming? ");
                System.out.println("1. Reducing emission of CO2\n" +  "2. by burning of oil\n"  + "3. By cutting down forests\n" + "4. None of the above" + "\n");
                int answer4 = input.nextInt(); 
                if (answer4 == 1){
                    System.out.println( "Correct answer");
                    score +=1;
                }
                else{
                    System.out.println(  "Wrong answer" + "\nCorrect option: 1");
                    score = score;
                }
            }
            if (i == 5){
                System.out.println("\nQuestion" + i + ": " + " The following are examples of renewable energy source except ..... ");
                System.out.println("1.biomass  " + "\n2. coal"  + "\n3. geothermal" + "\n4. sun " + "\n");
                int answer5 = input.nextInt(); 
                if (answer5 == 2){
                    System.out.println( "Correct answer");
                    score +=1;
                }
                else{
                    System.out.println(  "Wrong answer" + "\nCorrect option: 2");
                    score = score;
                }
            }
        }
        System.out.println( score ==5 ? "Your score is: " + score + "/5\n" + "Excellent"  : "");
        System.out.println( score == 4 ? "Your score is: " + score + "/5\n" + "Very good"  : "");
        System.out.println( (score <=3) ? "Your score is: " + score + "/5\n" + "Time to brush up on your knowledge of global warming"  : "");
        //System.out.println( (score ==3)||(score ==2)||(score ==1)||(score ==0) ? "Your score is: " + score + "/5\n" + "Time to brush up on your knowledge of global warming"  : "");
        
    }


}
