package chapter11_ex;

public class ExceptionB extends ExceptionA {

	public ExceptionB() {
		super("Exception of type B");
	}
	
	public ExceptionB(String message) {
		super(message);
	}
	
	public ExceptionB(String message,Throwable throwable) {
		super(message,throwable);
	}
	
	public ExceptionB(Throwable throwable) {
		super(throwable);
	}
}
