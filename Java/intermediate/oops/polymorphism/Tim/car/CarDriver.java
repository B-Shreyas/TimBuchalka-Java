package oops.polymorphism.Tim.car;

public class CarDriver {

	public static void main(String[] args) {
		
		Car car = new Car(8, "Car's");
	    System.out.println(car.getName() + " " + car.startEngine());
	    System.out.println(car.getName() + " " + car.accelerate());
	    System.out.println(car.getName() + " " + car.brake());
	    
	    System.out.println("****************************************************************");
	   // @SuppressWarnings("unused")
	    Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander's");
	    System.out.println(mitsubishi.getName() + " " + mitsubishi.startEngine());
	    System.out.println(mitsubishi.getName() + " " + mitsubishi.accelerate());
	    System.out.println(mitsubishi.getName() + " " + mitsubishi.brake());
	    
	    System.out.println("****************************************************************");
	    
	    Porsche porsche = new Porsche(8, "carrera 911");
	    System.out.println(porsche.getName() + " " + porsche.startEngine());
	    System.out.println(porsche.getName() + " " + porsche.accelerate());
	    System.out.println(porsche.getName() + " " + porsche.brake());
	    System.out.println(porsche.getName() + " " + porsche.getCylinders());
	    System.out.println(porsche.getName() + " " + porsche.getWheels());
	    System.out.println(porsche.getName() + " " + porsche.isEngine());
	    
	    System.out.println("****************************************************************");
	    
	    Maclaren regera = new Maclaren(10, "Maclaren Regera");
	    System.out.println(regera.getName() + " " + regera.startEngine());
	    System.out.println(regera.getName() + " " + regera.accelerate());
	    System.out.println(regera.getName() + " " + regera.brake());
	    System.out.println(regera.getName() + " " + regera.getCylinders());
	    System.out.println(regera.getName() + " " + regera.getWheels());
	    System.out.println(regera.getName() + " " + regera.isEngine());
	    
	}

}
