package exercise8_11;

public class ComplexNumber {

	private double [] array1;
	private double [] array2;
	private double i=-1;
	public ComplexNumber(double[] array1,double[] array2) {
		this.array1=array1;
		this.array2=array2;
	}
	
	
	public ComplexNumber() {
		double [] array1= {0,0,};
		double[] array2= {0,0,};
		this.array1=array1;
		this.array2=array2;
	}
	
	public void addComplex() {
		double real=array1[0]+array2[0];
		double imaginary=array1[1]+array2[1];
		double [] complexSum={real,imaginary,i};
		System.out.println("the real number"+complexSum[0]);
		System.out.println("the imaginary number is"+complexSum[1]+"i");
	}
	
	public void subtractComplex() {
		double real=array1[0]-array2[0];
		double imaginary=array1[1]-array2[1];
		double [] complexSub={real,imaginary,i};
		System.out.println("the real number"+complexSub[0]);
		System.out.println("the imaginary number is"+complexSub[1]+"i");
		
		
	}
	
}
