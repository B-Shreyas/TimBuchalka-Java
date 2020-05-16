package oops.polymorphism.Tim.car;

public class Car {

	private boolean engine;
	private int cylinders;
	private String name;
	private int wheels;

	public Car(int cylinders, String name) {
		this.cylinders = cylinders;
		this.name = name;
		this.wheels = 4;
		this.engine = true;
	}

	public int getCylinders() {
		return cylinders;
	}

	public String getName() {
		return name;
	}

	public int getWheels() {
		return wheels;
	}

	public boolean isEngine() {
		return engine;
	}

	public String startEngine() {
		// System.out.println("Engine has started "); // return name; is imp public
		// string is given.
		return "Engine started() ";
	}

	public String accelerate() {
		return "Accelerate speed()";
	}

	public String brake() {
		return "Applied Brake()";
	}

}

class Mitsubishi extends Car {
	public Mitsubishi(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return "Engine has started.";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return "accelerates the car's speed.";
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return "object detected. Apply brakes.";
	}

}

class Porsche extends Car {
	public Porsche(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return "Engine has started.";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return "accelerates the car's speed.";
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return "object detected. Apply brakes.";
	}

	@Override
	public int getWheels() {
		// TODO Auto-generated method stub
		return super.getWheels();
	}

}

class Maclaren extends Car{
	public Maclaren(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return "Engine has started.";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return "accelerates the car's speed.";
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return "object detected. Apply brakes.";
	}
	
	
}
