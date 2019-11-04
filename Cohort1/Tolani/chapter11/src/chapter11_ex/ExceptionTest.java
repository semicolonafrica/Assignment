package chapter11_ex;

public class ExceptionTest {
	
	
	public static void throwExceptionA() throws ExceptionA {
		try {
			throw new ExceptionB();
		}catch(ExceptionB exceptionA) {
			System.err.println("Exception for type A");
			throw exceptionA;
		}
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			throwExceptionA();
		}
		catch(Exception exceptionA) {
			
		}

	}

}
