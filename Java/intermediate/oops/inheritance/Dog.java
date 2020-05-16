package oops.inheritance;

public class Dog extends Animal {

	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;

	public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
		super(name, 1, 1, size, weight, teeth);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}

	private void chewed() {
		System.out.println("Dog.chew() called");
	}

	@Override
	public void eat() {
		System.out.println("Dog.eat() called");
		chewed();  // chewed() is called because this is taken from method
		super.eat(); // eat is called because its super its coming from animal.
	}
	
	public void walk() {
		System.out.println("Dog.walk() called");
		super.move(5);
	}
	
	public void run() {
		System.out.println("Dog.run() called");
		move(10);
	}
	
	private void moveLegs(int speed) {
		System.out.println("Dog.moveLegs() called");
	}

	@Override
	public void move(int speed) {
		System.out.println("Dog.move() called");
		moveLegs(speed);
		super.move(speed);
	}
	
	
	
	

}
