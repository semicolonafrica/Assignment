package copyArray;


//Copy 11-element array a into the first portion of array b , which contains 34 elements.

public class ArrayCopy {
	public static void main(String args[]) {
		
		int[] arrayA = {1,2,3,4,5,6,7,8,9,10,11};
		int[] arrayB = {34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,9,8,7,6,5,4,3,2,1};
		
//		int a;
//		int b=0;
//		for(a = 0; a < arrayA.length; a++) {
//			for(b = 0; b <=11; b++) {
//				arrayB[b] = arrayA[a];
//				
//			}
//			
//		}
//		for(int i=0; i < arrayB.length; i++) {
//			for(int j=; j< arrayA.length; j++) {
//				arrayB[i] = arrayA[j];
//				System.out.printf("%s%n", arrayB[j]);
//			}
//			
//		}
		
		//for every element in arrayA, assign arrayB the value of that element
		for(int i = 0; i < arrayA.length; i++) {
			arrayB[i] = arrayA[i];
		}
		
		//display arrayB
		for(int i =0; i < arrayB.length; i++) {
		System.out.printf("%s%n", arrayB[i]);
		}
		
		
	}

}
