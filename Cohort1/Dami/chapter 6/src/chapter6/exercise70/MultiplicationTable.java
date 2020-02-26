package chapter6.exercise70;

public class MultiplicationTable {

	public void createTable() {
		
		for(int i = 1; i <= 12; i++) {
			System.out.printf("%s%d%n", "Table ", i);
			for(int a = 1; a <= 12; a++) {
				System.out.printf("%d%s%d%s%s%n", a, " * ", i, " = ", i * a ); 
			}
			System.out.println();
		}
	}

}
