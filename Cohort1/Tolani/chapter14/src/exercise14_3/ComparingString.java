package exercise14_3;

public class ComparingString {
	
	private String firstInput;
	
	private String secondInput;
	
	
	public ComparingString(String first,String second) {
		this.firstInput = first;
		this.secondInput = second;
	}

	public String getFirstInput() {
		return firstInput;
	}

	public void setFirstInput(String firstInput) {
		this.firstInput = firstInput;
	}

	public String getSecondInput() {
		return secondInput;
	}

	public void setSecondInput(String secondInput) {
		this.secondInput = secondInput;
	}
	
	
	public boolean checkString() {
		
		if(getFirstInput().regionMatches(true,0,getSecondInput(),0,getFirstInput().length())) {
			return true;
		}
		else {
			return false;
		}
	}

}
