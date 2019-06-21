package chapter5.exercise522;

public class ModifiedTriangle {

	public void newTriangle() {
		System.out.println("a" + "\t" + "\tb" + "\t\tc" + "\t\t      d");
		int row = 1, space1 =14, numberOfRow = 10, space2 =5; 
		
		for (int i=row; i<=10; i++) {
			for(int j = row; j>0; j--) { // loop for filling the first column with "*"
				System.out.print("*"); // fill the row with "*"
			}
			for(int k = space1; k>0; k--) { // loop for filling the second column with " "
				System.out.print(" ");
			}
			for(int l = numberOfRow; l>0; l--) { // loop for filling the third column with "*" 
				System.out.print("*");
			}
			for(int m = space2; m>0; m--) { // loop for filling the fourth column with " "
				System.out.print(" ");
			}
			for(int n = numberOfRow; n>0; n--) { // loop for filling the 5th column with "*"
				System.out.print("*");
			}
			for(int p = space1; p>0; p--) { // loop for filling the 6th column with " "
				System.out.print(" ");
			}
			for(int j = row; j>0; j--) { // loop for filling the 7th column with "*"
				System.out.print("*");
			}
			System.out.println(" "); // print space between rows
			row +=1; space1 -=1; numberOfRow -=1; space2 +=2;
		}	
	}
	public static void main(String[] args) {
		ModifiedTriangle triangle1 = new ModifiedTriangle();
		triangle1.newTriangle();
	}
}
