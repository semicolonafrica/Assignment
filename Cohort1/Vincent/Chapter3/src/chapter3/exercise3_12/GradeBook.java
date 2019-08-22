package chapter3.exercise3_12;

public class GradeBook {
	
	 private String courseName; 
	    private String lecturerName;
	     
	    public GradeBook(String name, String lectureName){
	       courseName = name;
	       lecturerName = lectureName;
	    }
	public void setCourseName(String name){
	    this.courseName = name;
	}
	public String getCourseName() {
	    return courseName;
	}
	public void setLectureName(String name){
	    this.lecturerName = name;
	}
	public String getLectureName(){
	    return lecturerName;
	}
	public boolean displayName(){
	   System.out.printf("welcome to grade book for\n%s!\nThis course is presented by: \n%s", getCourseName(),getLectureName()) ;

	   return true;
	}
	}

