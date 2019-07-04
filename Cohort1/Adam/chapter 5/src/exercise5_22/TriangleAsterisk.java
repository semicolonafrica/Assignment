package exercise5_22;

public class TriangleAsterisk {
	public void formAngles() {
		int a = 1;int b= 14; int c = 10;int d = 5;
		for(int q= 1; q <= 10; q++) {
			for(int i =a; i >0; i--) {
				System.out.print("*");
			}
			for(int j=b; j>=0; j--) 
			{
				System.out.print(" ");
			}
			for(int i =c; i >0; i--)
			{
				System.out.print("*");
			}for(int j=d; j>=0; j--) 
			{
				System.out.print(" ");
			}
			for(int j=c; j>0; j--) 
			{
				System.out.print("*");
			}
			for(int j=b; j>=0; j--)
			
			{
				System.out.print(" ");
			}
			for(int j=a; j>0; j--) 
			{
				System.out.print("*");
			}
			System.out.println();
			a+=1;b-=1;c-=1;d+=2;
		}
	}
}