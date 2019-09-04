/**
 * 
 */
package chapter9Example;

/**
 * @author user
 *
 */
public class Duck extends Bird {

	private enum ENVIRONMENT {LAND, WATER, AIR}
	public void move() {
		if(ENVIRONMENT.WATER.name() == "WATER")
			System.out.println("I'm in water so I'm swimming");
		else if(ENVIRONMENT.AIR.name() == "AIR") {
			System.out.println("Oh no! I'm in the air, I must fly");
			super.move();
		}
		else
			System.out.println("I'm on land so I'm walking slowly");
	}
}
