import java.util.Scanner;

public class LargestNumber{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        int number;
        int largestNumber = 0;
        int counter = 1;


        while(counter <=10){
            System.out.println("Enter number: ");
            number = input.nextInt();
            if(number > largestNumber){
                largestNumber = number;
        }
        counter++;
        }
        
            System.out.println("Largest Number is: " + largestNumber );
        
        input.close();
    }
}