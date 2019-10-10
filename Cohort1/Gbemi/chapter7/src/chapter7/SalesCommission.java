/**
 * 
 */
package chapter7;

/**
 * @author gbemi
 * 
 * (Sales Commissions) Use a one-dimensional array to solve the following problem: A company
pays its salespeople on a commission basis. The salespeople receive $200 per week plus 9% of
their gross sales for that week. For example, a salesperson who grosses $5,000 in sales in a week receives
$200 plus 9% of $5,000, or a total of $650. Write an application (using an array of counters)
that determines how many of the salespeople earned salaries in each of the following ranges (assume
that each salesperson’s salary is truncated to an integer amount):
a) $200–299
b) $300–399
c) $400–499
d) $500–599
e) $600–699
f) $700–799
g) $800–899
h) $900–999
i) $1,000 and over
Summarize the results in tabular format.
 *
 */
import java.security.SecureRandom;
public class SalesCommission {
	public static void printSales() {
		SecureRandom randomInput=new SecureRandom();
		int[] sales= {300,455,687,234,256,456,890,1000};
		int[] frequency= new int[10];
		for(int count=0;count<sales.length;count++) {
		 frequency[sales[count]]++;
		 if(count==10)
		 System.out.printf("%5d: ", 1000);
		 
		 else 
			  System.out.printf("%02d-%02d: ",count * 100, count * 100 + 99);
		 for(int i=2;i<frequency.length;i++)
			 System.out.print(frequency[i]);
		 System.out.println();
		 
	}
	}

	public static void main(String[] args) {
		printSales();
	}
}
