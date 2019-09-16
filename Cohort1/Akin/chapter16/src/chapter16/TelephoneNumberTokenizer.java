package chapter16;
import java.util.StringTokenizer;

public class TelephoneNumberTokenizer {
	
	private String telephoneNumber;

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	
	public String getAreaCode() {
		StringTokenizer tokenizer = new StringTokenizer(this.getTelephoneNumber()," ");
		String areaCode = tokenizer.nextToken();
//		areaCode = areaCode.substring(1, areaCode.length() - 1);
		String regex = "[^0-9]";
		
		String[] result = areaCode.split(regex);
		StringBuilder theResult = new StringBuilder();
		
		for(String number: result) {
			theResult.append(number);
		}
		
		return theResult.toString();
	}
	
	public String[] getOtherNumbers() {
		String middleNumber = " ";
		
		StringTokenizer tokenizer = new StringTokenizer(this.getTelephoneNumber()," ");
		
		middleNumber = tokenizer.nextToken();
		middleNumber = tokenizer.nextToken();
		
//		tokenizer = new StringTokenizer(middleNumber, "-");
//		middleNumber = tokenizer.nextToken();
		
		String[] middleNumbers = middleNumber.split("-");
		
		return middleNumbers;
	}
	
	
	
}
