package exercise9_3;

public class BasePlusCommissionEmployeeTest {

	public static void main(String[] args) {
		CommissionEmployee newStaff = new CommissionEmployee("nimot","imran","svc100",5.0,1.0);
		BasePlusCommissionEmployee exStaff = new BasePlusCommissionEmployee(5.0);
		System.out.println();
		exStaff.setStaff(newStaff);
		System.out.println(exStaff.earning());

	}

}
