/**
 * 
 */
package chapter7;

/**
 * @author User
 *
 */
public class ArraySize {
	public static void getArray() {
		
		final int ARRAY_SIZE =3;
		
		int [] [] table=new int [ARRAY_SIZE] [ARRAY_SIZE];
		
		
		for(int x=0;x<table.length;x++) {
			
			for(int y=0;y<table[x].length;y++) {
				table[x][y]=x+y;
				if(y%3==0) {
					System.out.println();
				}
		System.out.print(table[x][y]);
			}
		}
	}
	
	public static void main(String[] args) {
		getArray();
	}

}
