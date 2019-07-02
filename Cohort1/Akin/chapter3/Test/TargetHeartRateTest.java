 
public class TargetHeartRateTest{
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



        HeartRate omoloso = new HeartRate(firstname,lastname,month,year,day);
        omoloso.setHeartRate(2019, year);

        System.out.printf("%nPatient name: %s %s%nDate of birth: %s%n",omoloso.getFirstName(),omoloso.getLastName(),omoloso.getDOB());
        System.out.printf("Patient %s %s is %dyears old%n",omoloso.getFirstName(),omoloso.getLastName(),omoloso.age());
        System.out.printf("Patient %s %s date of birth is %s%n",omoloso.getFirstName(),omoloso.getLastName(),omoloso.getDOB());
        System.out.format("%n%n%s %sPatient Maximum heart rate is %d%nThe Target-heart-rate is 	%d",omoloso.getFirstName(),omoloso.getLastName(),omoloso.getHeartRate(),omoloso.getTargetRate(0.6));

        input.close();
	}
}
