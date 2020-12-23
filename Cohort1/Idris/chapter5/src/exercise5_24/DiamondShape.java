package exercise5_24;

public class DiamondShape {
	public void displayDiamond() {
		int space = 5;int star = 1;
		for(int counter = 1; counter<=9; counter++) { //this iterate 9 times 
			for(int j=space; j>0; j--) {
				System.out.print(" ");//this gives number of space needed as specified by value of a 
			}
			for(int j=star; j>0; j--) {
				System.out.print("*"); //this gives number of star needed as specified by value of b
			}
			System.out.println();//this brings the cursor to the next line.
			
			if(counter>=5) {
				star-=2;space+=1;//the lower part of it is display here
			}
			else {
				space-=1;star+=2;//this print the upper part of the diamond 
			}	
		}
	}
}
