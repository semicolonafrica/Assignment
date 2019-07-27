/**
 * 
 */
package chapter7;

/**
 * @author User
 *
 *
 */
public class SieveOfEratosthenes {
	private static boolean [] array=new boolean[1000];
	public static void sievePrime() {
		
		int i;
		for( i =2;i<array.length;i++) {
		array[i]=true; 
		
		if(i!=2 && i% 2==0) {
			array[i]=false;
			
			}
		else if(i!=3&&i%3==0) {
			array[i]=false;
			
			}
		
		else if(i!=5&&i%5==0) {
			array[i]=false;
			//System.out.println(array[i]);
			}
		else if(i!=7&&i%7==0) {
			array[i]=false;
		}
		if(array[i]==true) {
			System.out.println(i+" ");
			}
		}
		
		
	
		
	}
	
	public static void main (String[] args) {
		sievePrime();
	}

}

