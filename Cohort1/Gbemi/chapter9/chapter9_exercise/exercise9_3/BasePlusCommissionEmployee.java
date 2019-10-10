/**
 * 
 */
package exercise9_3;

/**
 * @author User
 *
 */
public class BasePlusCommissionEmployee {
	CommissionEmployee staff;
	private double baseSalary;
	
	public CommissionEmployee getStaff() {
		return staff;
	}


	public void setStaff(CommissionEmployee staff) {
		this.staff = staff;
	}

	
	
	public double getBaseSalary() {
		return baseSalary;
	}


	public void setBaseSalary(double baseSalary) {
		
		if(baseSalary<0.0) {
			throw new IllegalArgumentException("value must not be less than 0");
		}
		this.baseSalary = baseSalary;
	}


	public BasePlusCommissionEmployee(double baseSalary) {
		
		this.baseSalary=baseSalary;
		
	}
	
	public double earning() {
		return staff.earning()+getBaseSalary();
	}
	
	@Override
	public String toString() {
		return String.format("%s %s%n%s: %.2f", "base-salaried",
				getStaff().toString(), "base salary", getBaseSalary());
	}

}
