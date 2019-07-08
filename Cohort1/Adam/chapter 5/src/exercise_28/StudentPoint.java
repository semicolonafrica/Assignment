package exercise_28;

public class StudentPoint {
	
	public static int qualityPoint(int scores) {
		
		//int scores = 1;
		int grade = 1;
		
		if(scores >= 90 && scores <= 100 ) {
			grade =4;
			
			
		}
		else
			if(scores >= 80 && scores <= 89 ) {
				grade =3;
				
		
		}
		else
			if(scores >= 70 && scores <= 79 ) {
					grade =2;
					
			
		}
		else
			if(scores >= 60 && scores <= 69 ) {
					grade = 1;
					
			
		}
			else
				if(scores < 60  ) {
					grade = 0;
					
			
		}
		else {
			System.out.println("Wrong Value!!!");
		}
		return grade;
}

}
