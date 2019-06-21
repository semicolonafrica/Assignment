/**
 * 
 */
package examples;

/**
 * Fig.4.4: Student.java
 * Student class that stores a student name and average
 * @author user
 *
 */
public class Student {

	private String name;
	public double average;
	
	public Student(String name, double average) {
		this.name = name;
		
		if(average > 0.0)
			if(average <= 100.0)
				this.average = average;
	}
	public void setName(String name) {
	this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAverage(double studentAverage) {
		this.average = average;
		
//		if(average > 0.0)
//			if(average <= 100.0)
//				this.average = average;
	}
	
	
	public double getAverage() {
		return average;
	}
	
	public String getLetterGrade() {
		String letterGrade = "";
		
		if(average > 90)
			letterGrade = "A";
		else
			if(average >= 80)
				letterGrade = "B";
			else
				if(average >= 70)
					letterGrade = "C";
				else
					if(average >= 60)
						letterGrade = "D";
					else
						letterGrade = "F";
		return letterGrade;
		
	} // end class student

}
