/**
 * 
 */
package chapter4.exercise4_36;

/**
 * @author USER
 *
 */
public class Triangle {
	
	public boolean checkSides(int num1, int num2, int num3){
		 
		if(num1 + num2 > num3 && num2 + num3 > num1 && num1 + num3 > num2)
		{
			return true;
//		}
//		 if(num2 + num3 > num1) 
//			{
//				return true;
//			}
//		if(num1 + num3 > num2) 
//			{
//				return true;
			}
		else {
				return false;
			}
	}

}
