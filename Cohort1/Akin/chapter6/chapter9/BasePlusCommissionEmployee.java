package chapter9;

public class BasePlusCommissionEmployee {

		private CommissionEmployee staff; 
	    private double baseSalary;

	    

	      public CommissionEmployee getStaff() {
			return staff;
		}

		public void setStaff(CommissionEmployee staff) {
			this.staff = staff;
		}

		public void setBaseSalary(double baseSalary) {
			this.baseSalary = baseSalary;
		}

		public double getBaseSalary()
	      {
	          return baseSalary;
	      }

	      public double earnings(CommissionEmployee newStaff)
	      {
	          //return baseSalary + (commissionRate * grossSales);
	          return getBaseSalary() + (newStaff.getCommissionRate() * newStaff.getGrossSales());
	      }

	      @Override
	      public String toString()
	      {
	          return String.format(
	           "%s%n%s: %.2f%n%s: %.2f%n%n",staff.toString(),"Salary: ", getBaseSalary(),"Earning Plus Salary: ",earnings(staff));
	      }
	}

