package hypotanuse;

public class HypoUtil {
	
	public static double gethypotanuse(double opposite, double adjacent) {
		double oppositeTimesAdjacent = Math.pow(opposite, 2) + Math.pow(adjacent, 2);
		double hypotanuse = Math.sqrt(oppositeTimesAdjacent);
		return hypotanuse;
	}
	

}
