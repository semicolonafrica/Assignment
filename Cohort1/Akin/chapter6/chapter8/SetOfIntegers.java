package chapter8;

public class SetOfIntegers {

	private  static final int ARRAYSIZE = 101;
	private  boolean[] setValue;
	
	public SetOfIntegers() 
	{
		setValue = new boolean[ ARRAYSIZE ];
	}
	
	public SetOfIntegers( int array[] ) {
		
		setValue = new boolean[ ARRAYSIZE ];

		for(int i = 0; i < array.length;i++) {
			insertElement( array[i] );
		}
	}
	
	public String toString() {
		
		int first = 1;
		boolean empty = true;
		
		String setString = "[ ";
		
		for(int i = 0; i < ARRAYSIZE; i++) {
			
			if( setValue[ i ]) {
			setString += i + " ";
			empty = false;
			first++;
			}
		}
		
		if( empty ) {
			setString += "---";
		}
		setString += " ]";
		
		return setString;
	}
	
	public SetOfIntegers union(SetOfIntegers integer) {
		SetOfIntegers temp = new SetOfIntegers();
		
		for(int i = 0; i < ARRAYSIZE; i++) {
			temp.setValue[i] = (setValue[i] || integer.setValue[i]);
		}
		return temp;
	}
	
	public SetOfIntegers intersection(SetOfIntegers integer) {
		SetOfIntegers temp = new SetOfIntegers();
		
		for(int i = 0; i < ARRAYSIZE; i++) {
			temp.setValue[i] = (setValue[i] && integer.setValue[i]);
		}
		return temp;
	} 
	
	public void insertElement(int insert) {
		if(insert >= 0 && insert <= 100) {
			setValue[ insert ] = true;
		}
	}
	
	public void deleteElement(int delete) {
		
		if(delete >= 0 && delete <= 100) {
			setValue[ delete ] = false;
		}
	}
	
	public boolean isEqualTo(SetOfIntegers integer) {
		
		boolean answer = false;
		
		for( int i = 0; i < ARRAYSIZE; i++) {
			if(setValue[i] != integer.setValue[i]) {
				answer = false;	
		}	
	}
				answer = true;	
				return answer;
	}
}
