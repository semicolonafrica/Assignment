package exercise14_21;
import java.util.Scanner;
public class ConvertDigitsToWord {
private  String number;
private String []token;

private String [] oneDigitWord= {"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"}; 

private String [] twoDigitWord= {"ZER0","TEN","ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN",};
private String [] threeDigitWord= {"ZER0","NINETEEN","TWENTY","THIRTY","FOURTY","FIFTY","SIXTY","SEVENTY","EIGHTY","NINETY"};

public  String getNumber() {
	return number;
}

public  void setNumber(String number) {
if(number.matches("\\d{1,3}.\\d\\d")){
	
	this.number = number;
	}
else {
	throw new IllegalArgumentException("Invalid Input!!!");
	}

}


public String[] getOneDigitWord() {
	return oneDigitWord;
}



public String[] getTwoDigitWord() {
	return twoDigitWord;
}



public String[] getThreeDigitWord() {
	return threeDigitWord;
}



public  String[] getToken() {
	return token;
}

public String getWord(String value) {
	int getDigit;
	StringBuilder wordDigit = new StringBuilder();
	
	 token = value.split("\\D");
	
	for(int x=0;x<token[0].length();x++) {
		
		getDigit = Integer.parseInt(Character.toString(value.charAt(x)));
		
			if(token[0].length()==3&& x==0) {
				
				wordDigit.append(getOneDigitWord()[getDigit]).append(" ")
															 .append("HUNDRED")
															 .append(" ");
				
			}
			else if(token[0].length()==3&& x==1) {
				
				wordDigit.append(getThreeDigitWord()[getDigit])
						 .append(" ");
				
			}
			else if(token[0].length()==3&& x==2) {
				
				wordDigit.append(getOneDigitWord()[getDigit])
						 .append(" ");
				
			}
			
			if(token[0].length()==2 && x==0) {
				
				wordDigit.append(getThreeDigitWord()[getDigit])
						 .append(" ");
				
			}
			else if(token[0].length()==2 && x==1) {
				
				wordDigit.append(getOneDigitWord()[getDigit])
						 .append(" ");
			}
			if(token[0].length()==1&& x==0) {
			
				wordDigit.append(getOneDigitWord()[getDigit])
				 .append(" ");
			}
		
	}
	
	
	
	
	wordDigit.append(token[1])
	.append("/100")
	.toString();
	
	System.out.println("result.." + wordDigit.toString());
	return wordDigit.toString();
}


}
