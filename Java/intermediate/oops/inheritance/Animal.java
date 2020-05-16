package oops.inheritance;

public class Animal {

	private String name;
	private int brain;
	private int eyes;
	private int legs;
	private int size;
	private int weight;

	public Animal(String name, int brain, int eyes, int legs, int size, int weight) {

		this.name = name;
		this.brain = brain;
		this.eyes = eyes;
		this.legs = legs;
		this.size = size;
		this.weight = weight;
	}
	
	public void eat() {
		System.out.println("Animal.eat() called");
	}
	
	public void move(int speed) {
		System.out.println("Animal.move() called. Animal is moving at " + speed);
	}

	public String getName() {
		return name;
	}

	public int getBrain() {
		return brain;
	}

	public int getEyes() {
		return eyes;
	}

	public int getLegs() {
		return legs;
	}

	public int getSize() {
		return size;
	}

	public int getWeight() {
		return weight;
	}

}
