/**
 * 
 */
package chapter7;

/**
 * @author gbemi
 *
 */
public class OneDimensionalArray {
	
	public static void setArray(){
		
		System.out.printf("%s%8s%n","index","value");
		
		int[] count = new int[10];
		
		for(int z=0;z<count.length;z++){
		
		System.out.printf("%s%8s%n",z,count[z]);
		}
	}
	
	public static void arrayBonus() {
		
		System.out.println();
		
		System.out.println("adding 1 to each of the 15 element");
		
		System.out.printf("%s%8s%n","index","value");
		
		int [] bonus= {2,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		
		for(int i=0;i<bonus.length;i++) {
			
			++bonus[i];
			
			
			System.out.printf("%s%8s%n",i,bonus[i]);
		}
		
	}
	
	public static void bestScore(){
		System.out.println();
		System.out.println("Displaying bestscore in column format");
		System.out.printf("%s%8s%n","index","value");
		int[] count = {95,96,97,98,99};
		for(int z=0;z<count.length;z++){
		
		System.out.printf("%s%8s%n",z,count[z]);
		}
	
	}
	public static void main(String[] args) {
		setArray();
		
		arrayBonus();
		
		bestScore();
	}
	

}
