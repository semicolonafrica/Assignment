package examples;

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
	
	public void outputGrades() {
		System.out.printf("the grades are : %n%n");
		
		for(int student = 0; student < grades.length; student++) {
			System.out.printf("student  %2d: %3d%n", student+1, grades[student]);
		}
	}
	
	public double getAverage() {
		int total = 0;
		for(int value: grades) {
			total += value;
		}
		double average =(double) total/grades.length;
		return average;
	}
	
	public int getMinimum() {
		int minGrade = grades[0];
		for(int i=0; i<grades.length; i++) {
			if(minGrade > grades[i]) {
				minGrade = grades[i];
			}
		}
		return minGrade;
	}
	
	public int getMaximum() {
		int maxGrade = grades[0];
		for(int i=0; i<grades.length; i++) {
			if(maxGrade < grades[i]) {
				maxGrade = grades[i];
			}
		}
		return maxGrade;
	}
	
	public void outputBarChart() {
		int[] frequency = new int[11];
		for (int i = 0; i< grades.length; i++) {
			++frequency[grades[i]/10];
		}
		System.out.println();
		System.out.println("the grade book frequency chart is below");
		for(int i = 0; i<frequency.length; i++) {
			if(i==10) {
				System.out.printf("%8d: ", 100);
			}
			else {
				System.out.printf("%5d-%3d", i* 10, i*10+9);
			}
			for(int j = 0; j<frequency[i];j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void processGrades() {
		
		outputGrades();
		
		System.out.printf("%nClass average is %.2f%n",getAverage());
		
		System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n", getMinimum() , getMaximum());
		
		outputBarChart();
	}
}
