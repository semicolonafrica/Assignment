/**
 * 
 */
package chapter7;

/**
 * @author User
 *
 */
public class ProductOfSeries {
	public static int getProduct(int...numbers) {
		int result=1;
		for(int product:numbers)
			result= result*product;
		return result;
	}
	
	public static void main(String[] args) {

		System.out.println(getProduct(5,3,8,9));
		System.out.println(getProduct(3,5,10));
	}

}
