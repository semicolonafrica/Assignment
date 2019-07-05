package chapter7.exercise7_10;

//Use a one-dimensional array to solve the
//following problem: A company pays its salespeople on a commission
//basis. The salespeople receive $200 per week plus 9% of their gross sales
//for that week. For example, a salesperson who grosses $5,000 in sales in a
//week receives $200 plus 9% of $5,000, or a total of $650. Write an
//application (using an array of counters) that determines how many of the
//salespeople earned salaries in each of the following ranges (assume that
//each salesperson’s salary is truncated to an integer amount):
import java.security.SecureRandom;
public class SalesCommission {
	
	public static void main(String [] args) { 
			double comission =  0.09;
//	    public static void main(String [] args) { 
//
//	        int [] c = { 200,300,400,500,600,700,800,900};
//
//	        for(int count = 0; count < c.length; count++) { 
//	        System.out.println(c[count]);
//	        }
//	        
//	        for(int counter = 0; counter < c.length; counter++){  
//	            System.out.println(c[counter] += 99);
//	        }
	         
		SecureRandom randomNumbers = new SecureRandom();
		
			int random = 200 + randomNumbers.nextInt(900);
			
			int [] salary = new int [900];
			
			System.out.println("The gross salary of each employee are:");
	
			for(int counter = 0; counter < salary.length; counter++) {
				random = (int) (random + 100*comission);
				System.out.println(salary [counter]= random);
			}

	        }

	    }
	    


