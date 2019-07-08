
	public class MultiplesOfTwoWithInfiniteLoop{
	
	public int getMultiple(){
	int count = 1;
		
	String store = "";
	
	while(count > 0) {
		int num = (int)Math.pow(2, count);
		System.out.print(num + ",");
		count++;
	}
	return num;
}
	public static void main(String[] args) {
		MultiplesOfTwoWithInfiniteLoop multiple = new MultiplesOfTwoWithInfiniteLoop();
		multiple.getMultiple();
	}

}
