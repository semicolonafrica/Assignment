/**
 * 
 */
package chapter5.exercise5_22;

/**
 * @author Emmanuel Akinbode
 *
 */
public class AstericksSides {
	public static void main(String[] args){
		
		int a = 1, b = 12, c = 10, d = 5;
		
		for(int counter = 1; counter <= 10; counter++) {
			
			for(int i = a; i > 0; i--) 
			{
				System.out.print("*");
			}
			for(int j = b; j > 0; j--) 
			{
				System.out.print(" ");
			}
			for(int k=c; k > 0; k--) 
			{
				System.out.print("*");
			}
			for(int l = d; l>0; l--) 
			{
				System.out.print(" ");
			}
			for(int m = c; m>0; m--) 
			{
				System.out.print("*");
			}
			for(int n = b; n>0; n--) 
			{
				System.out.print(" ");
			}
			for(int p = a; p>0; p--) 
			{
				System.out.print("*");
			}
			System.out.println();
			a+=1; b-=1; c-=1; d+=2;
		}
		
	}

}
