 /**
  * Hypotenuse
  */
  import java.util.Scanner;
 public class Hypotenuse {
    
     public static double hypotenuse() {
        Scanner input = new Scanner(System.in);
        double side1 = 0.0, side2=0.0;
        
        double  hypo = 1.0;
        for(int i = 1; i <= 3; i++){
            side1 = input.nextDouble();
            side2 = input.nextDouble();

            hypo = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
            System.out.printf("%.2f  %.2f  %.2f%n",side1,side2,hypo);
        }
        input.close();
        return hypo;

     }

     public static void main(String[] args) {
        
        double result  = hypotenuse();
        System.out.print(result);
     }
 }