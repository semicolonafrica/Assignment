package Chapter6.exercise6_23;

public class MinimumNumber {
	
	public static float calcMinimumNumber(float num1,float num2, float num3) {
		
		float minimumNumber = Math.min(num1,Math.min(num2,num3));
		return minimumNumber;
	}

}
