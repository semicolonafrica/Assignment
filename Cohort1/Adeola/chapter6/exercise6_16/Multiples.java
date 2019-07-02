package exercise6_16;

public class Multiples {
	static enum Condition{TRUE, FALSE};
	static Condition a =  Condition.TRUE;
	static Condition b =  Condition.FALSE;
	
	
	public static boolean isMultiple(int num, int multiple) {
		if(multiple%num==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static Condition isMultiple1(int num, int multiple) {
		
		if(multiple%num==0) {
			return a;
		}
		else {
			return b;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isMultiple(2,8));
		System.out.println(isMultiple(2,7));
		System.out.println(isMultiple(2,2));
		System.out.println(isMultiple(3,8));
		System.out.println(isMultiple(3,9));
		System.out.println(isMultiple(25,15));
		
		System.out.println(isMultiple1(2,8));
		System.out.println(isMultiple1(2,7));
		System.out.println(isMultiple1(2,2));
		System.out.println(isMultiple1(3,8));
		System.out.println(isMultiple1(3,9));
		System.out.println(isMultiple1(25,15));
	}
}
