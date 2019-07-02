import java.util.Scanner;

public class CreditLimitCalculator{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter account number: ");
        int accountNumber = input.nextInt();
        
        System.out.println("Enter account entry balance: ");
        int entryBalance = input.nextInt();

        System.out.println("Enter total items charged ");
        int itemsCharge = input.nextInt();

        System.out.println("Enter total credit applied to customer: ");
        int appliedCredit = input.nextInt();

        System.out.println("Enter allowed credit: ");
        int allowedCredit = input.nextInt();

        int newBalance = entryBalance + itemsCharge - appliedCredit;

        System.out.println("New Balance for account number " + accountNumber + " is " + newBalance);

        if(newBalance > allowedCredit){
            System.out.println("Credit Limit Exceeded");
        }

       input.close(); 
    }
}