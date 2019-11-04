package exercise9_14;

public class HourlyWageEmployee extends Employee {
	
	private double hours;
	
	private double wage;
	

	
	public HourlyWageEmployee(String firstName, String lastName, String socialSecurityNumber,double hours,double wage) {
		super(firstName, lastName, socialSecurityNumber);
		if(wage < 0.0) {
			throw new IllegalArgumentException("Gross sales is greater than zero");
		}
		
		if(hours < 0.0 || hours >= 168) {
			throw new IllegalArgumentException("Commission rate must be greater than 0 and less than 1.0");
		}
		
		this.wage = wage;
		this.hours = hours;
		
	}


	public double getHours() {
		return hours;
	}



	public void setHours(double hours) {
		if(hours < 0.0 || hours > 168) {
			throw new IllegalArgumentException("Commission rate must be greater than 0 and less than 1.0");
		}
		this.hours = hours;
	}



	public double getWage() {
		return wage;
	}



	public void setWage(double wage) {
		if(wage < 0.0) {
			throw new IllegalArgumentException("Gross sales is greater than zero");
		}
		
		this.wage = wage;
	}
	
	public double earnings() {
		
		 double earning = 0.0;
		 
		 if(hours <= 40) {
			 earning = this.hours * this.wage;
		 }
		 
		 if(hours > 40) {
			 earning = 1.5 * (this.hours * this.wage);
		 }
		 System.out.println(earning);
		 return earning;
	}

	@Override
	public String toString() {
		return String.format("%s %s%n%s: %.2f", "hourly-wage",
				super.toString(), "Hourly wage earning", earnings());
	}
	
}
