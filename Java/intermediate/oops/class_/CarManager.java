package oops.classes_and_objects;

public class CarManager {

	public static void main(String args[]) {
		Car ferrari = new Car();
		Car audi = new Car();

		ferrari.setModel("porsche");
		System.out.println("Model is " + ferrari.getModel());

		ferrari.setColor("black");
		System.out.println(ferrari.getModel() + " Color is " + ferrari.getColor());

		ferrari.setDoor(2);
		System.out.println(ferrari.getModel() + " has " + ferrari.getDoor() + " doors ");

		ferrari.setMileage(10.2);
		System.out.println(ferrari.getModel() + " has " + ferrari.getMileage() + " mileage ");

		ferrari.setWheels(4);
		System.out.println(ferrari.getModel() + " has " + ferrari.getWheels() + " wheels");

		System.out.println("***********************************************************************************");

		System.out.println("Model is " + ferrari.getModel() + "\n" + ferrari.getModel() + " has colour "
				+ ferrari.getColor() + ("\n") + ferrari.getModel() + " has doors " + ferrari.getDoor() + ("\n")
				+ ferrari.getModel() + " has mileage " + ferrari.getMileage() + ("\n") + ferrari.getModel()
				+ " has wheels " + ferrari.getWheels());
	}
}
