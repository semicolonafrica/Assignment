import java.util.Scanner;

public class Mileage{

    public double calculateMileage(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of trips");
        int trip = input.nextInt();

        int miles = 0;
        int gallon = 0;
        double average = 0;
        double milesPerGallon = 0;
        double total = 0;
        int counter = 1;
        

        while(counter <= trip){

            total += milesPerGallon;
            counter++;

            if(miles ==-1 && gallon == -1){
                break;
            }
            System.out.println("Enter miles, or -1 to stop trip");
            miles = input.nextInt();

            System.out.println("Enter gallon, or -1 to stop trip");
            gallon = input.nextInt();

            milesPerGallon = miles/gallon;
            System.out.println(milesPerGallon);

        

        }
        
        average = total/counter;
        return average;
    }
}