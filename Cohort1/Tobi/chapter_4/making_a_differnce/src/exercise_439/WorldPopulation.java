package exercise_439;

public class WorldPopulation {

	public void calculateWorldGrowth()
	{
		int yearCounter = 1;
		double rate = 0.0107;
		double populationIncrease = 0;
		double currentPopulation = 7346235000.00;
		
		System.out.printf("%s%30s%20s%n", "Year", "Anticipated World Population", "Numerical Increase");
		while(yearCounter <= 75)
		{
			populationIncrease = currentPopulation * rate;
			currentPopulation += populationIncrease;
			
			System.out.printf("%4d%,30.2f%,20.2f%n", yearCounter, currentPopulation, populationIncrease);
			yearCounter++;
		}
	}
	public static void main(String[] args) {
		WorldPopulation calculator = new WorldPopulation();
		
		calculator.calculateWorldGrowth();

	}

}
