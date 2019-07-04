package chapter6.exercise628;

import java.util.Scanner;

public class QualityPoints {

	public  static int qualityPoint(int Point) {
		int remark = 0;
		
		if(Point >=90 && Point <= 100) 
			remark = 4;
		
			if( Point >= 80 && Point <= 89)
			remark = 3;
			
				if (Point >= 70 && Point <= 79)
				remark = 2;
				
					if( Point >= 60 && Point <= 69)
						remark = 1;
					
	return remark;
	}
		
	
	
	public static void main(String[] args){
		
		Scanner score = new Scanner(System.in);
		System.out.println("Enter score");
		int result = score.nextInt();
		score.close();
		System.out.println(qualityPoint(result));
	}
						
						

		
	
}
