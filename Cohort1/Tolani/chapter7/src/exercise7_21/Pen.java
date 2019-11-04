package exercise7_21;

public class Pen {
	
	private PenEnum currentPenPosition = PenEnum.UP;
	
	public void setCurrentPosition (PenEnum newPosition) {
		
		this.currentPenPosition = newPosition;
	}
	
	public PenEnum getCurrentPositin() {
		return currentPenPosition;
	}

}
