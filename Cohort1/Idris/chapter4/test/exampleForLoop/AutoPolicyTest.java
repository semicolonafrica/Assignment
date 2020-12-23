package exampleForLoop;

public class AutoPolicyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoPolicy policy1 = new AutoPolicy(11111111, "Toyota Cmart","NY");
		AutoPolicy policy2  = new AutoPolicy(22222,"Ford Furson","Delawares");
		
		policyInNoFaultState(policy1);
		policyInNoFaultState(policy2);
 }
		
		 // method that displays whether an AutoPolicy
		 // is in a state with no-fault auto insurance
		 public static void policyInNoFaultState(AutoPolicy policy) {
		 System.out.println("The auto policy:");
		 System.out.printf("Account #: %d; Car: %s;%nState %s %s a no-fault state%n%n",policy.getAccountNumber(), policy.getMakeAndModel(),policy.getState(),policy.isNoFaultState() ? "is": "is not");
		
	}

}
