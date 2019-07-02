    import java.util.Scanner;
    public class SidesOfATriangle{

        public static int getSidesOfAtriangle() {
            String status = "";
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the first side of the Triangle: ");
            int a  = input.nextInt();

            System.out.print("Enter the second side of the Triangle: ");
            int b  = input.nextInt();

            System.out.print("Enter the third side of the Triangle: ");
            int c  = input.nextInt();

            if(a + b > c || b + c > a || a + c > b){
              
               System.out.print("The sides represent a side of a Triangle.");
                
            }
            else{
                System.out.print("NONE!!!");
            }
         return a+b;
        }

        public static void main(String[] args) {
            System.out.print(SidesOfATriangle.getSidesOfAtriangle());
        }
    }