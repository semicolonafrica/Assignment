package exercise6_12;
import java.security.SecureRandom;
public class AssignRandom {

	   public static void main(String[] args){     
	       general();
	       general2();
	       general3();
	       general4();
	       general5();
	       general6();
	   }

	   public static void general() {
		 //1 <= n <= 2.
	       SecureRandom random = new SecureRandom();
	       int x = 1 + random.nextInt(2);
	       System.out.println("Number 1 to 2: " + x);
	   }    
	   public static void general2(){
	       SecureRandom randomNumber = new SecureRandom();
	       //1 <= n <= 100.
	       int y = 1 + randomNumber.nextInt(100);
	       System.out.println("Number 1 to 100: " + y);
	   } 
	   public static void general3(){
		   SecureRandom random = new SecureRandom();
		   //0 <= n <= 9.
	       int z = random.nextInt(10);
	       System.out.println("Number 0 to 9: " + z);
	   }
	   public static void general4(){
		   SecureRandom random = new SecureRandom();
		   //1000 <= n <= 1112.
	       int p = 1000 + random.nextInt(113);
	       System.out.println("Number 1000 to 1113: " + p);
	   } 
	   public static void general5() {
		   SecureRandom random = new SecureRandom();
		   //–1 <= n <= 1.
	       int q  = -1 + random.nextInt(3);
	       System.out.println("\nNumber -1 to 1: " + q);
	   }
	   public static void general6() {
		   SecureRandom random = new SecureRandom();
		   //–3 <= n <= 11.
	       int r  = -3 + random.nextInt(15);
	       System.out.println("\nNumber -3 to 11: " + r);
	   }

}
