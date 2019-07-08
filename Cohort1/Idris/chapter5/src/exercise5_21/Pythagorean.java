package exercise5_21;

public class Pythagorean {
	
	public void displayPythagorean() {
		int i;int j;int k;
		int side1; int side2; int side3;
		
		System.out.println("\t"+"i "+"\t"+"j "+"\t"+"k"+"\n");
		for(i = 1; i<=500; i++) {
			for(j = 1; j<=500; j++) {
				for(k = 1;k<=500; k++) {
					side1 = i*i;
					side2 = j*j;
					side3 = k*k;
					if(side1 + side2 == side3) {
						System.out.println("\t"+ i +"\t"+ j +"\t"+ k);
					}
				}
			}
		}
	}

}
