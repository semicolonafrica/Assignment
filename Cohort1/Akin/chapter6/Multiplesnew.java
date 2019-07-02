
/**
 * Multiples
 */
import java.util.Scanner;
public class Multiplesnew {

    public static boolean isMultiple() {
        Scanner input = new Scanner(System.in);
        boolean result = true;
        System.out.print("Input the number of times to loop: ");
        int number = input.nextInt();
        int first = 0;
        int second = 0;
        for(int i = 1; i <= number; i++){
            first = input.nextInt();
            second = input.nextInt();
            if(first % second == 0){
                result = true;
                System.out.println(result);
            }
            else{
                result = false;
                System.out.println(result);
            }
            
        }
        input.close();
        return result;

    }

    public static void main(String[] args) {
        
        boolean result = isMultiple();
        System.out.print(result);

    }
}