package oops.classes_and_objects;

public class Car {

	private int doors;
	private String color;
	private double mileage;
	private int wheels;
	private String model;

	public void setModel(String model) {
		String validModel = model.toLowerCase();
		if (validModel.equals("LaFerrari") || validModel.equals("porsche")) {
			this.model = model;
		} else {
			this.model = "unknown";
		}
	}

	public String getModel() {
		return this.model;
	}

	public void setColor(String color) {
		String validColor = color.toLowerCase();
		if (validColor.equals("red") || validColor.equals("black")) {
			this.color = color;
		} else {
			this.color = "unknow";
		}

	}

	public String getColor() {
		return this.color;
	}

	public void setDoor(int doors) {
		this.doors = doors;
	}

	public int getDoor() {
		return this.doors;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getWheels() {
		return this.wheels;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public double getMileage() {
		return this.mileage;
	}

}
