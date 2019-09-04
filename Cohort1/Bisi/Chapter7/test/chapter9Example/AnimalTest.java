package chapter9Example;

import org.junit.jupiter.api.Test;

public class AnimalTest {

//	@Test 
//	public void polymorphismTest() {
//		
//		Animal anAnimal = new Animal();
//		anAnimal.move();
//	}
	
	@Test
	public void birdTest() {
		//Animal.generalGreet();
		Animal eyele = new Bird();
		eyele.move();
	}
	
	@Test
	public void ostrichTest() {
		Animal ogongo = new Ostrich();
		ogongo.move();
	}
	
	@Test
	public void addAnimalTest() {
		AnimalFarm bisiFarm = new AnimalFarm();
		Bird layer = new Bird();
		bisiFarm.addAnimal(layer);
		
		Dog ajaMi = new Dog();
		bisiFarm.addAnimal(ajaMi);
		
		Ostrich myOstrich = (Ostrich) new Bird();
//		bisiFarm.addOstrich(myOstrich);
//		bisiFarm.addOstrich((Ostrich)layer);
	}
}
