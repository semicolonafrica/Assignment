package exercise10_17;

public class Building implements CarbonFootPrint {
	private double naturalGas;
	private final double factor =11.7;
	
	public double getNaturalGas() {
		return naturalGas;
	}
	
	public void setNaturalGas(double naturalGas) {
		this.naturalGas = naturalGas;
	}
	
	public double getFactor() {
		return factor;
	} 
	@Override
	public double getCarbonFootPrint() {
		return getNaturalGas()*getFactor();
	}
	public String toString() {
		return String.format("CarbonFootPrint use by Building is: %s%.2f %n%s%.2f %n%s%.2f ", "Natural Gas use:",getNaturalGas(), "Factor use:",getFactor(),"The number of carbon foot print use:",getCarbonFootPrint());
	}

}
