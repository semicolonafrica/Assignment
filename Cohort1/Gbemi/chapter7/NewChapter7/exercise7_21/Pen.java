package exercise7_21;

public class Pen {
	
	private PenPosition currentPosition = PenPosition.UP;
	
	public PenPosition getCurrentPosition() {
		return currentPosition;
	}

	
	public void setCurrentPosition(PenPosition currentPosition) {
		
		this.currentPosition=currentPosition;
	}

	
}
