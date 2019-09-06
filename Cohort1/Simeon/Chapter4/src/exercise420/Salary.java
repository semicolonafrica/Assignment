package exercise420;

public class Salary {

	private final double overtime = 1.5;
	private final int maxHours = 40;
	
	private String name;
	private double hourlyRates;
	private int noOfHours;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setHourlyRates(double hourlyRates) {
		this.hourlyRates = hourlyRates;
	}
	
	public double getHourlyRates() {
		return hourlyRates;
	}
	
	public void setNoOFHours(int noOfHours) {
		this.noOfHours = noOfHours;
	}
	
	public int getNoOfHours() {
		return noOfHours;
	}
	
	public double getOvertime() {
		return overtime;
	}
	
	// calculate normal pay
	public double initPay() {
		double initPay;
		initPay = hourlyRates * noOfHours;
		
		return initPay;
	}
	
	// calculates hours after maximum working hours 
	public int overTimeHours() {
		int overTime;
		if (noOfHours > maxHours)
			overTime = noOfHours - maxHours;
		else
			overTime = 0;
		
		return overTime;
		
	}
	
	// calculate overtime pay
	public double overTimePay() {
		double overTimePay;
		overTimePay = overTimeHours() *(hourlyRates * overtime);
		
		return overTimePay;
	}
	
	// adds normal pay and overtime pay
	public double grossPay() {
		double grossPay;
		grossPay = initPay() + overTimePay();
		
		return grossPay;
	}
}
