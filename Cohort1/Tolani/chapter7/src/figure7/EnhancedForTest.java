package figure7;
//Enhanced for statement can only be used to obtain an array element,
//it can be used to modify element of an array.....
public class EnhancedForTest {

	public static void main(String[] args) {
		
		int[] gradeStudent = {45,69,90,87,76,34,45,23,64,76,98,99,83};
		int total =0;
		
		for(int number : gradeStudent) {
			total+=number;
			
		}
		System.out.printf("Total grade of student is: %d%n ", total);
	}

}
