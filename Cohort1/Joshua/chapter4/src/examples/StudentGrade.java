/**
 * 
 */
package examples;

/**
 * If student’s grade is greater than or equal to 90
Print “A”
else
If student’s grade is greater than or equal to 80
Print “B”
else
If student’s grade is greater than or equal to 70
Print “C”
else
If student’s grade is greater than or equal to 60
Print “D”
else
Print “F”
 * @author user
 *
 */
public class StudentGrade {
	public static void main(String[] args) {
		
	
	//public void studentGrade () {
	
		int studentGrade = 76;
		
		if(studentGrade >= 90) 
			System.out.println("A");
		
		else {
			if(studentGrade >= 80)
				System.out.println("B");
			else {
				if(studentGrade >= 70)
					System.out.println("C");
				else {
					if(studentGrade >= 60)
						System.out.println("D");
					else {
						if(studentGrade >= 80)
							System.out.println("B");
						else {
							System.out.println("F");
						}
					}
					
				}
				
			}
			
		}
	}
		
		//}// end of method studentGrade
	
	
}// end of class StudentGrade
