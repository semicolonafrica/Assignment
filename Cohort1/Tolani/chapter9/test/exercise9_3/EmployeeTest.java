/**
 * 
 */
package exercise9_3;

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
	
	BasePlusCommission basePlusCommission;

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
		employee = new Employee();
		 
		commissionEmployee = new CommissionEmployee();
		basePlusCommission = new BasePlusCommission();
		commissionEmployee.setBasePlusCommission(basePlusCommission);
		employee.setCommissionEmployee(commissionEmployee);
		
		
		}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testForVariablesInEmployeeClassAtDefaultValue() {
		assertEquals(employee.getFirstName(),null);
		assertEquals(employee.getLastName(),null);
		assertEquals(employee.getSocialSecurityNumber(),null);
		assertEquals(employee.getGrossSales(),0);
		assertNotNull(employee.getCommissionEmployee());
		assertEquals(EmployeeType.COMM,employee.getEmployeeType());
		
	}
	
	@Test
	void testMethodEarningForCommEmployee() {
		assertNotNull(multiplyGrossSalesndComRate());
		assertNotNull(employee.getGrossSales());
		assertNotNull(employee.getCommissionEmployee().getCommissionRate());
		assertEquals(EmployeeType.COMM,employee.getEmployeeType());
		employee.getEarning();
		
		
	}
	public double multiplyGrossSalesndComRate() {
		double grossSales = 400;
		employee.setGrossSales(grossSales);
		double commissionrate = 0.5;
		commissionEmployee.setCommissionRate(commissionrate);
		double multiply = employee.getGrossSales() * commissionEmployee.getCommissionRate();
		return multiply;
	}
	@Test
	void testMethodEarningForBasePlusCommEmployee() {
		double baseSalary = 1000;
		basePlusCommission.setBaseSalary(baseSalary);
		assertNotNull(multiplyGrossSalesndComRate());
		assertNotNull(employee.getCommissionEmployee().getBasePlusCommission().getBaseSalary());
		assertEquals(EmployeeType.COMM,employee.getEmployeeType());
		employee.setEmployeeType(EmployeeType.BASEPLUS);
		assertEquals(EmployeeType.BASEPLUS,employee.getEmployeeType());
		employee.getEarning();
		
		
	}
	
	
	
	

}
