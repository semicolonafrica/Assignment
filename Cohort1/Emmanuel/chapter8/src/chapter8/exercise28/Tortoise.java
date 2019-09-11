/**
 * 
 */
package chapter8.exercise28;

/**
 * @author USER
 *
 */
public class Tortoise {
	
	
	private int tortoisePosition = 1;
	private TortoiseMove myMove;

//	public Clock getTortoiseClock() {
//		return tortoiseClock;
//	}
//
//	public void setTortoiseClock(Clock tortoiseClock) {
//		this.tortoiseClock = tortoiseClock;
	//}

	public int getTortoisePosition() {
		return tortoisePosition;
	}

	public void setTortoisePosition(int tortoisePosition) {
		if(tortoisePosition >= 1)
		this.tortoisePosition = tortoisePosition;
		else if (tortoisePosition < 1){
			this.tortoisePosition = 1;
		}
			
		
	}

	public TortoiseMove getMyMove() {
		return myMove;
	}

	public void setMyMove(Clock tortoiseClock) {
		if(tortoiseClock.getTick() >=1 && tortoiseClock.getTick() <=5)
			this.myMove = TortoiseMove.FastPlod;
		else if(tortoiseClock.getTick() >5 && tortoiseClock.getTick() < 7) 
			this.myMove = TortoiseMove.Slip;
		else if(tortoiseClock.getTick() > 7 && tortoiseClock.getTick() < 10)
			this.myMove = TortoiseMove.SlowPod;
		
	}
	
	public void move() {
		
	}
	
	public void move(RaceTrack myTrack) {
		int temp;
		
		if(TortoiseMove.FastPlod==getMyMove()) {
			temp = this.tortoisePosition + 3;
			
			setTortoisePosition(temp);
			myTrack.getTrackFloor()[getTortoisePosition()] = RaceStatus.T;
		} 
		else if(TortoiseMove.Slip == getMyMove()) {
			temp = this.getTortoisePosition() - 6;
			setTortoisePosition(temp);
			myTrack.getTrackFloor()[getTortoisePosition()] = RaceStatus.T;
		}
		else if(TortoiseMove.SlowPod == getMyMove()) {
			temp = this.getTortoisePosition() + 1;
			setTortoisePosition(temp);
			myTrack.getTrackFloor()[getTortoisePosition()] = RaceStatus.T;
		}
	}

}
