	package chapter6;

	public class DistanceBetweenPoints {

		static double x1;
		static double y1;
		static double x2;
		static double y2;
	
		public static double distance() {
		
			double calculateDistance = Math.sqrt(getX() + getY());
		
			return calculateDistance;
		
		}
	
		public static double getX() {
			double store;
			 if(x2 > x1) {
			store = x2 - x1;
			 }else {
			store = x1 - x2;
			 }
			 //Calculate the square of store 
			 store = Math.pow(store, 2);
			 return store;
		}
	
		public static double getY() {
			double store;
			if(y2 > y1) {
				store = y2 - y1;
			}else {
				store = y1 - y2;
			}
			//Calculate the square of store 
			store = Math.pow(store, 2);
			return store;
		}
	
}
