package chapter5.exercise518;

public class Autopolicy {
	
	private int accountNumber;
	private String makeAndModel;
	private String state;
	
	
	
	public Autopolicy(int accountNumber, String makeAndModel, String state) {
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
		if(state == "MA" || state == "NJ" || state == "NY" || state == "PA" || state == "CT" || state == "VT" || state == "ME" || state == "NH") {
			this.state = state;
		}else {
			System.out.print("Error, Try another code!!!");
		}
		
	}
	 
	//predicate method returns whether the car has no-fault state insurance
	public boolean isNoFaultState() {
		
		boolean noFaultState;
		
		switch(getState()) {
		case "MA": case "NJ": case "NY": case "PA": case "CT": case "VT": case "ME": case "NH": 
			noFaultState = true;
			break;
			default:
			noFaultState = false;
			break;
		}
		return noFaultState;
	}
	
}
