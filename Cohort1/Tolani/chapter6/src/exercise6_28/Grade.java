package exercise6_28;

public class Grade {

	public static int displayPoint(int grade) {
		
		int point =0;
		
		switch(grade/10) {
		
		case 10:
			
		case 9:
			
			point = 4;
			
			break;
			
		case 8:
			
			point = 3;
			
			break;
			
		case 7:
			
			point = 2;
			
			break;
			
		case 6:
			
			point = 1;
			
			break;
			
		default:
			
			break;
		}
		
		return point;
		
	}
}
