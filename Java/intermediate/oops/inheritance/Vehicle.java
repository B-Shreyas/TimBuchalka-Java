package oops.inheritance;

public class Vehicle {

	private String name;
	private String size;

	private int currenVelocity;
	private int currentDirection;
	private int currentVelocity;

	double userMiles;
	double userGallons;
	double milesPerGallon;
	String userStringOutput;
	
	
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
	
	public void mileage() {
		userStringOutput = JOptionPane.showInputDialog("Please enter the miles the vehicle runs");
		userMiles = Double.parseDouble(userStringOutput);
		
		userStringOutput = JOptionPane.showInputDialog("Please enter the gallons of gas vehicle used");
		userGallons = Double.parseDouble(userStringOutput);

		milesPerGallon = userMiles / userGallons;

		JOptionPane.showMessageDialog(null, "Miles per gallon is " + milesPerGallon);
		System.exit(0);

	}

}
