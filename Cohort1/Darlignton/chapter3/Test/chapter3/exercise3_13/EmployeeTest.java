package chapter3.exercise3_13;

public class EmployeeTest{
    
    public static void main(String[] args){

        Employee detail1 = new Employee("vincent","okengwu", 500.0);
        Employee detail2 = new Employee("kingsley", "nmecha", 350.0);

        System.out.println(detail1.getFirstname() + detail1.getLastname() + " salary is " + detail1.getSalary() + detail1.calculateEmployeeYearlySalary());
        System.out.println(detail2.getFirstname() + detail2.getLastname() + " salary is " + detail2.getSalary() + detail2.calculateEmployeeYearlySalary());
        
    
    }
}
