/**
 * SeparateDigit1
 */
public class SeparateDigit1 {

    public static int getinteger(int a, int b){
         int integ = a / b;
        return integ;
        
    }

    public static int getRemainder(int a,int b){
        int remainder = a % b;
        return remainder;
    }

    public static String displayDigits(int number) {
        String store = "";
        int digit = 0;

        if(number >= 1 && number < 100000){
            while(number != 0){
            
            digit = getRemainder(number,10);   //number % 10; 

            store = digit + "  " + store;

            
            number = getinteger(number,10);

            }
        }
        else {
            System.out.print("number is out of range, try again!!!");
        }
                return store;
        }
}