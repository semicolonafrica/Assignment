package exercise14_10;
import java.util.*;
public class StringCase {
	
	String firstInput;
	String newCase="";
	public String getFirstInput() {
		return firstInput;
	}

	public void setFirstInput(String firstInput) {
		this.firstInput = firstInput;
	}
	
	public  void upperCase() {
		 newCase =firstInput.toUpperCase();
		 System.out.println( newCase);
	}
	
	public  void lowerCase() {
		 newCase = firstInput.toLowerCase();
		 System.out.print( newCase);
		
	}
	

}
