package exercise6_14;

public class Exponention {
public int integerPower(int base,int exponent){
	
	int ans = 1;
	for(int i = 1; i<= exponent; i++) {
		System.out.println(i);
	ans *= base;
	}
	System.out.println(ans);
	return exponent;
	
}


}

