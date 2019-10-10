package fileMatching;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

import fig15_3.Account;

public class FileMatch {
	
	
	private  Scanner inTransaction;
	
	private  Scanner inOldmaster;
	
	Account acct;
	
	
	public void openTransFile() {
		try {
		 inTransaction = new Scanner(Paths.get("trans.txt"));
		}
		catch(IOException e){
			System.err.println("Error opening file!!");
		}
		
	}
	
	
	public void readTransFile() {
		
		try {
				while(inTransaction.hasNext()) {
					TransactionRecord transaction = new TransactionRecord(inTransaction.nextInt(),inTransaction.nextDouble());
					
					System.out.printf("%d %.2f%n", transaction.getAcctNo(),
							transaction.getAmount());
				}
		}
		
		catch(NoSuchElementException e) {
			System.err.println("file improperly formed!!!");
		}
		
		catch(IllegalStateException e) {
			System.err.println("error reading from file!!!");
		}
	}
	
	public void closeTransFile() {
		if(inTransaction != null)
			inTransaction.close();
	}
	
	
	public void openOldMastFile() {
		try {
			inOldmaster = new Scanner(Paths.get("oldmast.txt"));
			
		}
		catch(IOException e) {
			System.err.println("File not Found!!!");
			
		}
	}
	
	public void readOldMastFile() {
		
		System.out.printf("%-12s%-10s%-10s%-10s%n", "Account Number","FirstName","LastName","Balance");
		try {
				while(inOldmaster.hasNext()) {
				
					acct = new Account(inOldmaster.nextInt(),inOldmaster.next(),inOldmaster.next(),inOldmaster.nextDouble());
					System.out.printf("%-12d%-10s%-10s%10.2f%n",acct.getAccountNumber(),acct.getFirstName(),acct.getLastName(),acct.getBalance()   );
			
				}
		}
		
		catch(NoSuchElementException ex) {
				System.err.println("File improperly formed!!!");
			}
		catch  (IllegalStateException e) {
				System.err.println("error opening file");
			}
	}
	
	
		public void closeOldMastFile() {
				if(inTransaction!=null)
					inTransaction.close();
		
		}


			String t ="C:"+ File.separator+"Users"+ File.separator+"User"+ File.separator+
					"Desktop"+ File.separator+"Assignment"+ File.separator+
					"Cohort1"+ File.separator+"Gbemi"+ File.separator+
					"chapter15"+ File.separator+"trans.txt";
			
			String o = "C:"+ File.separator+"Users"+ File.separator+"User"+ File.separator+
					"Desktop"+ File.separator+"Assignment"+ File.separator+
					"Cohort1"+ File.separator+"Gbemi"+ File.separator+
					"chapter15"+ File.separator+"oldmast.txt";
			
			String n ="C:"+ File.separator+"Users"+ File.separator+"User"+ File.separator+
					"Desktop"+ File.separator+"Assignment"+ File.separator+
					"Cohort1"+ File.separator+"Gbemi"+
					File.separator+"chapter15"+ File.separator+"mast.txt";
			
			
	public void matchFile() {
		try(Formatter outNewmaster = new Formatter(n);
			Scanner inTransaction = new Scanner(Paths.get(t));
				Scanner inOldmaster = new Scanner(Paths.get(o))){
				
				
			TransactionRecord trans = new TransactionRecord(inTransaction.nextInt(),inTransaction.nextDouble());
			acct = new Account(inOldmaster.nextInt(),inOldmaster.next(),inOldmaster.next(),inOldmaster.nextDouble());

		 
		 		if(trans.getAcctNo() == acct.getAccountNumber()) {
			
		 				outNewmaster.format("%d %s %s %.2f%n", acct.getAccountNumber(), acct.getFirstName(),
		 					acct.getLastName(), acct.combine(trans));
		
					}
			}
		catch(IOException e) {
				System.err.println("error opening file!!!");
				}
		
	}
}
