package oops.inheritance;

public class Fish extends Animal {

	private int gills;
	private int eyes2;
	private int fins;

	public Fish(String name, int size, int weight, int gills, int eyes2, int fins) {

		super(name, 1, 1, size, weight, fins);
		this.gills = gills;
		this.eyes2 = eyes2;
		this.fins = fins;
	}

	public void rest() {
		System.out.println("Fish.rest() called");
		
	}

	private void moveMuscles() {

	}

	private void moveBackfin() {

	}

	public void swim(int speed) {
		System.out.println("Fish.swim() called");
		moveMuscles();
		moveBackfin();
		move(speed);
	}

}
