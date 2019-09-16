package chapter10.exercise10_17;

public class Building implements CarbonFootprint{

	private String buildingStructure;
	private String buildingColor;
	private double totalAmount;
	private int heatingValue;
	private double density;
	private int globalWarmingPotential;
	private int factor;
	
	/**
	 * @param buildingStructure
	 * @param buildingColor
	 * @param totalAmount
	 * @param heatingValue
	 * @param density
	 * @param globalWarmingPotential
	 */
	public Building(String buildingStructure, String buildingColor, double totalAmount, int heatingValue,
			double density, int globalWarmingPotential, int factor) {
		this.buildingStructure = buildingStructure;
		this.buildingColor = buildingColor;
		this.totalAmount = totalAmount;
		this.heatingValue = heatingValue;
		this.density = density;
		this.globalWarmingPotential = globalWarmingPotential;
		this.factor = factor;
	}
	/**
	 * @return the buildingStructure
	 */
	public String getBuildingStructure() {
		return buildingStructure;
	}

	/**
	 * @param buildingStructure the buildingStructure to set
	 */
	public void setBuildingStructure(String buildingStructure) {
		this.buildingStructure = buildingStructure;
	}

	/**
	 * @return the buildingColor
	 */
	public String getBuildingColor() {
		return buildingColor;
	}

	/**
	 * @param buildingColor the buildingColor to set
	 */
	public void setBuildingColor(String buildingColor) {
		this.buildingColor = buildingColor;
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
		return String.format("%s: %s%n%s: %s%n%s: %,.2f%n","The building Structure",getBuildingStructure(),"The building color",getBuildingColor(), "The carbon footprint for Building", getCarbonFootprint());
	}
	
}
