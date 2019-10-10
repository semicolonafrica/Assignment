package chapter11;

public class UsingException {
	
	public static void main(String[]args) {
		try {
			throwException();
		}
		catch (Exception exception) {
			System.err.println("Exception handled in the main method");
			
		}
		doesNotThrowException();
	}
	
	
	public static void throwException() throws Exception{
		try {
			System.out.println("Method throwException");
			throw new Exception();
		}
		
		catch(Exception exception) {
			
			System.err.println("Exception handled in method throwException");
			throw exception;
		}
		
		finally {
			System.err.println("finally executed in throwException");
			
		}
	}
		
		
		public static void doesNotThrowException(){
			try {
				System.out.println("Method doesNotThrowException");
			}
			catch(Exception exception) {
				System.err.println(exception);
			}
			finally {
				System.err.println("finally excetuted in doesNotThrowException");
			}
			System.out.println("end of method doesNotThrowException");
		}
		
		
	}


