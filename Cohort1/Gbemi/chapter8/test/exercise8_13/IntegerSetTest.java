package exercise8_13;

public class IntegerSetTest {

	public static void main(String[] args) {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		
		
		for(int i =1; i<=30;i++) {
			if(i % 2 == 0)
				set1.insert(i);
			if(i % 4 == 0)
				set2.insert(i);
		
		}
		
		
			
		
		
		System.out.printf("%s%n%s%n",set1, set2);
		IntegerSet.setUnion(set1, set2);
		
		IntegerSet.setIntersection(set1,set2);
		
		
		
		

	}

}
