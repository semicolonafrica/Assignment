/**
 * OddorEven
 */
import java.util.Scanner;

public class OddorEven {
    public static int firstNum,secondNum;
    public static void main(String[] args) {
        Scanner value= new Scanner(System.in);

        System.out.print("Enter first Integer: ");
        firstNum = value.nextInt();

        System.out.print("Enter Second Integer: ");
        secondNum = value.nextInt();

        if(firstNum % 2 == 0 && secondNum % 2 == 0) {
            System.out.printf("Both %d and %d %s",firstNum,secondNum,"are Even Numbers!");
        }else if(firstNum % 2 == 0 && secondNum % 2 != 0) {
            System.out.printf("Only %d %s %d %s",firstNum,"is an even Number!",secondNum,"is an Odd Number!");
        } else if(firstNum % 2 != 0 && secondNum % 2 == 0){
            System.out.printf("Only %d %s %d %s",secondNum,"is an even Number",firstNum,"is an Odd Number!");
        } else{
            System.out.printf("%s %d and %d are both Odd Numbers!","Both ",firstNum,secondNum);
        }
        value.close();
    }
}