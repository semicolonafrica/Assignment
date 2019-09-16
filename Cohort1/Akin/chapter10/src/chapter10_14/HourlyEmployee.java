package chapter10_14;

public class HourlyEmployee extends Employee {

	private double wage;
	private double hours;
	
	//constructor
	public HourlyEmployee(String firstName, String lastName,
			String socialSecurityNumber, double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber);
		
		if(wage < 0.0) {
			throw new IllegalArgumentException(
					"Hourly worked must be >= 0.0 and <= 168.0");
		}
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}
	
	@Override
	public double earnings()
	{
		if(getHours() <= 40) {
			return getWage() * getHours();
		}
		else {
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
		}
	}
	
	@Override
	public String toString() {
		return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
				super.toString(), "hourly wage", getWage(),
				"hours worked", getHours());
	}
	
	
}
