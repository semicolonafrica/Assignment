package chapter5.exercise518;

import java.util.Scanner;

public class TaxPlanAlternative {

	
	private double fairTax;
	private String expense;
	public double getFairTax() {
		return fairTax;
	}
	public void setFairTax(double fairTax) {
		this.fairTax = fairTax;
	}
	public String getExpense() {
		return expense;
	}
	public void setExpense(String expense) {
		this.expense = expense;
	}

	public int calculatetaxOnAllExpenses() {
		
		Scanner input = new Scanner(System.in);
		int expenses = 0;
		int count = 1;
		double total = 0.0;
		
		System.out.println("Enter expense for housing: ");
		double housing = input.nextDouble();
		
		System.out.println("Enter expense for food: ");
		double food = input.nextDouble();
		
		System.out.println("Enter expense for clothing: ");
		double clothing = input.nextDouble();
		
		System.out.println("Enter expense for Transportation: ");
		double transportation = input.nextDouble();
		
		System.out.println("Enter expense for vacation: ");
		double vacation = input.nextDouble();
		
		System.out.println("Enter expense for education: ");
		double education = input.nextDouble();
		
		System.out.println("Enter expense for healthcare: ");
		double healthcare = input.nextDouble();
		
		
		System.out.println("Enter the rate: ");
		double percentRate = (double)(input.nextDouble() / 100);
		
		
		
		while(count <= 7) {
			switch(expenses) {
				case 1:
					total += percentRate * housing;
					System.out.print("The fairTax for housing: " + (percentRate * housing) + "\n");
					break;
				case 2:
					total+= percentRate * food;
					System.out.print("The fairTax for food: " + (percentRate * food) + "\n");
					break;
				case 3:
					total+= percentRate * clothing;
					System.out.print("The fairTax for clothing: " + (percentRate * clothing) + "\n");
					break;
				case 4:
					total+= percentRate * transportation;
					System.out.print("The fairTax for Transportation: " + (percentRate * transportation) + "\n");
					break;
				case 5:
					total+= percentRate * vacation;
					System.out.print("The fairTax for vacation: " + (percentRate * vacation) + "\n");
					break;
				case 6:
					total+= percentRate * education;
					System.out.print("The fairTax for education: " + (percentRate * education) + "\n");
					break;
				case 7:
					total+= percentRate * healthcare;
					System.out.print("The fairTax for healthcare: " + (percentRate * healthcare) + "\n");
					break;
			}

			count++; expenses++;
		}
		total = (percentRate * housing) + (percentRate * food) + (percentRate * clothing) + (percentRate * transportation) + 
				(percentRate * vacation) + (percentRate * education) + (percentRate * healthcare);
		System.out.printf("%n%nThe FairTax for all expenses is: %.2f%n" ,total);
		System.out.println();
		return (int) total;
	}
	
}
