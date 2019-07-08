    import java.util.Scanner;
    public class EpsilonX{
        
        public static double getEpsilonX(){

            Scanner input = new Scanner(System.in);

            System.out.print("Enter the number to loop: ");
            double x = input.nextDouble();

            System.out.print("Enter the terms of the EpsilonX: ");
            int num = input.nextInt();
            double v = 1.0;
            double store = 0.0;
            for(int i = 0; i <= num; i++){
                if(i == 0){
                    store = 1;
                }
                else{
                    v *= x; 
                store += v / i;
                }

            }
            return store;

        }

    public static void main(String[] args){
        System.out.print(EpsilonX.getEpsilonX());
    }

    }