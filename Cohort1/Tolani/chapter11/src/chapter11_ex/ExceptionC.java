package chapter11_ex;

public class ExceptionC extends ExceptionB {
	
	public ExceptionC() {
		super("Exception of type A");
	}
	
	public ExceptionC(String message) {
		super(message);
	}
	
	public ExceptionC(String message,Throwable throwable) {
		super(message,throwable);
	}
	
	public ExceptionC(Throwable throwable) {
		super(throwable);
	}
	

}
