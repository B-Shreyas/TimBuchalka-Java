package oops.inheritance;

public class Vehicle {

	private String name;
	private String size;

	private int currenVelocity;
	private int currentDirection;
	private int currentVelocity;

	public Vehicle(String name, String size) {
		super();
		this.name = name;
		this.size = size;

		this.currenVelocity = 0;
		this.currentDirection = 0;

	}

	public void start() {
		this.currentVelocity = 0;
	}
	
	public void steer(int direction) {
		this.currentDirection += direction;
		System.out.println("Vehicle.steer(): Steering at " + currentDirection + "degrees.");
	}

	public void move(int velocity, int direction) {
		this.currentVelocity = velocity;
		this.currentDirection = direction;
		System.out.println("Vehicle.move(): Move at " + currentVelocity + " in direction " + currentDirection);
	}

	public String getName() {
		return name;
	}

	public String getSize() {
		return size;
	}

	public int getcurrenVelocity() {
		return currenVelocity;
	}

	public int getcurrentDirection() {
		return currentDirection;
	}

	public void stop() {
		this.currentVelocity = 0;
	}

}