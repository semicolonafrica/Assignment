package fileMatching;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

import fig15_3.Account;

public class TransactionRecord {
	private int acctNo;
	private double amount;
	private Formatter output;
	
	public TransactionRecord(int acctNo,double amount) {
		this.acctNo=acctNo;
		this.amount=amount;
	}
	
	public TransactionRecord() {
		// TODO Auto-generated constructor stub
	}

	public int getAcctNo() {
		return acctNo;
	}
	
	public void setAcctNo(int acctNo) {
		if(acctNo <=0) {
			throw new IllegalArgumentException("invalid input!!!");
		}
		this.acctNo = acctNo;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		if(acctNo <=0.0) {
			throw new IllegalArgumentException("invalid input!!!");
		}
		this.amount = amount;
	}
	
	public void openMyTransFile() {
		try {
			output = new Formatter ("trans.txt");
		}
		catch(IOException e) {
			System.err.println("Error open file!!!");
		}
	}
	
	
	
	public void addRecordMyTransFile() {
		Scanner input = new Scanner(System.in);
		System.out.printf("%s%n%s%n", "Enter account Number,Amount","Enter ctrlZ to end input");
		
		while(input.hasNext()) {
			try {
				output.format("%d %.2f%n", input.nextInt(),input.nextDouble());
				
			}
			catch(NoSuchElementException ex) {
				System.err.println("Invalid input.Please try again");
				input.nextLine();
			}
			
			
		}
	}
	
	
	public void closeMyTransFile() throws IOException {
		if(output!= null)
			output.close();
	}
	
}
