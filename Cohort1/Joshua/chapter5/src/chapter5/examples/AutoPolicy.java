/**
 * 
 */
package chapter5.examples;

/**Fig. 5.11: AutoPolicy.java
 * class that represent an auto insurance policy
 * @author user
 *
 */
public class AutoPolicy {
	
	private int accountNumber; // policy account number
	private String makeAndModel;//car that the policy apply to
	private String state; //two letter state abbreviation
	
	// constructor
	public AutoPolicy(int accountNumber, String makeAndModel, String state) {
		
		this.accountNumber = accountNumber;
		this.makeAndModel = makeAndModel;
		this.state = state;
		
	}
	//returns account number
	public int getAccountNumber() {
		return accountNumber;
	}
	
	// set account number
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	// returns make and model
	public String getMakeAndModel() {
		return makeAndModel;
	}

	// set make and model
	public void setMakeAnfModel(String makeAndModel) {
		this.makeAndModel = makeAndModel;
	}

	// returns state
	public String getState() {
		return state;
	}

	// set state
	public void setState(String state) {
		this.state = state;
	}
	
	//predicate method returns whether the state has no-fault insurance
	public boolean isNoFaultState() {
		boolean noFaultState;
		
		//determine whether the state has no fault auto insurance
		
		switch(getState()) { //get AutoPolicy onject's state abbreviation
		case "MA": case "NJ": case "NY": case "PA":
			noFaultState = true;
			break;
			default:
				noFaultState = false;
				break;
		}
		return noFaultState;
	}

}
