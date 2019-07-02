
package chapter3.exercise331;
/**
 * ComputerizationOfHealthRecordsTest
 */
import java.util.Scanner;
public class ComputerizationOfHealthRecordsTest {

    

public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    

    System.out.print("Input First Name: ");
    String firstname = input.nextLine();

    System.out.print("Input Last Name: ");
    String lastname = input.nextLine();

    System.out.print("Input Month of Birth: ");
    String month = input.nextLine();

    System.out.print("Input Day of Birth: ");
    int day = input.nextInt();

    System.out.print("Input Year of Birth: ");
    int year = input.nextInt();

    System.out.print("Input the weight(in Kilogram): ");
    int weight = input.nextInt();

    System.out.print("Input the height(in Meters): ");
    int height = input.nextInt();

    System.out.print("Gender: ");
    String gender1 = input.next();



    ComputerizationOfHealthRecords omoloso = new ComputerizationOfHealthRecords(firstname,lastname,month,year,day,height, weight,gender1);
    omoloso.setHeartRate(2019, year);
    omoloso.setGender(gender1);

    System.out.printf("%nPatient name: %s %s%nDate of birth: %s; gender: %s%n",omoloso.getFirstName(),omoloso.getLastName(),omoloso.getDOB(),omoloso.getGender());
    System.out.printf("Patient %s %s is %dyears old%n",omoloso.getFirstName(),omoloso.getLastName(),omoloso.age());
    System.out.printf("Patient %s %s date of birth is %s%n",omoloso.getFirstName(),omoloso.getLastName(),omoloso.getDOB());
    System.out.format("%n%n%s %s Patient Maximum heart rate is %d%nThe Target-heart-rate is %d",omoloso.getFirstName(),omoloso.getLastName(),omoloso.getHeartRate(),omoloso.getTargetRate(0.6));
    System.out.format("%nThe BMI value is: %s", omoloso.getValue());
    input.close();



}
}