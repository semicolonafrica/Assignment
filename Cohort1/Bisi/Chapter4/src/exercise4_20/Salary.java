package exercise4_20;

public class Salary {
		private int hourlyRate;
		private int numberOfHours;
		private float excessHours;
		private double totalNumberOfHours;
		private double grossPay;
		
		public Salary(int hourlyRate, int numberOfHours, float excessHours, int totalNumberOfHours) {
			
			this.hourlyRate = hourlyRate;
			this.numberOfHours = numberOfHours;
			this.excessHours = excessHours;
			this.totalNumberOfHours = totalNumberOfHours;
		}

		public int getHourlyRate() {
			return hourlyRate;
		}
		public void setHourlyRate(int hourlyRate) {
			this.hourlyRate = hourlyRate;
		}
		

		public int getNumberOfHours() {
			return numberOfHours;
		}
		public void setNumberOfHours(int numberOfHours) {
			this.numberOfHours = numberOfHours;
		}
		

		public float getExcessHours() {
			return excessHours;
		}
		public void setExcessHours(float excessHours) {
			this.excessHours = excessHours;
		}
		

		public double getTotalNumberOfHours() {
			if(numberOfHours > 40) {
			totalNumberOfHours = (1.5 * excessHours) + numberOfHours;
			}
			if(numberOfHours < 40) {
			}
				return totalNumberOfHours;
		
		}
		public void setTotalNumberOfHours(double totalNumberOfHours) {
			this.totalNumberOfHours = totalNumberOfHours;
		}
		
		public double calGrossPay() {
			grossPay = hourlyRate * totalNumberOfHours;
			return grossPay;
		}
			
		
}
