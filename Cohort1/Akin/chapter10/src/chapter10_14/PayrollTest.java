package chapter10_14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PayrollTest {
	
	Employee[] employee;
	CommissionEmployee commissionEmployee;
	HourlyEmployee hourlyEmployee;
	SalariedEmployee salariedEmployee;
	BasePlusCommissionEmployee basePlusCommissionEmployee;
	PieceWorker pieceWorker;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		hourlyEmployee = new HourlyEmployee("Akinlolu", "Olaposi","129430",40,5);
		salariedEmployee = new SalariedEmployee("Oriade", "Odeku","493021",230.9);
		commissionEmployee = new CommissionEmployee("Folashade", "Solagbade", "086954",43302.00,0.34);
		basePlusCommissionEmployee = new BasePlusCommissionEmployee("Toluwalase","Okungbade","549332",54302.32,0.87, 43029.10);
		pieceWorker = new PieceWorker("Mayowa", "Omotosho", "302793",574.2,8);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		
	}
	
	@Test
	void getEachEmployeeEarnings() {
		
		assertNull(employee);
		
		employee = new Employee[5];
		
		assertNotNull(employee);
		assertEquals(0,hourlyEmployee.getHours());
		
		hourlyEmployee.setHours(10);
		hourlyEmployee.setWage(8);
		
		employee[0] = salariedEmployee;
		employee[1] = hourlyEmployee;
		employee[4] = pieceWorker;
		employee[3] = basePlusCommissionEmployee;
		employee[2] = commissionEmployee;
		
		//generically process each element in array employees
		
		for(Employee employees: employee) {
			System.out.println(employees);
			
			if (employees instanceof BasePlusCommissionEmployee) {
				
				//downcast Employee reference to 
				//BasePlusCommissionEmployee reference
				BasePlusCommissionEmployee employee1 = (BasePlusCommissionEmployee) employees;
				
				employee1.setBaseSalary(1.10 * employee1.getBaseSalary());
				
				System.out.printf("new base salary with 10%% increase is: $%,.2f%n",
						employee1.getBaseSalary());
			} // end if
			System.out.printf("earned $%,.2f%n%n", employees.earnings());
		}
		
		for(int j = 0; j < employee.length; j++) {
			System.out.printf("Employee %d is a %s%n", j, employee[j].getClass().getName());
		}
		
	}

}
