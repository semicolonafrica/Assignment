package chapter5.exercise513;


public class Arithmetic {
	
	private long store;
	private int numberOfFactorial;
	
	public Arithmetic(long store, int numberOfFactorial) {
		
		this.store = store;
		this.numberOfFactorial = numberOfFactorial;
	}


	public int getNumberOfFactorial() {
		return numberOfFactorial;
	}



	public void setNumberOfFactorial(int numberOfFactorial) {
		this.numberOfFactorial = numberOfFactorial;
	}



	public long getStore() {
		return store;
	}

	public void setStore(long store) {
		this.store = store;
	}
	
	
	public void calculateFactorial() {
		
		for(int count = 1; count <= numberOfFactorial; count++) {
			store = store * count;
			System.out.printf("%d\t%d%n", count, store);
		}
	}




	
	

}
