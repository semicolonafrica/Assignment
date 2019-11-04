/**
 * 
 */
package exercise7_21;

/**
 * @author Omotolani
 *
 */
public enum PenEnum {
	UP(1),DOWN(2);
	
	final int value;
	
	private PenEnum(int status) {
		this.value = status;
	}
	
	public int getValue() {
		return value;
	}

}
