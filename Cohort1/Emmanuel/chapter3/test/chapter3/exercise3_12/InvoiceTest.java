/**
 * 
 */
package chapter3.exercise3_12;

/**
 * @author Emmanuel Akinbode
 *
 */
public class InvoiceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		       // Scanner input = new Scanner(System.in);

		       // System.out.print("Enter Amount: ");

		       Invoice detail = new Invoice("xpe102", "Ac cooler", 20, 20.45);
		       Invoice gen = new Invoice("xpe102", "Ac cooler", -20, -20.45);

		       System.out.println(detail.getInvoice());
		       System.out.println(gen.getInvoice());
		       System.out.println(detail.getPartNumber() + " " + detail.getDescription() + " " + detail.getPQuantity() + " " + detail.getPrice());
		       System.out.println(gen.getPartNumber() + " " + gen.getDescription() + " " + gen.getPQuantity() + " " + gen.getPrice());
		    }
		

	}


