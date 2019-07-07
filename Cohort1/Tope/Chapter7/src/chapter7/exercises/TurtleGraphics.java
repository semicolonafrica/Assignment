package chapter7.exercises;

//Program written by Oyemade Temitope 
//Exercise 7.19
//5th of July 2019
public class TurtleGraphics {
	
	
	static int[][] floor = new int[20][20]; 
	
	static int[][] commands = { {1}, {2}, {3}, {4} , {5,12}, {6} , {9}  };
	
	static int[] myCommand = {commands[1][0],commands[4][0],commands[2][0]
			, commands[4][0], commands[2][0], commands[4][0],commands[2][0],
					commands[4][0],commands[0][0], commands[5][0],commands[6][0]
					}; 
	
	
	
	
	
	
	
	public static void displayArray(int[][] array) {
		
		for(int i = 0; i< array.length; i++) {
			
			for(int v = 0; v< array[i].length; v++ ) {
				
				System.out.printf("%s ","s" );
			}
			
			System.out.println();
		}	
	}
	
	public static void numberOfSpaces(int num) {
		
		for(int u = 0; u<num*3; u++) {
			
			if(u % num == 0)
				System.out.println();
			
			
			System.out.printf("%s ", "*");
			
		}
	}
	
	

	public static void turtleGraph(int position1, int position2) {
		
		int counter =  0;
		
		for(int x = position1; x < floor.length; x++) {
			
			for(int y = position2; y< floor[x].length; y++) {
				
				try {
				
					switch(myCommand[counter]) {
					
					
					
					case 1:
						System.out.println();
						break;
						
					case 5: case 12:
						numberOfSpaces(12);
					counter++;
					break;
					
					case 3:
						System.out.println();
						counter++;
						break;
					
						
					case 6:
						System.out.println();
						displayArray(floor);
						break;
						
					
					}
					
					counter++;
					
					
			}
			catch(ArrayIndexOutOfBoundsException e) {
				
				
			}
				
			}
			}
		}
		

}
