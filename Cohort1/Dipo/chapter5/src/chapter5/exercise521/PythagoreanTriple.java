package chapter5.exercise521;

public class PythagoreanTriple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%s%15s    %15s%n", "Side1","Side2","Hypotenuse");
		int side1, side2, hypotenuse;
		
		for(side1 = 1; side1 < 500; side1++) {
			
			for(side2 = 1; side2 < 500; side2++) {
				
				for(hypotenuse = 1; hypotenuse < 500; hypotenuse++) {
					
					if((side1 * side1) + (side2 * side2) == (hypotenuse * hypotenuse)) {
						
						System.out.printf("%d%15d%15d%n", side1,side2,hypotenuse);
					}
				}
			}
		}
	}

}
