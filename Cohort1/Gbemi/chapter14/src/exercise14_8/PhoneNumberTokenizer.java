package exercise14_8;

import java.util.StringTokenizer;

public class PhoneNumberTokenizer {
	
	private String phoneNumber;
	private String[] otherNumbers;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	public String[] getOtherNumbers() {
		return otherNumbers;
	}

//	public String getAreaCode() {
//		StringTokenizer tokenizer = new StringTokenizer(this.getPhoneNumber(),"");
//		String areaCode = tokenizer.nextToken();
//		String regex ="[^0-9]";
//		
//		String[] result = areaCode.split(regex);
//		
//		StringBuilder theResult = new StringBuilder();
//		
//		for(String number: result) {
//			theResult.append(number);
//		}
//		
//	}

}
