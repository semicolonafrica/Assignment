package muscleBuilder;

import java.util.Scanner;

//Fig. 7.8: StudentPoll.java
//Poll analysis program.

public class Frequency {
public static void getPoll(int[] x) {
//student response array (more typically, input at runtime)
//int[] responses = 
//{1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
int[] frequency = new int[6]; // array of frequency counters

//for each answer, select responses element and use that value
//as frequency index to determine element to increment
for (int answer = 0; answer < x.length; answer++) {
try {
++frequency[x[answer]];
}
catch (ArrayIndexOutOfBoundsException e) {
System.out.println(e); // invokes toString method
System.out.printf(" responses[%d] = %d%n%n",
answer, x[answer]);
}
}

System.out.printf("%s%10s%n", "Rating", "Frequency");

//output each array element's value
for (int rating = 1; rating < frequency.length; rating++) {
System.out.printf("%6d%10d%n", rating, frequency[rating]);
}
}

public static void main(String[] args) {
	Scanner input = new  Scanner(System.in);
	int number;
	
	int[] dami = new int[20];
	
	for(int i = 0; i < dami.length; i++) {
	System.out.print("Enter number");
	number = input.nextInt();
	
	dami[i] = number;
	}
	Frequency.getPoll(dami);
}
}