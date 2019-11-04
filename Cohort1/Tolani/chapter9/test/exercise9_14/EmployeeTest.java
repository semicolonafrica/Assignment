/**
 * 
 */
package exercise9_14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author user
 *
 */
class EmployeeTest {
	
	Employee employee;
	
	CommissionEmployee commissionEmployee;
	
	BasePlusCommissionEmployee basePlusCommissionEmployee;
	
	HourlyWageEmployee hourlyWageEmployee;
	
	String firstName;
	
	String lastName;
	
	String socialSecurityNumber;
	
	double grossSales;
	
	double commissionRate;
	
	double baseSalary;
	
	double hours;
	
	double wage;
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		firstName = "Nimi";
		lastName = "Kunle";
		socialSecurityNumber = "NIMI123";
		grossSales = 30;
		commissionRate = 0.1;
		baseSalary = 1000;
		hours = 20;
		wage = 200;
		employee = new Employee(firstName,lastName,socialSecurityNumber);
		commissionEmployee = new CommissionEmployee(firstName, lastName, socialSecurityNumber,grossSales,commissionRate);
		basePlusCommissionEmployee = new BasePlusCommissionEmployee(firstName,lastName,socialSecurityNumber,grossSales,commissionRate,baseSalary);
		hourlyWageEmployee = new HourlyWageEmployee(firstName,lastName,socialSecurityNumber,hours,wage);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}
	
	public void checkAllEmployeeCommonDetails() {
		
		assertEquals(employee.getFirstName(),firstName);
		
		assertEquals(employee.getLastName(),lastName);
		
		assertEquals(employee.getSocialSecurityNumber(),socialSecurityNumber);
	}

	@Test
	void initializedVariableTest() {
		
		checkAllEmployeeCommonDetails();
		
		assertNotNull(employee.toString());
		
		employee.printEmployeeDetails();

	}
	
	@Test
	void commissionEmployeeInitializedVariableTest() {
		
		checkAllEmployeeCommonDetails();
		
		assertEquals(commissionEmployee.getGrossSales(),grossSales);
		
		assertEquals(commissionEmployee.getCommissionRate(),commissionRate);
	}
	
	@Test
	void checkIfgrossSalesIsNegativeTest() {
		
		checkAllEmployeeCommonDetails();
		
		commissionEmployee.setGrossSales(-20.0);
		
		assertEquals(commissionEmployee.getCommissionRate(),commissionRate);
		
		assertThrows(IllegalArgumentException.class,()-> commissionEmployee.setGrossSales(-20.0));	
		
	}
	
	@Test
	void checkIfcommissionRateIsNegativeTest() {
		
		checkAllEmployeeCommonDetails();
		
		assertEquals(commissionEmployee.getGrossSales(),grossSales);
		
		assertThrows(IllegalArgumentException.class,()-> commissionEmployee.setCommissionRate(-1));	
		
	}
	
	@Test
	void checkIfcommissionRateIsZeroTest() {
		
		checkAllEmployeeCommonDetails();
		
		assertEquals(commissionEmployee.getGrossSales(),grossSales);
		
		assertThrows(IllegalArgumentException.class,()->  commissionEmployee.setCommissionRate(0.0));	
		
	}
	
	@Test
	void commissionEmployeeEarningTest() {
		
		assertNotNull(commissionEmployee.earnings());
		
		assertNotNull(commissionEmployee.toString());
		
		commissionEmployee.printEmployeeDetails();
			
	}
	
	
	@Test
	void basePlusCommissionEmployeeInitializedVariableTest() {
		
		checkAllEmployeeCommonDetails();
		
		assertEquals(basePlusCommissionEmployee.getGrossSales(),grossSales);
		
		assertEquals(basePlusCommissionEmployee.getCommissionRate(),commissionRate);
		
		assertEquals(basePlusCommissionEmployee.getBaseSalary(),baseSalary);
	}
	
	@Test
	void checkIfBaseSalaryIsNegativeTest() {
		
		checkAllEmployeeCommonDetails();
		
		assertEquals(basePlusCommissionEmployee.getGrossSales(),grossSales);
		
		assertEquals(basePlusCommissionEmployee.getCommissionRate(),commissionRate);
		
		assertThrows(IllegalArgumentException.class,()-> basePlusCommissionEmployee.setBaseSalary(-20.0));	
		
	}
	
	@Test
	void basePlusCommissionEmployeeEarningTest() {
		
		assertNotNull(basePlusCommissionEmployee.earnings());
		
		assertNotNull(basePlusCommissionEmployee.toString());
		
		basePlusCommissionEmployee.printEmployeeDetails();
			
	}
	
	@Test
	void hourlyWageEmployeeInitializedVariableTest() {
		
		checkAllEmployeeCommonDetails();
		
		assertEquals(hourlyWageEmployee.getHours(),hours);
		
		assertEquals(hourlyWageEmployee.getWage(),wage);
	}
	
	
	@Test
	void checkIHourValueIsNegativeTest() {
		
		checkAllEmployeeCommonDetails();
		
		assertEquals(hourlyWageEmployee.getWage(),wage);
		
		assertThrows(IllegalArgumentException.class,()-> hourlyWageEmployee.setHours(-20.0));	
		
	}
	
	@Test
	void checkIHourValueIsGreaterThanTotalNumberOfHoursInAWeekTest() {
		
		checkAllEmployeeCommonDetails();
		
		assertEquals(hourlyWageEmployee.getWage(),wage);
		
		assertThrows(IllegalArgumentException.class,()-> hourlyWageEmployee.setHours(200));	
		
	}
	
	@Test
	void checkIWageValueIsNegativeTest() {
		
		checkAllEmployeeCommonDetails();
		
		assertEquals(hourlyWageEmployee.getHours(),hours);
		
		assertThrows(IllegalArgumentException.class,()-> hourlyWageEmployee.setWage(-20.0));	
		
	}
	
	@Test
	void hourlyWageForHourLessThan40hoursEmployeeEarningTest() {
		
		assertNotNull(hourlyWageEmployee.earnings());
		
		assertNotNull(hourlyWageEmployee.toString());
		
		hourlyWageEmployee.printEmployeeDetails();
			
	}
	
	@Test
	void hourlyWageForHourGreaterThan40hoursEmployeeEarningTest() {
		
		hourlyWageEmployee.setHours(70);
		
		assertNotNull(hourlyWageEmployee.earnings());
		
		assertNotNull(hourlyWageEmployee.toString());
		
		hourlyWageEmployee.printEmployeeDetails();
			
	}
	
	
	

}
