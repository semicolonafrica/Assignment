package figure7;

public class PassArray {
	
	
	public static void modifyArray(int[] arrays) {
		for(int count = 0;count < arrays.length;count++) {
			arrays[count]*=2;
			//System.out.println(count + ""+ arrays[count]);
		}
		
		
	}
	
	
//	public static void modifyStringArray(String[] arrays) {
//		for(int count = 0;count < arrays.length;count++) {
//			arrays[count]="newName";
//			//System.out.println(count + ""+ arrays[count]);
//		}
//		
//		
//	}
	
	public static void modifyElement(String element) {
		element="Wendy";
		System.out.printf("Array element value: %s%n", element);
	}
	
	public static void modifyElement(int element) {
		element*=2;
		System.out.printf("Array element value: %d%n", element);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2,3,1,4};
		String [] names = {"Kunle","Lekan","Wale","Hannah"};
		
		for(String value : names)
			System.out.printf("Names before modification: %s%n ",value);
		System.out.printf("Name element before modification: %s%n", names[2]);
		modifyElement(names[2]);
		for(String value : names)
			System.out.printf("Names after modification: %s%n ",value);
		System.out.printf("Name element after modification: %s", names[2]);
		
		System.out.println();
		for(int value : array)
			System.out.printf("Array before modification: %d%n ",value);
		
		modifyArray(array);
		for(int value : array)
			System.out.printf("Array after modification: %d%n",value);
		System.out.printf("Array element before modification: %d%n", array[2]);
		modifyElement(array[2]);
		System.out.printf("Array element after modification: %d", array[2]);
		
	
	}
}
