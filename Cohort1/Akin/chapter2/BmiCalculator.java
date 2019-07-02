/**
 * BmiCalculator
 */
    import java.util.Scanner;
public class BmiCalculator {
        public static double weightInKilogram,bodyMassIndexCalculator;
        public static double heightInMeters;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weightInKilogram: ");
        weightInKilogram = input.nextDouble();

        System.out.print("Enter the heightInMeters: ");
        heightInMeters = input.nextDouble();

        bodyMassIndexCalculator = ((weightInKilogram) / (heightInMeters * heightInMeters));

        if(bodyMassIndexCalculator < 18.5) {
            System.out.printf("You are Underweight. Your BMI value is %.2f", bodyMassIndexCalculator);
        } else if(bodyMassIndexCalculator > 18.5 && bodyMassIndexCalculator < 24.9) {
            System.out.printf("You are Normal. Your BMI value is %.2f", bodyMassIndexCalculator);
        } else if(bodyMassIndexCalculator > 25 && bodyMassIndexCalculator < 29.9) {
            System.out.printf("You are Overweight. Your BMI value is %.2f", bodyMassIndexCalculator);
        } else {
            System.out.printf("You are Obese. Your BMI value is %.2f", bodyMassIndexCalculator);

        }


        input.close();
    }
}