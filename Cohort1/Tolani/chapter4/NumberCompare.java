//Program counts 10 integer inputs and prints the laargest number
//@Oluwatobi 
import java.util.Scanner;
    public class NumberCompare {
        public static void main(String[] args)
        {
            //initialization
            int counter = 0;
            int number;
            int largest = 0; //Store the largest integer input

            //Process phase
        Scanner rec = new Scanner(System.in); 
        
        while(counter < 10)
        {
            System.out.println("Enter number: ");
            number = rec.nextInt(); //Recieve integer input

            if(number > largest)
            {
                largest = number;
            }
            counter++;
        }
        rec.close();
            System.out.printf("%d is the largest number", largest);
        }
    }