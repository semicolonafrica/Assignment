package chapter5.exercise523;

public class DeMorganLaw {

	public static void main(String[] args) {
		DeMorganLaw sample1 =new DeMorganLaw();
		
		sample1.deMorgan1();
		sample1.deMorgan2();
		sample1.deMorgan3();
		sample1.deMorgan4();
	}	
	public void deMorgan1() {
		int x = 5, y = 6;
		if ((!(x < 5) && !(y >= 7)) == (!((x < 5)||(y >= 7)))) {
			System.out.println("De Morgan's Law is satisfied");
		}
		else {
			System.out.println("De Morgan's Law is not satisfied");	
		}
	}
	public void deMorgan2() {
		int a = 5, b = 6, g= 6; 
		if ((!(a == b) || !(g != 5)) == (!(a == b) && (g !=5))) {
			System.out.println("De Morgan's Law is satisfied");
		}
		else {
			System.out.println("De Morgan's Law is not satisfied");	
		}
	}
	public void deMorgan3() {
		int x = 5, y = 6;
		if (!((x <= 8) && (y > 4)) == (!(x <= 8) || !(y > 4))) {
			System.out.println("De Morgan's Law is satisfied");
		}
		else {
			System.out.println("De Morgan's Law is not satisfied");	
		}
	}
	public void deMorgan4() {
		int i = 3, j = 6;
		if (!((i > 4) || (j <= 6)) == (!(i > 4) && !(j <= 6))) {
			System.out.println("De Morgan's Law is satisfied");
		}
		else {
			System.out.println("De Morgan's Law is not satisfied");	
		}
	}
}   
