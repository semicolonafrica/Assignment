package chapter5.exercise518;

public class AutopolicyTest {

	public static void main(String[] args) {
		
		Autopolicy policy1 = new Autopolicy(111111111,"Toyota Camry", "NJ");
		Autopolicy policy2 = new Autopolicy(222222222, "Ford Fusion", "MD");		

		policyInNoFaultState(policy1);
		policyInNoFaultState(policy2);
		
	}
	
	public static void policyInNoFaultState(Autopolicy policy) {
		System.out.println("The auto policy:");
		System.out.printf("Account #: %d; Car: %s; State %s %s a no-fault state%n%n",
				policy.getAccountNumber(),policy.getMakeAndModel(),policy.getState(),(policy.isNoFaultState() ? "is" : "is not"));
	}

}
