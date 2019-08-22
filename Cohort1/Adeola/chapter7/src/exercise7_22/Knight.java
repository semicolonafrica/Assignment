package exercise7_22;

public class Knight {
	int[] horizontal = new int[8];
	int[] vertical = new int[8];
	{
	horizontal[0] = 2; 	vertical[0] = -1;
	horizontal[1] = 1;	vertical[1] = -2;
	horizontal[2] = -1;  vertical[2] = -2;
	horizontal[3] = -2 ;  vertical[3] = -1;
	horizontal[4] = -2; vertical[4] = 1;
	horizontal[5] = -1; vertical[5] = 2;
	horizontal[6] = 1;  vertical[6] = 2;
	horizontal[7] = 2; vertical[7] = 1;
}
	
	public int moveHorizontal(int moveNumber) {
		return horizontal[moveNumber];
	}
	public int moveVertical(int moveNumber) {
		return vertical[moveNumber];
	}
}
