package exercise5_30;

public class ModifiedAutoPolicyTest {
	public static void main(String[] args) {
	// create two AutoPolicy objects
	ModifiedAutoPolicy policy1 =
	new ModifiedAutoPolicy(11111111, "Toyota Camry", "NJ");
	 ModifiedAutoPolicy policy2 =
	 new ModifiedAutoPolicy(22222222, "Ford Fusion", "ME");
	
	 // display whether each policy is in a no-fault state
	 policyInNoFaultState(policy1);
	 policyInNoFaultState(policy2);
	 }
	
	 // method that displays whether an AutoPolicy
	 // is in a state with no-fault auto insurance
	 public static void policyInNoFaultState(ModifiedAutoPolicy policy) {
	 System.out.println("The auto policy:");
	 System.out.printf("Account #: %d; Car: %s;%nState %s %s a no-fault state%n%n",
	 policy.getAccountNumber(), policy.getMakeAndModel(),policy.getState(),(policy.isNoFaultState() ? "is": "is not"));
	 }
	 }
