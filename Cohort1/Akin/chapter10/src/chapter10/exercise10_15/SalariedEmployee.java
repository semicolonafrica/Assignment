package chapter10.exercise10_15;

public class SalariedEmployee extends Employee {

	private double weeklySalary;
	
	//constructor
	public SalariedEmployee(String firstName, String lastName,
			String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
	if(weeklySalary < 0.0) {
		throw new IllegalArgumentException(
				"weekly salary must be >= 0.0");
	}
	this.weeklySalary = weeklySalary;
	
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		if(weeklySalary < 0.0) {
			throw new IllegalArgumentException(
					"weekly salary must be >= 0.0");
		}
		this.weeklySalary = weeklySalary;
	}
	
	//calculate earnings; implement interface Payable method that was 
	//abstract in superclass Employee
	@Override
	public double getPaymentAmount() {
		return getWeeklySalary();
	}
}
