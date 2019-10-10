package exercise9_10;

public class PieceWorker extends  Employee {
	
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public PieceWorker(String firstName,String lastName,String socialSecurityNumber,int age) {
		
		super( firstName,lastName, socialSecurityNumber);
		
	}
		public String toString() {
			return String.format("%sn%s", super.toString());
		}
	
	
}
