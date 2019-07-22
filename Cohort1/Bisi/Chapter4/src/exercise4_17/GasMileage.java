package exercise4_17;

public class GasMileage {
	private int milesDriven;
	private int gallonUsed;
	
//public GasMileage(int milesDriven, int gallonUsed) {
//	this.milesDriven = milesDriven;
//	this.gallonUsed = gallonUsed;
//	}
	public int getMilesDriven() {
		return milesDriven;
	}
	public void setMilesDriven(int milesDriven) {
		this.milesDriven = milesDriven;
	}
	public int getGallonUsed() {
		return gallonUsed;
	}
	public void setGallonUsed(int gallonUsed) {
		this.gallonUsed = gallonUsed;
	}		
	public double getTrip(double trip) {
		trip = milesDriven * gallonUsed;
		return trip;
	}	
}

