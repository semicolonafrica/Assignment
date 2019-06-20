package exercise523;

public class DeMorganLaws {


	    public void calmorganLaw(){
	        int x = 2;
	        int y = 4;
	        int a = 3;
	        int g = 7;
	        int i = 9;
	        int j = 1;
	        int b = 3;

	        if(!(x < 5) && !(y >= 5)){
	            System.out.println("case True");
	        } 
	            else{
	                System.out.println("False");
	            }
	        
	        if(!(a == b) || !(g != 5)){
	           System.out.println("true ");
	       }
	       else{
	           System.out.println("False");
	       }
	           if(!(x <= 8) && (y > 4)){
	               System.out.println("True");
	           }
	               else {
	                   System.out.println("False");
	               }
	               if(!(i > 4) || (j <= 6)){
	                   System.out.println("False");
	               }
	                else{
	                    System.out.println("True");
	                }
	                System.out.println();

	                System.out.println((!(x < 5) && !(y >= 7)) == !((x < 5) || (y >= 7)));
	                System.out.println(!(a == b) || !(g != 5) == !((a == b) && (g != 5)));
	                System.out.println(!((x <= 8) && (y > 4)) == (!(x <= 8) || !(y > 4)));
	                System.out.println(!(i > 4) || !(j <= 6) == !((i > 4) && (j <= 6)));
	            }
	            
	    public static void main(String[] args){
	        DeMorganLaws calc = new DeMorganLaws();
	        calc.calmorganLaw();
	    }
	}




