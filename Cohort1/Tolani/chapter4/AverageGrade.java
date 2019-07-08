import java.util.Scanner;

public class AverageGrade{
    public static void main(String [] args){

        int total = 0;
        int counter = 1;

        Scanner input = new Scanner(System.in);

        while(counter <= 10){
            
            System.out.println("Enter grade: ");
            int grade = input.nextInt();
            total = total + grade;

            counter++;
        }
        int average = total/10;
        System.out.print("Average is: " + average);
    }
}