package exercise417;

public class GasMileage {

	private int miles;
	private int gallons;
	private double totalMPG;
	
	
	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

	public int getGallons() {
		return gallons;
	}

	public void setGallons(int gallons) {
		this.gallons = gallons;
	}
	
	public double milesPG(int miles, int gallons) {
		double mPG = 0;
		mPG = (double) miles / gallons;
		totalMPG += mPG;
		return mPG;
	}

	public double getTotalMPG() {
		return totalMPG;
	}
}
