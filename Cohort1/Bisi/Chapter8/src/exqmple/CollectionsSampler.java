/**
 * 
 */
package exqmple;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

/**
 * @author user
 *
 */
public class CollectionsSampler {

	public static void main(String[] args) {
		Integer[] bigInt = new Integer[5];
		
		int[] smallInt = new int[5];
		
		int joshuaAge = 10;
		
		bigInt[0] = joshuaAge;
		smallInt[0] = joshuaAge;
		
		Integer ageOfJoshua = bigInt[0];
		
		int joshuaFriendAge = ageOfJoshua;
		
		System.out.println(bigInt[0].getClass());
		
		String internName = "Joshua";
		Collection<String> studentNames = new ArrayList<String>();
		studentNames.add(internName);
		
		List<String> nameOfStudents = new ArrayList<String>();
		nameOfStudents.add(internName);
		List<String> names = new Vector<String>();
		names.add(internName);
		
	}
	
}
