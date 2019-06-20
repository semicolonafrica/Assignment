package exercise4_33;

public class CheckerBoard {
	int row;
	int column;
	int side;
	public void diplayCheckerBoard() {
		row = 1;
		column = 1;
		side = 8;
			
		while(row<= side) { 
			 
			 column =1;
			 while(column <= side) {
				 
				 if(row ==side) {
					 System.out.print("*");
				 }
				 else if(column ==side) {
					 System.out.print("*");
				 }
//				 else if(column == 1) {
//					 System.out.print("*");
//				 }
//				 else if(column == side) {
//					 System.out.print("*");
//			     }
				 else {
					 System.out.println("");
				 }
				 column++;
			 	}
			 		row++;
		 	}
		
	}
}
