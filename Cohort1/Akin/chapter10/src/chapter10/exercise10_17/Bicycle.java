package chapter10.exercise10_17;

public class Bicycle implements CarbonFootprint{

	private int productNumber;
	private String bicycle_name;
	private String bicycle_type;
	private double totalAmount;
	private int heatingValue;
	private double density;
	private int globalWarmingPotential;
	private int factor;
	
	/**
	 * @param productNumber
	 * @param bicycle_name
	 * @param bicycle_type
	 * @param totalAmount
	 * @param heatingValue
	 * @param density
	 * @param globalWarmingPotential
	 */
	public Bicycle(int productNumber, String bicycle_name, String bicycle_type, double totalAmount, int heatingValue,
			double density, int globalWarmingPotential, int factor) {
		this.productNumber = productNumber;
		this.bicycle_name = bicycle_name;
		this.bicycle_type = bicycle_type;
		this.totalAmount = totalAmount;
		this.heatingValue = heatingValue;
		this.density = density;
		this.globalWarmingPotential = globalWarmingPotential;
		this.factor = factor;
	}
	
	/**
	 * @return the productNumber
	 */
	public int getProductNumber() {
		return productNumber;
	}
	/**
	 * @param productNumber the productNumber to set
	 */
	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}
	/**
	 * @return the bicycle_name
	 */
	public String getBicycle_name() {
		return bicycle_name;
	}
	/**
	 * @param bicycle_name the bicycle_name to set
	 */
	public void setBicycle_name(String bicycle_name) {
		this.bicycle_name = bicycle_name;
	}
	/**
	 * @return the bicycle_type
	 */
	public String getBicycle_type() {
		return bicycle_type;
	}
	/**
	 * @param bicycle_type the bicycle_type to set
	 */
	public void setBicycle_type(String bicycle_type) {
		this.bicycle_type = bicycle_type;
	}
		
	/**
	 * @return the totalAmount
	 */
	public double getTotalAmount() {
		return totalAmount;
	}
	/**
	 * @param totalAmount the totalAmount to set
	 */
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	/**
	 * @return the heatingValue
	 */
	public int getHeatingValue() {
		return heatingValue;
	}
	/**
	 * @param heatingValue the heatingValue to set
	 */
	public void setHeatingValue(int heatingValue) {
		this.heatingValue = heatingValue;
	}
	/**
	 * @return the density
	 */
	public double getDensity() {
		return density;
	}
	/**
	 * @param density the density to set
	 */
	public void setDensity(double density) {
		this.density = density;
	}
	
	/**
	 * @return the globalWarmingPotential
	 */
	public int getGlobalWarmingPotential() {
		return globalWarmingPotential;
	}
	/**
	 * @param globalWarmingPotential the globalWarmingPotential to set
	 */
	public void setGlobalWarmingPotential(int globalWarmingPotential) {
		this.globalWarmingPotential = globalWarmingPotential;
	}
	
	/**
	 * @return the factor
	 */
	public int getFactor() {
		return factor;
	}

	/**
	 * @param factor the factor to set
	 */
	public void setFactor(int factor) {
		this.factor = factor;
	}

	@Override
	public double getCarbonFootprint() {
		
		double printType = getTotalAmount() * (getFactor() * getHeatingValue()) * getDensity() * getGlobalWarmingPotential();
		return printType;
	}

	public String toString() {
		return String.format("%s: %d%n%s: %s%n%s: %,.2f%n","The Bicycle Product Number" ,getProductNumber(),"Bicycle Name",getBicycle_name(),"The carbon footprint for Bicycle", getCarbonFootprint());
	}
}
