package oops.inheritance;

public class VehicleMain {

	public static void main(String args[]) {

		Audi audi = new Audi(40);

		audi.start();

		System.out.println("***********************The car has been started****************************");
		
		audi.steer(45);
		
		System.out.println("***********************The car steering set at 45 degrees******************");

		audi.accelarate(41);

		System.out.println("***********************After increasing the speed**************************");

		audi.accelarate(80);

		System.out.println("***********************After decreasing the speed**************************");

		audi.accelarate(20);

		System.out.println("***********************After shifting the gear*****************************");

		audi.changeGear(3);

		System.out.println("***********************After changing the velocity*************************");

		audi.changeVelocity(41, 4);

		System.out.println("***********************The car has been stopped****************************");

		audi.stop();
		
		

	}
}
