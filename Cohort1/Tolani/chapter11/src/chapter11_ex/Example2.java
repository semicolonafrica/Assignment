package chapter11_ex;

public class Example2 {
	
	
	public static void throwException() throws Exception {
		
		try {
			System.out.println("Method throwException");
			throw new Exception();
		}
		catch(Exception exception) {
			System.err.println("Exception handled in method throwException");
			throw exception;
		}
		finally {
			System.err.println("Finally in throw exception");
		}
	}

	public static void doesnotthrowException() {
		
		try {
			System.out.println("Method does not throwException");
	
		}
		catch(Exception exception) {
			System.err.println("Exception handled in method does not throwException");
			throw exception;
		}
		finally {
			System.err.println("Finally in does not throw exception");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			throwException();
		}catch(Exception exception) {
			System.err.println("Exception handling in main");
		}
		
		doesnotthrowException();
	}

}
