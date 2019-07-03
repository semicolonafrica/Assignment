package chapters;

public class WorldPopulationGrowth {

	public static void main(String[] args) {
		System.out.printf("%s\t%s\t%s","Year","Population","IncreasePopulation");
		System.out.println();
		
		long worldPopulation = 34_862_980;
		
		double growthRate = 0.0107;
		double lll;
		long numericalIncrease = 0;
		long store = 0;
		
		int numberOfYears = 1;
		
		while(numberOfYears <= 75) {
			lll = Math.pow((1 + growthRate),numberOfYears);
			store = store + worldPopulation;
			
			numericalIncrease = (long) ((long)numericalIncrease + store + lll);
			System.out.printf("%d\t%d\t%d%n",numberOfYears,store,numericalIncrease);
			numberOfYears++;
		}
		
	}

}
