/**
 * 
 */
package exercise9_3;

/**
 * @author omotolani
 *
 */
public class Employee {
	
	private String firstName;
	
	private String lastName;
	
	private String socialSecurityNumber;
	
	private double grossSales;
	
	private EmployeeType employeeType = EmployeeType.COMM;
	
	private CommissionEmployee commissionEmployee;
	
	public Employee() {
		
	}
	
	
	
	public Employee(String firstName,String lastName,String socialSecurityNumber,double grossSales) {
		
		
		if(grossSales < 0.0) {
			throw new IllegalArgumentException("Gross Sales should be greater than 0");
		}
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
	}
	/**
	 * @return the commissionEmployee
	 */
	public CommissionEmployee getCommissionEmployee() {
		return commissionEmployee;
	}

	/**
	 * @param commissionEmployee the commissionEmployee to set
	 */
	public void setCommissionEmployee(CommissionEmployee commissionEmployee) {
		this.commissionEmployee = commissionEmployee;
	}
	
	double getGrossSales() {
		return grossSales;
	}

	/**
	 * @param grossSales the grossSales to set
	 */
	public void setGrossSales(double grossSales) {

		if(grossSales < 0.0) {
			throw new IllegalArgumentException("Gross Sales should be greater than 0");
		}
		
		this.grossSales = grossSales;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the socialSecurityNumber
	 */
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	/**
	 * @param socialSecurityNumber the socialSecurityNumber to set
	 */
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	/**
	 * @return the employeeType
	 */
	public EmployeeType getEmployeeType() {
		return employeeType;
	}



	/**
	 * @param employeeType the employeeType to set
	 */
	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}



	public double getEarning() {
		double earning = 0;
		
		if(employeeType == EmployeeType.COMM) {
			earning = getGrossSales() * getCommissionEmployee().getCommissionRate();
			System.out.println(earning);
		}
		if(employeeType == EmployeeType.BASEPLUS) {
			double baseSalary = getCommissionEmployee().getBasePlusCommission().getBaseSalary();
			earning =  baseSalary + (getGrossSales() * getCommissionEmployee().getCommissionRate());
			System.out.println(earning);
		}
		return earning;
	}

}
