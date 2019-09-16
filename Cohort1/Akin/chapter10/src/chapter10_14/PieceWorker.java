package chapter10_14;

public class PieceWorker extends Employee {

	private double wage;
	private int pieces;
	
	public PieceWorker(String firstName, String lastName,
			String socialSecurityNumber, double wage, int pieces) {
		super(firstName, lastName,socialSecurityNumber);
		
		if(wage < 0.0)
			throw new IllegalArgumentException(
					"wage must be > 0.0");
		this.wage = wage;
		
		if(pieces < 0)
			throw new IllegalArgumentException(
					"Pieces must be > 0");
		this.pieces = pieces;
		
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		
		if(wage < 0.0)
			throw new IllegalArgumentException(
					"wage must be > 0.0");
		this.wage = wage;
	}

	public int getPieces() {
		return pieces;
	}

	public void setPieces(int pieces) {
		
		if(pieces < 0)
			throw new IllegalArgumentException(
					"Pieces must be > 0");
		this.pieces = pieces;
	}
	
	@Override
	public double earnings() {
		return getWage() * getPieces();
	}
	
	@Override
	public String toString() {
		return String.format("PieceWorker employee: %s%n%s: $%,.2f; %s: %,d",
				super.toString(), "piece worker wage", getWage(),
				"pieces sold", getPieces());
	}
	
}
