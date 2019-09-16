package chapter10.exercise10_17;

public class Car implements CarbonFootprint{

	private String model;
	private String color;
	private String serialNumber;
	private double totalAmount;
	private int heatingValue;
	private double density;
	private int factor;
	private int globalWarmingPotential;
	
	/**
	 * @param model
	 * @param color
	 * @param serialNumber
	 * @param totalAmount
	 * @param heatingValue
	 * @param density
	 * @param globalWarmingPotential
	 */
	public Car(String model, String color, String serialNumber, double totalAmount, int heatingValue, double density,
			int globalWarmingPotential, int factor) {
		this.model = model;
		this.color = color;
		this.serialNumber = serialNumber;
		this.totalAmount = totalAmount;
		this.heatingValue = heatingValue;
		this.density = density;
		this.globalWarmingPotential = globalWarmingPotential;
		this.factor = factor;
	}
	
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the serialNumber
	 */
	public String getSerialNumber() {
		return serialNumber;
	}
	/**
	 * @param serialNumber the serialNumber to set
	 */
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
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
		return String.format("%s: %s%n%s: %s%n%s: %,.2f%n","The car model",getModel(),"Car Serial Number",getSerialNumber(), "The carbon footprint for Car", getCarbonFootprint());
	}
}
