package chapter10.exercise10_15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PayableInterfaceTest {

	Payable[] payableObjects;
	Invoice invoice1;
	Invoice invoice2;
	Employee employee;
	SalariedEmployee salariedEmployee;
	HourlyEmployee hourlyEmployee;
	CommissionEmployee commissionEmployee;
	BasePlusCommissionEmployee basePlusCommissionEmployee;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		assertNull(invoice1);
		assertNull(invoice2);
		
		invoice1 = new Invoice("23847","seat", 5, 348.29);
		invoice2 = new Invoice("32465", "reader", 7, 856.90);
		
		hourlyEmployee = new HourlyEmployee("Adeola", "Odeku", "23738", 129.4, 6);
		salariedEmployee = new SalariedEmployee("Oluwalogbon", "Anuoluwapo", "49372", 29.5);
		commissionEmployee = new CommissionEmployee("Olaide", "Olaniyan","58473", 593.1,0.4);
		basePlusCommissionEmployee = new BasePlusCommissionEmployee("Ojeniran", "Adaeze", "30943",685.43, 0.46, 5493);
			
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void getEachClassPolymorphicallyTest() {
		
		assertEquals(0,hourlyEmployee.getHours());
		
		Payable[] payableObjects = new Payable[6];
		hourlyEmployee.setHours(6);
		
		assertEquals(6,hourlyEmployee.getHours());
		
		hourlyEmployee.setWage(0.91);
		
		assertEquals(0.91,hourlyEmployee.getWage());
		
		payableObjects[0] =  commissionEmployee;
		payableObjects[1] = invoice1;
		payableObjects[2] = invoice2;
		payableObjects[3] = hourlyEmployee;
		payableObjects[4] = salariedEmployee;
		payableObjects[5] = basePlusCommissionEmployee;
		
		for(Payable payment : payableObjects) {
			System.out.println(payment);
			
			if(payment instanceof BasePlusCommissionEmployee) {
				
				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) payment;
				
				employee.setBaseSalary(1.10 * employee.getBaseSalary());
				
				System.out.printf("new base salary with 10%% increase is: $%,.2f%n",
						employee.getBaseSalary());
			}
			
			System.out.printf("Payment amount $%,.2f%n%n", payment.getPaymentAmount());
		}
		
		for(int j = 0; j < payableObjects.length; j++) {
			System.out.printf("Employee %d is a %s%n", j, payableObjects[j].getClass().getName());
		}
		
	}

}
