package exercise8_11;

public class Complex {

	private double []array1 = new double[2];
	private double [] array2 = new double[2];
	
	private static double[] defZ = {2.0,5.0}; //set default values of array1
	
	private static double[] defA= {3.0, 2.0}; //set default values of array2
	
	public Complex(double[] array1, double [] array2) {
		
		this.array1 = array1;
		this.array2 = array2;
	}
	
	public Complex() {
		
		this(defZ, defA);
		
	}
	
	public double[] getArray1() {
		return array1;
	}

	public void setArray1(double[] array1) {
		this.array1 = array1;
	}

	public double[] getArray2() {
		return array2;
	}

	public void setArray2(double[] array2) {
		this.array2 = array2;
	}
	
	public String addComplexNumbers() {
		
		double real = array1[0] + array2[0];
		double imaginary = array1[1] + array2[1];
		
		
		return String.format("%.2f, %.2f%s", real, imaginary,"i");
	}
	
		public String subtractComplexNumbers() {
		
		double real = array1[0] - array2[0];
		double imaginary = array1[1] - array2[1];
		
		
		return String.format("%.2f, %.2f%s", real, imaginary,"i");
	}

}
