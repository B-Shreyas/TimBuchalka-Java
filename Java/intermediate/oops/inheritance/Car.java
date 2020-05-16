package oops.inheritance;

public class Car extends Vehicle {

	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;

	private int currentGear;

	public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
		super(name, size);
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;
		this.currentGear = 1;
	}

	@Override
	public void start() {

		System.out.println("Car.started(): Power Ignition has ON" + ("\n") + "Engine has ON");
		super.start();
	}

	public void changeGear(int currentGear) {
		this.currentGear = currentGear;
		System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
	}

	public void changeVelocity(int speed, int direction) {
		move(speed, direction);
		System.out.println("Car.changeVelocity(): Velocity " + speed + " direction : " + direction);
	}

	@Override
	public void stop() {
		System.out.println("Car.stop(): Car has stopped. ");
		super.stop();
	}

}
