import java.util.Scanner;

public class GasMileage{
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        int mile = 0;
        int gallon = 0;
        int totalmile = 0;
        int totalgallon = 0;
        int counter = 0;

        

        while(mile != -1){

        System.out.println("Enetr mile used or enter -1 to exit: ");
        mile = input.nextInt();

        System.out.println("Enter gallon used or enter -1 to exit: ");
        gallon = input.nextInt();
            totalmile += mile; 
            totalgallon += gallon;

            counter++;

            System.out.println("Miles covered for trip " + counter + " is: " + mile + "miles");
            System.out.println("Gallon used for trip " + counter + " is: " + gallon + "litres");
                  
        } 
        if(mile == -1 && gallon == -1){

            //double average = (double) mile/gallon;
            double totalMilePerGallon = (double) totalmile/totalgallon;
            double totalAverageMilePerGallon = totalMilePerGallon/counter;

            System.out.println("Total mile covered for all the " + counter + " trips is " + (totalmile + 1) + "miles");
            System.out.println("Total gallon for all the " + counter + "  trips is " + (totalgallon + 1) + "litres");
            System.out.println();
            System.out.println("Total mile per gallon is "  +  totalMilePerGallon);
            System.out.println("Total average mile per gallon is " + totalAverageMilePerGallon);

        }
       input.close();       
    }
    
}