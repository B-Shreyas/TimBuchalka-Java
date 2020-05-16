package oops.inheritance;

public class AnimalMain {

	public static void main(String args[]) {
		Animal animal = new Animal("Animal", 1, 1, 4, 7, 20);

		Dog dog = new Dog("Rokkie", 8, 20, 2, 4, 1, 20, "Long silky");
		//dog.eat();
		//dog.run();
		//dog.walk();
		
		Fish fish = new Fish("GoldFish", 1, 6, 1, 2, 1);
		fish.swim(15);
		fish.rest();
		
		
	}
}
