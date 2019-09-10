package chapter9;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {
	BasePlusCommissionEmployee employee;
	CommissionEmployee staff;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		employee = new BasePlusCommissionEmployee();
		staff = new CommissionEmployee();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void BasePlusCommissionEmployeeInitializedTest() {
//		fail("Not yet implemented");
		
		assertNotNull(employee);
		assertEquals(0,employee.earnings(staff));
		assertEquals(employee.getBaseSalary(),0);
		
		assertEquals(null,staff.getFirstName());
		
		staff.setFirstName("Awoseemo");
		
		assertEquals("Awoseemo",staff.getFirstName());
		
		staff.setLastName("Akinlolu");
		
		assertEquals("Akinlolu",staff.getLastName());
		
		assertEquals(0.0,staff.getGrossSales());
		
		staff.setGrossSales(15.4);
		
		assertEquals(15.4,staff.getGrossSales());

		staff.setSocialSecurityNumber(12354);
		
		assertEquals(12354,staff.getSocialSecurityNumber());
		
		assertEquals(0.0,staff.getCommissionRate());
		staff.setCommissionRate(0.5);
		assertEquals(0.5,staff.getCommissionRate());
		
		double value = staff.getGrossSales() * staff.getCommissionRate();
		assertEquals(value,staff.earnings());
		
		
		
		employee.setBaseSalary(1200);
		employee.setStaff(staff);
		
		assertSame(employee.getStaff(),staff);
		assertEquals(employee.getStaff(),staff);
		assertNotNull(employee.earnings(staff));

		System.out.printf("%s%n%n",employee.toString());

		System.out.println();
		
		
	}
	
	@Test
	void CommissionEmployeeInitializedTest() {
		assertNotNull(staff);
		assertEquals(null,staff.getFirstName());
		
		staff.setFirstName("Awoseemo");
		
		assertEquals("Awoseemo",staff.getFirstName());
		
		staff.setLastName("Akinlolu");
		
		assertEquals("Akinlolu",staff.getLastName());
		
		assertEquals(0.0,staff.getGrossSales());
		assertThrows(IllegalArgumentException.class, ()-> staff.setGrossSales(-1));
		
		staff.setGrossSales(15.4);
		
		assertEquals(15.4,staff.getGrossSales());

		staff.setSocialSecurityNumber(12354);
		
		assertEquals(12354,staff.getSocialSecurityNumber());
		
		assertEquals(0.0,staff.getCommissionRate());
		staff.setCommissionRate(0.5);
		assertEquals(0.5,staff.getCommissionRate());
		
		double value = staff.getGrossSales() * staff.getCommissionRate();
		assertEquals(value,staff.earnings());
		
		
		System.out.printf("%s%n%n",staff.toString());
		System.out.printf("%s: %.2f%n%n","Earnings without Salary:",staff.earnings());
		
		
	}

}
