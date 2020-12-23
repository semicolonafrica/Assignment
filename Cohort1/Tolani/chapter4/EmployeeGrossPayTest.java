import java.util.Scanner;

public class EmployeeGrossPayTest{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter employee name: ");
        String employeeName = input.nextLine();

        System.out.println("Enter employee total hours worked: ");
        int hours = input.nextInt();

        System.out.println("Enter employee payment rate: ");
        double rates = input.nextDouble();

        EmployeeGrossPay employee = new EmployeeGrossPay(employeeName, hours, rates);

        
        employee.calulateHoursPay();
        employee.calGrossPay();

        input.close();
    }
}