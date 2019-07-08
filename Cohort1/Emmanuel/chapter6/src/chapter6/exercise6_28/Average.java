/**
 * 
 */
package chapter6.exercise6_28;

/**
 * @author USER
 *
 */
public class Average {
	
	public static int qualityPoints(int point) {
		
			int result= 0;
		
			
			switch(point/10) {
			
			case 10:
			case 9:
				result+=4;
				break;
				
			case 8 :
				result+=3;
				break;
			
			case 7:
				result+=2;
				break;
				
			case 6:
				result+=1;
				break;
				
			case 5:
				result+=0;
				break;		
			}

		//System.out.println(result);
		return result;
	}
	
}
