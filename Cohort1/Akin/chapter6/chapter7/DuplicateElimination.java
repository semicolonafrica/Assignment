package chapter7;

import java.util.Scanner;

public class DuplicateElimination {
	public static Scanner input = new Scanner(System.in);
	public static void duplicate() {
		
		int[] freq = new int[5];
		int count = 0;
		String store = "";
		System.out.printf("%6s","Enter number and \ncompare with the \nsecond number");
		int w = input.nextInt(); 
		
		for(int i = 1; i < freq.length; i++) {
			if(freq[i] != w) {
				System.out.print(w);
			}else {
				continue;
			}
			freq[i] = input.nextInt();
			
			if(w != freq[i]) {
				if(freq[i] == freq[i + 1] && freq[i] == 0) {
					continue;
				}else {
					{
					store = store + " " + freq[i];	
				}
				}
			}		
			System.out.printf("%n%s ",store);
			}
		//System.out.print(w);
		}		
	
	
	public static void main(String[] args) {
		duplicate();
	}
}
