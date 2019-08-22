package chapter8;

public class HugeInteger {

	private int[] number_array;
	private final int NUM = 40;
	private boolean positive;
	
	//Providing a no-argument constructor
	public HugeInteger() {
		number_array = new int[NUM];
		positive = true;
	}
	
	//Provide a method parse that converts a string to integer 
	//and store the integer in the array number_array
	
	public void parse(String number_string) {
		char[] int_char = number_string.toCharArray();
		
		//check if input is a negative number
		if(int_char[0] == '-')
			positive = false;
		
		if(positive)
			number_array[NUM - int_char.length] = 
			int_char[0] - '0';
		
		// convert string to integer array
		for(int i = 1; i < int_char.length;i++) {
			number_array[NUM - int_char.length + i] = int_char[i] - '0';
		}
	}
	
	public HugeInteger add(HugeInteger add) {
		HugeInteger temp = new HugeInteger();
		
		if(positive == add.positive) {
			temp = addPositives(add);
		}
		else if ( positive && (!add.positive)){
			add.positive = true;
			if(isGreaterThan(add))
				temp = subPositives(add);
				else {
					temp = add.subPositives(this);
					temp.positive = false;
				}
			add.positive = false;
		}
		
		else if(!positive && add.positive) {
			add.positive = false;
			if(isGreaterThan(add))
				temp = add.subPositives(this);
			else {
				temp = subPositives(add);
				temp.positive = false; 
			}
			add.positive = true;
		}
		return temp;
	}
	
	public HugeInteger addPositives(HugeInteger add) {
		HugeInteger temp = new HugeInteger();
		int solve = 0;
		
		//Iterate through HugeInteger
		for(int i = 39; i >= 0; i--) {
			temp.number_array[i] = number_array[i] + add.number_array[i] + solve;
			
			if(temp.number_array[i] > 9) {
				temp.number_array[i] %= 10;
				solve = 1;
			} else {
				solve = 0;
			}
		}
		if(!positive)
			temp.positive = false;
		return temp;
	}
	
	public HugeInteger subtract( HugeInteger subtractValue )   
	   {   
	      HugeInteger temp = new HugeInteger();   // temporary result   
	      
	      // subtractValue is negative   
	      if ( positive && ( !subtractValue.positive ) )   
	         temp = addPositives( subtractValue );   
	      // this HugeInteger is negative   
	      else if ( !positive && subtractValue.positive )   
	         temp = addPositives( subtractValue );   
	      // at this point, both HugeIntegers have the same sign   
	      else    
	      {   
	         boolean isPositive = positive; // original sign   
	         boolean resultPositive = positive; // sign of the result   
	   
	         // set both to positive so we can compare absolute values   
	         positive = true;   
	         subtractValue.positive = true;   
	   
	         if ( this.isGreaterThan( subtractValue ) )   
	            temp = this.subPositives( subtractValue );   
	         else   
	         {   
	            temp = subtractValue.subPositives( this );   
	            resultPositive = !isPositive; // flip the sign   
	         } // end else   
	            
	         positive = isPositive;   
	         subtractValue.positive = isPositive;   
	         temp.positive = resultPositive;   
	      }
	      return temp;
	   }
	
	 public HugeInteger subPositives( HugeInteger subtractValue )   
	   {   
	      HugeInteger temp = new HugeInteger();   
	   
	      // iterate through HugeInteger   
	      for ( int i = 39; i >= 0; i-- )   
	      {        
	         // borrow if needed    
	         if ( number_array[i] < subtractValue.number_array[i] )   
	         {   
	        	 number_array[ i ] += 10;   
	            subtractValue.number_array[ i - 1 ]--;   
	         } // end if   
	         
	         temp.number_array[ i ] = number_array[ i ] - subtractValue.number_array[ i ];   
	      } // end for   
	   
	      return temp; // return difference of two HugeIntegers   
	   }
	
	
	 public int findFirstNonZeroPosition()   
	   {   
	      int position = 39;   
	   
	      // find first non-zero position for first HugeInteger   
	      for ( int i = 0; i < NUM; i++ )   
	      {   
	         if ( number_array[ i ] > 0 )   
	            return i;   
	      } // end for   
	         
	      return position;   
	   }
	
	 public String toString()   
	   {   
	      String output = "";   
	   
	      if ( !positive )   
	         output = "-";   
	   
	      // get HugeInteger values without leading zeros   
	      for ( int i = findFirstNonZeroPosition(); i < NUM; i++ )    
	         output += number_array[ i ];   
	   
	      return output;   
	  }
	 
	 public boolean isEqualTo( HugeInteger compare )   
	   {   
	      // compare the sign   
	      if ( positive != compare.positive )   
	         return false;   
	         
	      // compare each digit   
	      for ( int i = 0; i < NUM; i++ )   
	      {   
	         if ( number_array[ i ] != compare.number_array[ i ] )    
	            return false;   
	      }
	      return true;
	   }
	 
	 public boolean isNotEqualTo( HugeInteger compare ) {
		 return !isEqualTo(compare);
	 }
	 
	 public boolean isGreaterThan( HugeInteger compareValue )   
	   {   
	      // different signs   
	      if ( positive && ( !compareValue.positive ) )   
	         return true;   
	      else if ( !positive && compareValue.positive )   
	         return false;   
	   
	      // same sign   
	      else   
	      {   
	         // first number's length is less than second number's length   
	         if ( findFirstNonZeroPosition() >    
	            compareValue.findFirstNonZeroPosition() )   
	         {   
	            return !positive;   
	         } // end if   
	               
	         // first number's length is larger than that of second number   
	         else if ( findFirstNonZeroPosition() <    
	            compareValue.findFirstNonZeroPosition() )   
	         {   
	            return positive;   
	         } // end else if   
	   
	         // two numbers have same length   
	         else   
	         {   
	            for ( int i = 0; i < NUM; i++ )   
	            {   
	                 if ( number_array[ i ] > compareValue.number_array[ i ] )   
	                  return positive;   
	               else if ( number_array[ i ] < compareValue.number_array[ i ] )   
	                  return !positive;   
	            } // end for   
	         } // end else   
	      } // end outer if-elseif-else   
	         
	      return false;   
	   }
	 public boolean isLessThan( HugeInteger compareValue )   
	   {   
	      return !( isGreaterThan( compareValue ) ||    
	         isEqualTo( compareValue ) );   
	   } // end method isLessThan   
	   
	   // test if one HugeInteger is great than or equal to another   
	   public boolean isGreaterThanOrEqualTo( HugeInteger compareValue )   
	   {   
	      return !isLessThan( compareValue );   
	   } // end method isGreaterThanOrEqualTo   
	   
	   // test if one HugeInteger is less than or equal to another   
	   public boolean isLessThanOrEqualTo( HugeInteger compareValue )   
	   {   
	      return !isGreaterThan( compareValue );   
	   } // end method isLessThanOrEqualTo   
	   
	   // test if one HugeInteger is zero   
	   public boolean isZero()   
	   {   
	      // compare each digit   
	      for ( int i = 0; i < NUM; i++ )   
	      {   
	         if ( number_array[ i ] != 0 )   
	            return false;   
	      } // end for   
	         
	      return true;   
	   }
	
}
