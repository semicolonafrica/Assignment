package chapter5.exercise518;

public class CompountInterest {

	public static void main(String[] args) {
		int compoundInterest2 = 0;
		int compoundInterest = 0;
		int amount2 = 0;
		int amount = 0;
        int principal = 1000;
        //int rate =  5;
        double rate = 0.05;
        int year;
        for (year =1; year <= 10; year++){
            amount = (int)(principal * Math.pow(1 +  rate , year));
            //amount = principal * factor2;
            compoundInterest = amount - principal;
            amount2 = amount * 100;
            compoundInterest2 = compoundInterest *100;
            System.out.println("Amount in year " + year + ": " + amount + " & C.I: " + compoundInterest);
        }
        System.out.println("Total amount after: " + (year-1) + " years is "+ amount + " & " + amount2);
        System.out.println("Total amount after: " + (year-1) + " years is "+ compoundInterest + " & " + compoundInterest2);

	}

}
