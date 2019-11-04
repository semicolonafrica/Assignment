package exercise7_17;

public class Seat {
	
	private int[][] numberOfFirstClassSeats = new int[3][2];
	
	private int[][] numberOfSecondClassSeats = new int[3][2];
	
	public void setNumberOfFirstClassSeats(int[][] firstClassSeats) {
		this.numberOfFirstClassSeats = firstClassSeats;
	}

	public int[][] getNumberOfFirstClassSeats() {
		return numberOfFirstClassSeats;
	}
	
	public void setNumberOfSecondClassSeats(int[][] secondClassSeats) {
		this.numberOfSecondClassSeats = secondClassSeats;
	}

	public int[][] getNumberOfSecondClassSeats() {
		return numberOfSecondClassSeats;
	}
}
