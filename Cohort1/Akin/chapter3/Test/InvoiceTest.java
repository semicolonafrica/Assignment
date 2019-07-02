package chapter3.exercise312;
import java.util.Scanner;
public class InvoiceTest {


    public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);


	        System.out.print("Enter number: ");
	        String type = input.nextLine();

	        Invoice hard_drive = new Invoice(type,"It has 500gb space",5,10_000.0);

	            hard_drive.setInvoiceAmount(5,10_000.0);

	        System.out.format("My hard drive has a part number: %s, %s. I request %d for my business. Each cost %f. The total Invoice amount is %f",hard_drive.getNumber(),hard_drive.getDescription(),hard_drive.getQuantity(),hard_drive.getPrice(),hard_drive.getInvoiceAmount());
	    input.close();
	    }
	}

