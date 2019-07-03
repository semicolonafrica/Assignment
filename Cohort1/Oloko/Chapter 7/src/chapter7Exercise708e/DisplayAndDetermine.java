package chapter7Exercise708e;

public class DisplayAndDetermine {

public static void main(String[] args) { 
		
		int[] w = new int[100];
		
		for(int i = 0; i < w.length; i++) {
			
			w[i]=i;
			
		}
		
		int max = w[0];
		int min = w[0];
		
		for(int j = 0; j < w.length; j++) {
			
			if(w[j] < min)
				min = w[j];
			if(w[j] > max)
				max = w[j];

		}
		
		System.out.println(max);
		System.out.println(min);
	}
}


