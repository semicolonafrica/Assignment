package chapter6;

public class QualityPoint {
	
	
	public static void getQualityPoint(int grade) {
		int temp4=4,temp3=3,temp2=2,temp1=1,temp0=0;
		int temp=0;
		//int grade=0;
		switch (grade)
		{
		case 90:
		case 100:
			if(grade>=90&& grade<100);
			temp=temp4;
			break;
		case 3:
			if(grade>79&&grade<90);
			temp=temp3;
			break;
		case 2:
			if(grade>69&&grade<80);
			temp=temp2;
			break;
			
		case 1:
			if(grade>59&&grade<70);
			temp=temp2;
			break;
			
		case 0:
			if(grade<=59);
			temp=temp0;
			break;
		}
		System.out.println(temp);
	}

}
