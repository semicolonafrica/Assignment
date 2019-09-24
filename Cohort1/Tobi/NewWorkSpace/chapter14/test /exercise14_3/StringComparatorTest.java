package exercise14_3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringComparatorTest {
	
	StringComparator objCompare;
	Scanner input;
	
	@BeforeEach
	void setUp() throws Exception {
		objCompare = new StringComparator();
		input = new Scanner(System.in);
	}
	
	
	@Test
	void StringComparatorInitializedTest() {
		
		assertNotNull(objCompare);
	}

	@Test
	void setUserInputTest() {
		
		objCompare.setUserInput1("Hello");
		
		objCompare.setUserInput2("Hello");
		
		assertEquals("Hello", objCompare.getUserInput1());
		
		assertEquals("Hello", objCompare.getUserInput2());
	}
	
	@Test
	void userInputWithInvalidArgumentTest() {
		
		
		assertThrows(IllegalArgumentException.class, ()-> objCompare.setUserInput1(" HelloThere"));
		
		assertThrows(IllegalArgumentException.class, ()-> objCompare.setUserInput2(" Hello"));
		
	}
	@Test
	void compareTestWhenStringAreEqual() {
		
		objCompare.setUserInput1("Hello");
		
		objCompare.setUserInput2("Hello");
		
		assertEquals("Hello", objCompare.getUserInput1());
		
		assertEquals("Hello", objCompare.getUserInput2());	
		
		assertEquals(0, objCompare.getUserInput1().compareTo(objCompare.getUserInput2()));
	}
	
	@Test
	void compareStringTest() {
		
		objCompare.setUserInput1("Mellon");
		
		objCompare.setUserInput2("Hello");
		
		assertEquals("Mellon", objCompare.getUserInput1());
		
		assertEquals("Hello", objCompare.getUserInput2());	
		
		int result =  objCompare.getUserInput1().compareTo(objCompare.getUserInput2());
				
		if(result == 0) {
			assertEquals(0, objCompare.getUserInput1().compareTo(objCompare.getUserInput2()));
		}
		else if(result < 0) {
			assertNotEquals(0, objCompare.getUserInput1().compareTo(objCompare.getUserInput2()));

		}
		else if(result > 0){
			assertNotEquals(0, objCompare.getUserInput1().compareTo(objCompare.getUserInput2()));
		}
	}
	
	@Test
	void compareUserInputTest() {
		
		try {
		System.out.println("Please enter a String of characters");
		String user1 = input.next();
		
		objCompare.setUserInput1(user1);
		
		System.out.println("Please enter a String of characters");
		String user2 = input.next();
		
		
		objCompare.setUserInput2(user2);
		
		int result = objCompare.getUserInput1().compareTo(objCompare.getUserInput2());
		
		if(result == 0) {
			System.out.println("Strings are equal");
		}
		else if(result < 0) {
			System.out.printf("\"%s\" is less than \"%s\"", user1, user2);
		}
		else if(result > 0){
			System.out.printf("\"%s\" is greater than \"%s\"", user1, user2);
		}
		}
		catch(NoSuchElementException | IllegalArgumentException e) {
			
			System.out.println("Invalid input!");
		}
		
		
		
		
	}

}
