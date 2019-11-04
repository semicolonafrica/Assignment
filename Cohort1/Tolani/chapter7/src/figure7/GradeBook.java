package figure7;

public class GradeBook {
	
	private String courseName;
	
	private int[] grades;
	
	public GradeBook(String courseName, int[] grades) {
		
		this.courseName = courseName;
		
		this.grades = grades;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	
	public void processGrades() {
		
		outputGrades();
		
		System.out.printf("%nClass average is %.2f%n", getAverage());
		
		System.out.printf("Lowest grade is %d%n Highest grade is %d%n%n", getMinimum(),getMaximum());
		
		outputBarChart();
		
	}
	
	public int getMinimum() {
		int lowestGrade = grades[0];
		
		for(int grade : grades) {
			if(grade<lowestGrade) {
				
				grade = lowestGrade;
				}
		}
		return lowestGrade;
	}
	
	public int getMaximum() {
		int highestGrade = grades[0];
		
		for(int grade : grades) {
			if(grade>highestGrade) {
				
				grade = highestGrade;
				
			}
		}
		return highestGrade;
	}
	
	public double getAverage() {
		
		int total =0;
		
		double average =0;
		
		for(int grade : grades) {
			total+=grade;
		}
		
		average = total / grades.length;
		return average;
	}
	
	public void outputBarChart() {
		
		System.out.println("Grade Distribution");
		
		
		int[] frequency = new int[11];
		
		for(int grade : grades)
		++frequency[grade/10];
		
		
		for(int i =0;i< frequency.length;i++) {
			
			if(i == 10) {
				System.out.printf("%5d: ", 100);
				
			}
			else {
				System.out.printf("%02d -%02d: ", i *10, i * 10 + 9);
			}
			
			for(int j =0;j<frequency[i];j++) {
				System.out.print("*");
			}
				System.out.println();
			
		}
		
	}
	
	public void outputGrades() {
		System.out.printf("The grades are : %n%n");
		
		for(int student = 0; student < grades.length; student++) {
			System.out.printf("Student %2d: %3d%n", student + 1, grades[student]);
		}
	}
	
	
	
	

}
