package exercise3_17;
import java.util.Scanner;
public class HealthProfileTest {

	public static void main(String[] args) {
		HealthProfile details = new HealthProfile(null, null, null, 0, 0, 0, 0, 0);
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter First Name of patient: ");
		String firstName = in.nextLine();
		details.setFirstName(firstName);
				
		System.out.print("Enter Last Name of patient: ");
		String lastName = in.nextLine();
		details.setLastName(lastName);
		
		System.out.print("Enter Gender of patient: ");
		String gender = in.nextLine();
		details.setGender(gender);
		
		System.out.print("Enter Day of birth of patient: ");
		int day = in.nextInt();
		details.setDay(day);
		
		System.out.print("Enter Month of birth of patient: ");
		int month = in.nextInt();
		details.setMonth(month);
		
		System.out.print("Enter Year of birth of patient: ");
		int year = in.nextInt();
		details.setYear(year);
		
		System.out.print("Enter height of patient: ");
		int height = in.nextInt();
		details.setHeight(height);
		
		System.out.print("Enter weight of patient: ");
		int weight = in.nextInt();
		details.setWeight(weight);
		
		 System.out.println();
		 System.out.println("Patient's Name: "+ details.getFirstName() +" "+ details.getLastName() 
		 	+"\n D.O.B.: "+ details.getYear() +"/"+ details.getMonth() +"/"+ details.getDay()
				 +"\n Patient's Age: "+ details.getAge() +"\n Patient's Gender: "+ details.getGender() +"\n Height: "+ details.getHeight()+"\t Weight: "+ details.getWeight()
				 +"\nMaximum Heartrate: "+ details.getMaximumHeartRate() +"\nTarget Heartrate Range: "+ details.getTargetHeartRateRange() +"\nBodyMassIndex: "+ details.getBMI());
	}

}
