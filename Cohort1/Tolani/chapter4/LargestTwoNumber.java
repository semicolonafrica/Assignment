import java.util.Scanner;

public class LargestTwoNumber{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        int number;
        int largestNumber = 0;
        int largerNumber = 0;
        int counter = 1;


        while(counter <=10){
            System.out.println("Enter number: ");
            number = input.nextInt();
            if(number > largerNumber){
                largestNumber = largerNumber;
                largerNumber = number;
            }else{
                if(number > largestNumber){
                    number = largestNumber;
                }
            }
            counter++; 
        }
        System.out.println("The two largestNumber numbers are: " + largestNumber + " and "  + largerNumber);
        
        
        input.close();
    }
}