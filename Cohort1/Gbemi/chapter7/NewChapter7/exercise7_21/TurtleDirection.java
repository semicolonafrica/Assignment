package exercise7_21;

public enum TurtleDirection {
	
	LEFT(3), RIGHT(4);
	
	private final int value;
	
	private TurtleDirection(int id) {
		
		this.value = id;
	}

	public int getValue() {
		return value;
	}

}

