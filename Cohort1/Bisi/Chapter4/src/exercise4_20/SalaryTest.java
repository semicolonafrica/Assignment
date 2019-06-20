package exercise4_20;

	import java.util.Scanner;
	public class SalaryTest {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			
			Salary Olabisi = new Salary(4000, 40, 0, 40);
			Salary Brown = new Salary(4000, 40, 3, 43);
			Salary Mike = new Salary(4000, 40, 10, 50);
			
			System.out.printf("Gross pay for Olabisi is: %.2f%n",Olabisi.calGrossPay());
			System.out.printf("Gross pay for Olabisi is: %.2f%n",Brown.calGrossPay());
			System.out.printf("Gross pay for Olabisi is: %.2f%n",Mike.calGrossPay());
		}

	}
