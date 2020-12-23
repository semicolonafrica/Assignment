package exercise5_30;

public class AutoPolicyMod {
		private int accountNumber;
		private String makeAndModel;
		private String state;

			public AutoPolicyMod(int accountNumber, String makeAndModel, String state) {
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
			if(("Massachusetts" == "MA") || ("New Jersey"=="NJ")||("New York"=="NY")||("Pennysylvania"=="PA")) {
				 noFaultState = true;
			}
			else {
				noFaultState = false;
				System.out.println("invalid State Code");
			}
				
//			break;
//			default:
//				noFaultState = false;
//			break;
			
			
			return noFaultState;
		}
}
