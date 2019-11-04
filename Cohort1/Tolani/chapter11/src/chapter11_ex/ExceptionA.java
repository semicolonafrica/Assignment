package chapter11_ex;

public class ExceptionA extends Exception {
	
	public ExceptionA() {
		super("Exception of type A");
	}
	
	public ExceptionA(String message) {
		super(message);
	}
	
	public ExceptionA(String message,Throwable throwable) {
		super(message,throwable);
	}
	
	public ExceptionA(Throwable throwable) {
		super(throwable);
	}

}
