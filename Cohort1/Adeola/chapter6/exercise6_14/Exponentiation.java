package exercise6_14;
import java.util.Scanner;
import java.security.SecureRandom;

public class Exponentiation {
	   //static int product = 0;
	   public static int integerPower( int base, int exponent){
	       int product = 1;
	       for(int i =1; i<=exponent; i++){
	           product *= base;
	       }
	       System.out.println(base + " ^ " + exponent + " = " + product);
	       return product;
	   }
	   public static double integerPower( double base, int exponent){ // method overloading
	       double product = 1.0;
	       for(int i =1; i<=exponent; i++){
	           product *= base;
	       }
	       System.out.println(base + " ^ " + exponent + " = " + product);
	       return product;
	   }
	   public static void main(String[] args){
	       integerPower(3,4);
	       integerPower(7,4);
	       integerPower(5,10);
	       integerPower(0.5,3);
	       integerPower(0.36,4);
	   }

}
