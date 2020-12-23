package chapter5.exercise518;

public class ModifiedCompoundInterest {
	
	private int principal;
	private int year;
	private double rate;
	
	
	public ModifiedCompoundInterest(int principal, int year, double rate) {
	
		this.principal = principal;
		this.year = year;
		this.rate = rate;
	}
	public int getPrincipal() {
		return principal;
	}
	public void setPrincipal(int principal) {
		this.principal = principal;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public double calculateInterest() {
		System.out.printf("%s %5s%n","Year","Interest");
		double calcRate = 1.0;
		double amount = 0.0;
		int dollar = 0;
		int cent = 0;
		

//		System.out.println();
		for(double i = 1.0; i <= year; i++) {
			
			calcRate *= 1.0 + rate;
			
			amount = (principal*100) * calcRate;
			
			dollar = (int)amount / 100;
			cent = (int)amount % 100;
			
			System.out.printf("%d%5s%d.%dC%n",(int)i,"$",dollar,cent);
		}
		return amount;
	}
	
	
}
