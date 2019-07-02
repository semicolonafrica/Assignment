/**

 * 
 */

package chapter4.exercise417;

import java.util.Scanner;
/**
 * @author user
 *
 */
public class GasMileage {

	private double mile;
	private int gallon;
	
	

	public double getMile() {
		return mile;
	}


	/**
	 * @param mile the mile to set
	 */
	public void setMile(double mile) {
		this.mile = mile;
	}


	/**
	 * @return the gallon
	 */
	public int getGallon() {
		return gallon;
	}


	/**
	 * @param gallon the gallon to set
	 */
	public void setGallon(int gallon) {
		this.gallon = gallon;
	}


	public void getTotalMilePerTotalGallon() {
		double mile;
		int gallon;
		int tripNo = 1;
		double totalMile = 0;
		int totalGallon = 0;
		double mile_per_gallon = 0;
		double totalMilePerTotalGallon;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter mile and grade, Type the end-of-line to terminate input"
				+ ".\n Type Ctrl Z to terminate.");
				
		while(input.hasNext()) {
			
            mile = input.nextDouble();


            gallon = input.nextInt();

	            mile_per_gallon = (double)(mile / gallon);

	            System.out.print(mile_per_gallon);
	            System.out.print("\n");
	            totalMile = totalMile + mile;
	            totalGallon = totalGallon + gallon;
	            tripNo++;
		}
		if(tripNo != 0) {
		
		totalMilePerTotalGallon = (double) totalMile / totalGallon;
			System.out.print(totalMilePerTotalGallon);
		}
		else {
			System.out.print("No trip entered, try again!!!");
		}
		

}
	//input.close();
}
