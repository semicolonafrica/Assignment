package exercise14_7;
import java.util.*;


public class PigLatin {
	StringBuilder myString;
	private String sen;
	public String getSen() {
		return sen;
	}
	public void setSen(String sen) {
		this.sen = sen;
	}
	static String token[];
	String latinWord ="ay";
	//Scanner input = new Scanner(System.in);
	public void splitWord(String newWord) {
	
	 token=newWord.split(" ");
	 
	}
	public String formLatinWord(String word) {
		
		myString = new StringBuilder(word);
		char firstLetter = myString.charAt(0);
		myString.deleteCharAt(0);
		myString.append(firstLetter)
		.append(latinWord);
		
		
		return myString.toString();
	}
	
	
	

}
