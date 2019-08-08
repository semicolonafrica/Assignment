package exercise8_13;

import java.util.Arrays;

public class IntegerSet {
	
	private  boolean[] set;
	private static final int SIZE= 101;
	
	public IntegerSet() {
		
		set = new boolean[SIZE];
		Arrays.fill(set,false);
	}
	
	
	public  boolean[] getSet() {
		return set;
	}

	public  void setSet(boolean[] set) {
		this.set = set;
	}

	
	
	
	
	public  void insert(int index) {
		set[index]=true;
	}
	
	
	public  void delete(int index) {
		set[index]=false;
	}
	
	public static void setUnion(IntegerSet obj, IntegerSet obj2) {
		
		boolean[] newUnion = new boolean[101];
		System.out.println("the new arrayset of union of two set :");
		
		for(int i =0; i < SIZE; i++) {
			
			if(obj2.getSet()[i]==true||obj.getSet()[i]==true) {
				
				newUnion[i]=true;
				
			}
			
			else {
				
				newUnion[i]=false;
			}
			if(newUnion[i]==true) {
				System.out.print(" "+i);
			}
			
		}
		System.out.println();
		
	}
	
	
	public static void setIntersection(IntegerSet obj, IntegerSet obj2){
		System.out.println("the new arrayset of intersection of two set :");
		
		
		boolean[] newIntersect = new boolean[101];
		
		for(int i =0; i < SIZE; i++) {
			
			if(obj2.getSet()[i]==false || obj.getSet()[i]==false) {
				
				newIntersect[i]=false;	
			}
			else {
				newIntersect[i] = true;
				System.out.print(" "+i);
			}
				
			
		}
		System.out.println();
		
	}
	
	@Override
	public String toString() {
		
		String int_values= " ";
		
		for(int i= 0; i < SIZE; i++) {
			
			if(getSet()[i] == true) {
				int_values = int_values + " " + i;
			}
		}
		return int_values;
		
	}
}
