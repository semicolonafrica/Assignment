/**
 * 
 */
package exercise5_21;

/**
 * @author ken_granero
 *
 */
public class Pythagorian {
	
	public void checkPythagorian() {
		System.out.printf("%s%10s%10s%n%n","Side A", "Side B", "Hypothenus");
		
		int a = 0;
		int b = 0;
		int hypo = 0;
		int side1, side2;
		for(a = 1; a <= 500; a++) {
				side1 = a * a;
			for(b = 1; b <= 500; b++) {
				side2 = b * b;
				for(int hyp =1; hyp <= 50; hyp++) {
					hypo = hyp * hyp;
					
					if(side1 + side2 == hypo) {
						System.out.println(a+"       "+b+"       "+hyp);
					}
						
				}
			}
		}
		
	}
}
