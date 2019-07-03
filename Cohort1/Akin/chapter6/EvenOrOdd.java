
/**
 * EvenOrOdd
 */
    import java.util.Scanner; 
public class EvenOrOdd {



    public static boolean isEven() {
        Scanner input = new Scanner(System.in);
        boolean result = true;

        System.out.println("Enter the number of times to loop: ");
        int total = input.nextInt();
        int number = 0;
        for(int i = 1; i <= total; i++){

            System.out.print("Input the number you are checking: ");
            number = input.nextInt();

            if(number % 2 == 0) {
                result = true;
                System.out.println(result);
            }
            else {
                result = false;
                System.out.print(result);
            }
        }
        input.close();
        return result;

    }

    public static void main(String[] args) {
        boolean result = isEven();

        System.out.print(result);
    }
}