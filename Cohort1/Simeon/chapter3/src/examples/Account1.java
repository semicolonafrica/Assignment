package examples;
/**
 * Account class that contains a name instance variable
 * and methods to set and get its value.
 * 
 * @author Simeon
 */

public class Account1 {

	// main method begins execution of java Application
	private String name; // instance Variable

	// constructor initializes name with parameter name
	public Account1(String name) { // constructor name is class name
		
		this.name = name;
	} // end constructor Account1
	
	// method to set the name in the object
	public void setName(String name) {
		
		this.name = name; // store the name
			
	} // end method setName
			
	// method to retrieve the name from the object
	public String getName() {
			
		return name; // return value of name to caller
			
	} // end method getName
		

}
