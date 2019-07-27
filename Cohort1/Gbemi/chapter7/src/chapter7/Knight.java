/**
 * 
 */
package chapter7;

/**
 * @author User
 *
 */
public class Knight {
	
	int[] horizontal= {2,1,-1,-2,-2,-1,1,2};
	int[] vertical={-1,-2,-2,-1,1,2,2,1};
	
	public int getHorizontal(int moveNumber) {
		return horizontal[moveNumber];
	}
	
	public int getVertical(int moveNumber) {
		return vertical[moveNumber];
	}

}
