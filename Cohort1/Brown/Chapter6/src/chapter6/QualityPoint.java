package Chapter6.exercise6_28;

public class QualityPoint {
	char gradePoint =0;
	
	public static char GradePoint(int score){
		char gradePoint =0;
		
        if(score >=90 && score <=100){
            return '4';
        }
        else if(score>= 80 && score<=89){
            return '3';
        }
        else if(score>= 70 && score<=79){
            return '2';
        }
        else if(score>= 60 && score<=69){
            return '1';
        }
        else if(score<60){
            return '0';
        }
        return gradePoint;
	}
}
