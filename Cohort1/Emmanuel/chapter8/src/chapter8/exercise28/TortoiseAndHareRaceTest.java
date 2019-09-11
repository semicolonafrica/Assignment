/**
 * 
 */
package chapter8.exercise28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;
/**
 * @author USER
 *
 */
class TortoiseAndHareRaceTest {
	Tortoise ijapa;
	Hare myHare;
	RaceTrack everest;
	Clock raceClock;
	Random randomNumber;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		ijapa = new Tortoise();
		myHare = new Hare();
		everest = new RaceTrack();
		raceClock = new Clock();
		
		randomNumber = new Random();
		
		//ijapa.setTortoiseClock(raceClock); //passing in Clock object
		//myHare.setHareClock(raceClock); //passing in Clock object
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void tortoiseInitializeest() {
	 assertNotNull(ijapa);
	// assertEquals(raceClock, ijapa.getTortoiseClock());
	 assertEquals(1, ijapa.getTortoisePosition());
	}
	
	@Test
	void hareInitializeest() {
	 assertNotNull(myHare);
	// assertEquals(raceClock, myHare.getHareClock());
	 assertEquals(1, myHare.getHarePosition());
	}
	
	@Test
	void raceTrackInitializeest() {
	 assertNotNull(everest);
	 assertEquals(70, everest.getTrackFloor().length);
	}
	
	@Test
	void tortoiseFastPlodMoveTest() {
		assertEquals(1, ijapa.getTortoisePosition());
		 ijapa.setMyMove(raceClock);
		 assertEquals(TortoiseMove.FastPlod, ijapa.getMyMove());
		 ijapa.move(everest);
		 assertEquals(4, ijapa.getTortoisePosition());
		 assertEquals(RaceStatus.T, everest.getTrackFloor()[ijapa.getTortoisePosition()]);
	}
	
	@Test
	void tortoiseSlipMoveTest() {
		 ijapa.setTortoisePosition(10);
		 assertEquals(10, ijapa.getTortoisePosition());
		 ijapa.setMyMove(raceClock);
		 assertEquals(TortoiseMove.Slip, ijapa.getMyMove());
		 ijapa.move(everest);
		 assertEquals(4, ijapa.getTortoisePosition());
		 assertEquals(RaceStatus.T, everest.getTrackFloor()[ijapa.getTortoisePosition()]);
	}
	
	@Test
	void tortoiseSlowPodMoveTest() {
		 ijapa.setTortoisePosition(10);
		 assertEquals(10, ijapa.getTortoisePosition());
		 ijapa.setMyMove(raceClock);
		 assertEquals(TortoiseMove.SlowPod, ijapa.getMyMove());
		 ijapa.move(everest);
		 assertEquals(11, ijapa.getTortoisePosition());
		 assertEquals(RaceStatus.T, everest.getTrackFloor()[ijapa.getTortoisePosition()]);
	}
	
	@Test
	void tortoiseMovesOutsideRaceTrackTest() {
		 ijapa.setTortoisePosition(1);
		 assertEquals(1, ijapa.getTortoisePosition());
		 ijapa.setMyMove(raceClock);
		 assertEquals(TortoiseMove.Slip, ijapa.getMyMove());
		 ijapa.move(everest);
		 assertEquals(1, ijapa.getTortoisePosition());
		 assertEquals(RaceStatus.T, everest.getTrackFloor()[ijapa.getTortoisePosition()]);
	}
	
	@Test
	void hareMovesSleepMoveTest() {
		myHare.setHarePosition(1);
		 assertEquals(1, myHare.getHarePosition());
		 myHare.setHareMove(raceClock);
		 assertEquals(HareMove.Sleep, myHare.getHareMove());
		 myHare.move(everest);
		 assertEquals(1, myHare.getHarePosition());
		 assertEquals(RaceStatus.H, everest.getTrackFloor()[myHare.getHarePosition()]);
	}
	
	@Test
	void hareMoveBigHopMoveTest() {
		 myHare.setHarePosition(1);
		 assertEquals(1, myHare.getHarePosition());
		 myHare.setHareMove(raceClock);
		 assertEquals(HareMove.BigHop, myHare.getHareMove());
		 myHare.move(everest);
		 assertEquals(10, myHare.getHarePosition());
		 assertEquals(RaceStatus.H, everest.getTrackFloor()[myHare.getHarePosition()]);
	}
	@Test
	void hareMoveBigSlipMoveTest() {
		 myHare.setHarePosition(15);
		 assertEquals(15, myHare.getHarePosition());
		 myHare.setHareMove(raceClock);
		 assertEquals(HareMove.BigSlip, myHare.getHareMove());
		 myHare.move(everest);
		 assertEquals(3, myHare.getHarePosition());
		 assertEquals(RaceStatus.H, everest.getTrackFloor()[myHare.getHarePosition()]);
	}
	@Test
	void hareMoveSmallHopMoveTest() {
		 myHare.setHarePosition(15);
		 assertEquals(15, myHare.getHarePosition());
		 myHare.setHareMove(raceClock);
		 assertEquals(HareMove.SmallHop, myHare.getHareMove());
		 myHare.move(everest);
		 assertEquals(16, myHare.getHarePosition());
		 assertEquals(RaceStatus.H, everest.getTrackFloor()[myHare.getHarePosition()]);
	}
	
	@Test
	void hareMoveSmallSlipMoveTest() {
		 myHare.setHarePosition(15);
		 assertEquals(15, myHare.getHarePosition());
		 myHare.setHareMove(raceClock);
		 assertEquals(HareMove.SmallSlip, myHare.getHareMove());
		 myHare.move(everest);
		 assertEquals(13, myHare.getHarePosition());
		 assertEquals(RaceStatus.H, everest.getTrackFloor()[myHare.getHarePosition()]);
	}
	
	@Test
	void hareMoveOutSideMoveTest() {
		 myHare.setHarePosition(1);
		 assertEquals(1, myHare.getHarePosition());
		 myHare.setHareMove(raceClock);
		 assertEquals(HareMove.SmallSlip, myHare.getHareMove());
		 myHare.move(everest);
		 assertEquals(1, myHare.getHarePosition());
		 assertEquals(RaceStatus.H, everest.getTrackFloor()[myHare.getHarePosition()]);
	}
	
	@Test
	void clockTickAndTortoiseMoveTest() {
		assertNotNull(raceClock);
		raceClock.setTick(1);
		ijapa.setMyMove(raceClock);
		assertEquals(TortoiseMove.FastPlod, ijapa.getMyMove());
		raceClock.setTick(2);
		ijapa.setMyMove(raceClock);
		assertEquals(TortoiseMove.FastPlod, ijapa.getMyMove());
		raceClock.setTick(3);
		ijapa.setMyMove(raceClock);
		assertEquals(TortoiseMove.FastPlod, ijapa.getMyMove());
		raceClock.setTick(4);
		ijapa.setMyMove(raceClock);
		assertEquals(TortoiseMove.FastPlod, ijapa.getMyMove());
		raceClock.setTick(5);
		ijapa.setMyMove(raceClock);
		assertEquals(TortoiseMove.FastPlod, ijapa.getMyMove());
		raceClock.setTick(6);
		ijapa.setMyMove(raceClock);
		assertEquals(TortoiseMove.Slip, ijapa.getMyMove());
		raceClock.setTick(7);
		ijapa.setMyMove(raceClock);
		assertEquals(TortoiseMove.Slip, ijapa.getMyMove());
		raceClock.setTick(8);
		ijapa.setMyMove(raceClock);
		assertEquals(TortoiseMove.SlowPod, ijapa.getMyMove());
		raceClock.setTick(9);
		ijapa.setMyMove(raceClock);
		assertEquals(TortoiseMove.SlowPod, ijapa.getMyMove());
		raceClock.setTick(10);
		ijapa.setMyMove(raceClock);
		assertEquals(TortoiseMove.SlowPod, ijapa.getMyMove());
		
	}
	@Test
	void clockTickAndHareMoveTest() {
		assertNotNull(raceClock);
		raceClock.setTick(1);
		myHare.setHareMove(raceClock);
		assertEquals(HareMove.Sleep, myHare.getHareMove());
		raceClock.setTick(2);
		myHare.setHareMove(raceClock);
		assertEquals(HareMove.Sleep, myHare.getHareMove());
		raceClock.setTick(3);
		myHare.setHareMove(raceClock);
		assertEquals(HareMove.BigHop, myHare.getHareMove());
		raceClock.setTick(4);
		myHare.setHareMove(raceClock);
		assertEquals(HareMove.BigHop, myHare.getHareMove());
		raceClock.setTick(5);
		myHare.setHareMove(raceClock);
		assertEquals(HareMove.BigSlip, myHare.getHareMove());
		raceClock.setTick(6);
		myHare.setHareMove(raceClock);
		assertEquals(HareMove.SmallHop, myHare.getHareMove());
		raceClock.setTick(7);
		myHare.setHareMove(raceClock);
		assertEquals(HareMove.SmallHop, myHare.getHareMove());
		raceClock.setTick(8);
		myHare.setHareMove(raceClock);
		assertEquals(HareMove.SmallHop, myHare.getHareMove());
		raceClock.setTick(9);
		myHare.setHareMove(raceClock);
		assertEquals(HareMove.SmallSlip, myHare.getHareMove());
		raceClock.setTick(10);
		myHare.setHareMove(raceClock);
		assertEquals(HareMove.SmallSlip, myHare.getHareMove());
		
	}
	
	@Test
	void AnimalRaceSimulation() {
		while(myHare.getHarePosition() <= 70 || ijapa.getTortoisePosition() <= 70) {
			raceClock.setTick(1 + randomNumber.nextInt(10));
			
			myHare.move(everest);
			ijapa.move(everest);
			
			displayRaceStatus();
			//Arrays.fill(everest.getTrackFloor(), null);
			System.out.println();
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				//TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	public void displayRaceStatus() {
		for(int i=0; i < everest.getTrackFloor().length; i++) {
			if(everest.getTrackFloor()[i] == RaceStatus.T && everest.getTrackFloor()[i] == RaceStatus.H) {
				System.out.print("OUCH");
				
			}
			else if(everest.getTrackFloor() )
		}
	}
	
	
	
	


}
