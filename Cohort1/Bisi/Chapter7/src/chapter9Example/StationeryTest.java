package chapter9Example;

public class StationeryTest {

	public static void main(String[] args) {
		Stationery myStationery = new Stationery();
		Pen mySpecificPen = new Pen();
		Pencil mySpecificPencil = new Pencil();
		
		
		Stationery myPenLookingLikeStationery = new Pen();
		myPenLookingLikeStationery = new Pencil();
		
		
		Stationery myPencilLookingLikeStationery = new Pencil();
		
		myStationery.write();
		myPenLookingLikeStationery.write();
		myPencilLookingLikeStationery.write();
		
		Pen downcastedPen = (Pen) new Stationery();
	}
}
