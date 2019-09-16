package chapter10_14;

import chapter10.exercise10_15.*;

public abstract class Employee implements Payable{

		private final String firstName;
		private final String lastName;
		private final String socialSecurityNumber;
		
		
		public Employee(String firstName, String lastName, String socialSecurityNumber) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.socialSecurityNumber = socialSecurityNumber;
		}
		public String getFirstName() {
			return firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public String getSocialSecurityNumber() {
			return socialSecurityNumber;
		}
		
		@Override
		public String toString() {
			return String.format("%s %s%nsocial security numnber: %s",
					getFirstName(),
					getLastName(),
					getSocialSecurityNumber());
		}
		
		//abstract method must be overriden by concrete subclasses
		public abstract double earnings();
		public double getPaymentAmount() {
			return earnings();
		}
}	//end abstract class Employee
