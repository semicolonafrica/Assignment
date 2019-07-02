
    public class OddIntegerBtwn1and99 {

        public static void main(String[] args) {

            System.out.println("Odd number between 1 and 100:");

            int sum = 0;
            int sum1 = 0;

            for(int i = 1; i < 100; i+= 2){
                sum += i;
                System.out.printf("\t%d%n", i);
            }
            System.out.println("The sum of odd numbers between 1 and 99 is: " + sum);

            for(int j = 0; j < 100; j+=2) {
                sum1 += j;
                System.out.printf("\t%d%n",j);
            }
            System.out.printf("Even numbers between 1 and 100: %d%n", sum1);
            System.out.print(Math.pow(2.5, 3));
        }
    }