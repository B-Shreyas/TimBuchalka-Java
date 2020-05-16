package oops.inheritance;

public class Audi extends Car {

	private int roadServicemonths;

	public Audi(int roadServicemonths) {

		super("Audi", "A8L", 4, 5, 6, false);
		this.roadServicemonths = roadServicemonths;
	}

	public void accelarate(int rate) {
		    
		int newVelocity = getcurrenVelocity() + rate;
		if (newVelocity == 0) {
			stop();
			changeGear(1);
		} else if (newVelocity > 0 && newVelocity <= 20) {
			changeGear(1);
		} else if (newVelocity > 20 && newVelocity <= 40) {
			changeGear(2);
		} else if (newVelocity > 40 && newVelocity <= 60) {
			changeGear(3);
		} else {
			changeGear(4);
		}

		if (newVelocity > 0) {
			changeVelocity(newVelocity, getcurrentDirection());
		}

	}

}
