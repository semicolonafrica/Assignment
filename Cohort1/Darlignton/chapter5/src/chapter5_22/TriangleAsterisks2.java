package chapter5_22;

public class TriangleAsterisks2 {
	public void formAngles() {
		int a= 1, b =10, c = 15, d = 5;
		int i;
		for(i = 1; i<=10;i++) {
			for(int k = a;k>0;k--)
			{
				System.out.print("*");
			}
			for(int k = c;k>0;k--)
			{
				System.out.print(" ");
			}
			for(int k = b;k>0;k--)
			{
				System.out.print("*");
			}
			for(int k = d;k > 0;k--)
			{
				System.out.print(" ");
			}
			for(int k = b;k>0;k--)
			{
				System.out.print("*");
			}for(int k = c;k>0;k--)
			{
				System.out.print(" ");
			}
			for(int k = a;k>0;k--)
			{
				System.out.print("*");
			}
			System.out.println();
			a+=1;b-=1;c-=1;d+=2;
		}	
		
	}

}
