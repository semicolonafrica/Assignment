package examples;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {98,75 , 64, 87, 85,92,78,84,83,98,98,45,0,34,};
		int total = 0;
		for(int counter =0; counter<array.length; counter++) {
			total = total + array[counter];
			System.out.println(total);
		}
	}

}
