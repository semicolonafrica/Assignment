package exercise10_17;

public class Car  implements CarbonFootPrint{
	private double totalMiles;
	private double totalGallons;
	private final double  carbonPercent =19.4;
	
	
	public double getTotalMiles() {
		return totalMiles;
	}
	public void setTotalMiles(double totalMiles) {
		this.totalMiles = totalMiles;
	}
	public double getTotalGallons() {
		return totalGallons;
	}
	public void setTotalGallons(double totalGallons) {
		this.totalGallons = totalGallons;
	}
	public double getCarbonPercent() {
		return carbonPercent;
	}
	
	public double getCarbonFootPrint() {
		return (totalMiles/totalGallons)*carbonPercent;
	}
	
	public String toString() {
		return String.format("CarbonFootPrint use by Car is:%s%.2f%n %s%.2f%n %s%.2f", "total miles drive:",getTotalMiles(),"total miles per gallon:",
				getTotalGallons(),"the carbon foot print use:",getCarbonFootPrint());
	}
	

}
