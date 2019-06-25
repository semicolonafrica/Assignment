package exercise6_21;
import java.util.Scanner;
public class SeperatingDigit {
	Scanner input = new Scanner(System.in);
    public void isQuotient(){

        System.out.print("Enter number: ");
        int a = input.nextInt();

        System.out.print("Enter number ");
        int b = input.nextInt();

        int result = a/b;
        System.out.println(result + " is the quotient");
    }

    public void isRemainder(){
        
        System.out.print("Enter number: ");
        int a = input.nextInt();

        System.out.print("Enter number ");
        int b = input.nextInt();

        int result = a%b;
        System.out.println(result + " is the remainder");
    }

    public void displayDigits(){
        int value1 = 0;
        int value2 = 0;
        int value3 = 0;
        int value4 = 0;
        int remainder;

        System.out.print("Enter number from the range of 1 and 99999: ");
        int num = input.nextInt();
        if(num < 10)
            remainder = num;
            
        if(num > 9 && num > 100){
            value1 = num / 10;
            value2 = num % 10;
        }
        if(num > 99 && num < 1000){
            value1 = num / 100;
            remainder = num % 100;
            value2 = remainder / 10;
            value3 = remainder % 10;
        }
        if(num > 999 && num < 10000){
            value1 = num / 1000;
            remainder = num % 1000;
            value2 = remainder / 100;
            remainder = remainder % 100;
            value3 = remainder / 10; 
            value4 = remainder % 10;       
        }
         System.out.print(value1 + " " + value2 + " " + value3 + " " + value4);

    }
}
