package exercise10_12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercise8_8.Date1;

class EmployeeTest {
	
	SalaryEmployee salaryEmployee;
	
	HourlyEmployee hourlyEmployee;
	
	CommissionEmployee commissionEmployee;
	
	BaseCommissionEmployee baseCommissionEmployee;
	
	Employee[] employees;
	
	Date1 birthDate = new Date1(12,3,1996);
	
	Date1 birthDate1 = new Date1(11,2,1960);
	
	Date1 birthDate2 = new Date1(03,28,1970);
	
	Date1 birthDate3 = new Date1(9,5,1968);
	
	
	
//	String firstName;
//	
//	String lastName;
//	
//	String socialSecurityNumber;
//	
//	double weeklySalary;
//	
//	double wages;
//	
//	double commissionRate;
//	
//	double grossSales;
//	
//	double salary;
//	
//	int hours;
	
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
//		firstName = "Kunle";
//		
//		lastName = "Adebayo";
//		
//		socialSecurityNumber = "SCV10Y9";
//		
//		weeklySalary = 1000;
//		
//		wages = 200;
//		
//		hours = 20;
//		
//		
//		
//		commissionRate = 0.5;
//
//		grossSales = 200;
//		
//		salary = 10000;
		
		employees = new Employee[4];
		
		salaryEmployee = new SalaryEmployee("Kunle","Adebayo","22-12-FG6",5000,birthDate);
		
		hourlyEmployee = new HourlyEmployee("Uche","Chukwuka","23-12-GH7",200,20,birthDate1);
		
		commissionEmployee = new CommissionEmployee("Remi","Julius","32-11-TM5",0.2,300,birthDate2);
		
		baseCommissionEmployee = new BaseCommissionEmployee("Grabiel","Aminu","76-50-FG8",0.5,500,200000,birthDate3);
		
		employees[0] = salaryEmployee;
		
		employees[1] = hourlyEmployee;
		
		employees[2] = commissionEmployee;
		
		employees[3] = baseCommissionEmployee;
		
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void salaryEmployeeTest() {
		
		assertEquals(salaryEmployee.getWeeklySalary(),5000);
		
		salaryEmployee.earning();
		
		salaryEmployee.toString();
		
		salaryEmployee.printEmployeeDetails();
	}
	
	@Test
	void checkIfweeklySalaryIsNegativeTest() {
	
		
		assertThrows(IllegalArgumentException.class,()->salaryEmployee.setWeeklySalary(-20.0));	
		
	}
	
	@Test
	void hourlyEmployeeTest() {
		
		assertEquals(hourlyEmployee.getWages(),200);
		
		assertEquals(hourlyEmployee.getHours(),20);
		
		hourlyEmployee.earning();
		
		hourlyEmployee.toString();
		
		hourlyEmployee.printEmployeeDetails();
		
	}
	
	
	@Test
	void checkIHourValueIsNegativeTest() {
		
		
		assertThrows(IllegalArgumentException.class,()-> hourlyEmployee.setHours(-20));	
		
	}
	
	@Test
	void checkIHourValueIsGreaterThanTotalNumberOfHoursInAWeekTest() {
		
		
		assertThrows(IllegalArgumentException.class,()-> hourlyEmployee.setHours(200));	
		
	}
	
	@Test
	void checkIWageValueIsNegativeTest() {
		
		assertThrows(IllegalArgumentException.class,()-> hourlyEmployee.setWages(-20.0));	
		
	}
	
	@Test
	void hourlyWageForHourLessThan40hoursEmployeeEarningTest() {
		
		assertNotNull(hourlyEmployee.earning());
		
		assertNotNull(hourlyEmployee.toString());
		
		hourlyEmployee.printEmployeeDetails();
			
	}
	
	@Test
	void hourlyWageForHourGreaterThan40hoursEmployeeEarningTest() {
		
		hourlyEmployee.setHours(70);
		
		assertNotNull(hourlyEmployee.earning());
		
		assertNotNull(hourlyEmployee.toString());
		
		hourlyEmployee.printEmployeeDetails();
			
	}
	
	@Test
	void commissionEmployeeTest() {
		
		assertEquals(commissionEmployee.getCommissionRate(),0.2);
		
		assertEquals(commissionEmployee.getGrossSales(),300);
		
		assertNotNull(commissionEmployee.earning());
	
		assertNotNull(commissionEmployee.toString());
		
		commissionEmployee.printEmployeeDetails();
		
	}
	
	@Test
	void checkGrossSalesValueIsNegativeTest() {
		
		
		assertThrows(IllegalArgumentException.class,()-> commissionEmployee.setGrossSales(-20));	
		
	}
	
	@Test
	void checkCommissionRateValueIsGreaterThanOneTest() {
		
		
		assertThrows(IllegalArgumentException.class,()-> commissionEmployee.setCommissionRate(200));	
		
	}
	
	@Test
	void checkCommissionRateValueIsNegativeTest() {
		
		assertThrows(IllegalArgumentException.class,()-> commissionEmployee.setCommissionRate(-20.0));	
		
	}
	
	@Test
	void baseCommissionEmployeeTest() {
		
		assertEquals(baseCommissionEmployee.getCommissionRate(),0.5);
		
		assertEquals(baseCommissionEmployee.getGrossSales(),500);
		
		assertEquals(baseCommissionEmployee.getBaseSalary(),200000);
		
		assertNotNull(baseCommissionEmployee.earning());
	
		assertNotNull(baseCommissionEmployee.toString());
		
		baseCommissionEmployee.printEmployeeDetails();
		
	}
	

	@Test
	void bonusFoEmployeeTest() {
		
		int month = 12;
		
		for (Employee currentEmployee: employees) {
			if(currentEmployee  == employees[0]) {
				if(salaryEmployee.getBirthDate().getMonth() == month) {
					salaryEmployee.setBonus(100);
				System.out.println(salaryEmployee.earning());}
			}
			else if(currentEmployee  == employees[1]) {
				if(hourlyEmployee.getBirthDate().getMonth() == month) {
					hourlyEmployee.setBonus(100);
				System.out.println(hourlyEmployee.earning());}
			}
			else if(currentEmployee  == employees[2]) {
				if(commissionEmployee.getBirthDate().getMonth() == month) {
					commissionEmployee.setBonus(100);
				System.out.println(commissionEmployee.earning());}
			}
			
			else  {
				if(baseCommissionEmployee.getBirthDate().getMonth() == month) {
					baseCommissionEmployee.setBonus(100);
					System.out.println(baseCommissionEmployee.earning());
				}
			}
			
			
		}
	}
	

	

}
