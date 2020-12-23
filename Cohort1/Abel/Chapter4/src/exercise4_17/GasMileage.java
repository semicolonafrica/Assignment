package exercise4_17;
    import java.util.Scanner;
	public class GasMileage {

		public int getMileage() {
					
			Scanner input = new Scanner(System.in);
				   double millTotal = 0;
				   double total = 0;
				    int counter = 0; 
				   
				    while(counter != -1){
				        System.out.println("Enter millage driven");
				        int mill = input.nextInt();
				        System.out.println("Enter gas used ");
				        int gas = input.nextInt();
				        millTotal = (double)mill/gas;
				        total = millTotal + total;
				        counter++;
				          System.out.println("Enter -1 to quit");
				         counter = input.nextInt(); 
				         
				       
				    
			         input.close();
				    System.out.println("total tripe is "+total); 
				}
				    return (int) total;
		}
	}


