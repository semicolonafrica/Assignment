package exercise3_16;

public class HeartRateTest {

	public static void main(String[] args) {
		
		HeartRates heartRate = new HeartRates("Olabisi","O", 4, 12,1988);

		System.out.print("Health Detail of patient : "+ heartRate.getFirstName() + "  " + heartRate.getLastName() 
		+"\n Date of Birth of patient : " + heartRate.getMonth() +"/" + heartRate.getDay() + "/" + heartRate.getYear() +"\n Patient age :"+ heartRate.getAge() 
				+"\n Patient Target HeartRate : "+ heartRate.getTargetHeartRate() +"\n Patient Maximum HeartRate : "+ heartRate.getMaximumHeartRate());

		

//		heartRate.getAge();
//		heartRate.getMaximumHeartRate();
//		heartRate.getTargetHeartRate();
		
//		System.out.println("Please enter the name:");
//		 String theName = input.nextLine(); // read a line of text
//		 myAccount.setName(theName); // put theName in myAccount
//		 System.out.println(); // outputs a blank line
//		
//		 // display the name stored in object myAccount
//		 System.out.printf("Name in object myAccount is:%n%s%n",
//		 myAccount.getName());
//		 }
	}

}
