package exampleForLoop;

public class AutoPolicy {
	private int accountNumber;
	private String makeAndModel;
	private String state;

		public AutoPolicy(int accountNumber, String makeAndModel, String state) {
			super();
			this.accountNumber = accountNumber;
			this.makeAndModel = makeAndModel;
			this.state = state;
		}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getMakeAndModel() {
		return makeAndModel;
	}
	public void setMakeAndModel(String makeAndModel) {
		this.makeAndModel = makeAndModel;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public boolean isNoFaultState() {
		boolean noFaultState;
		switch (getState()){
		case "MA":case "NJ":case "NY":
		case "PA":
			 noFaultState = true;
		break;
		default:
			noFaultState = false;
		break;
		}
		
		return noFaultState;
	}
	
}
