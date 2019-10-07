package exercise10_12;

import exercise8_14.Date2;

public class PayrollTest {

	public static void main(String[] args) {
		Date2 date = new Date2 (10,5,2016);
		Date2 date1 = new Date2 (5,8,2006);
		
		EmployeePolymorphism staffcomm = new CommissionEmployeePoly("nimat ","imran","33-33",date1,16.75,40.0);
		
		EmployeePolymorphism staffbase = new BaseCommPoly("karen","price","44-44",date,5000,0.04,300);
		
		
		EmployeePolymorphism []employee = new EmployeePolymorphism[2];
		employee[0]= staffcomm;
		employee[1] = staffbase;
		
		
		for(EmployeePolymorphism  staff: employee) {
			System.out.println(staff);
			if (staff.getBirthDate().getMonth()== 5){
				double newbonus =staff.earnings()+100; 
				
				
			System.out.println(newbonus);	
				
			}
			System.out.println(staff.earnings());
			
		}
	}

}
