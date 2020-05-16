package oops.masterChallenge;

public class HealthyBurger extends Hamburger {

	private String healthyExtraName1;
	private double healthyExtraPrice1;

	private String healthyExtraName2;
	private double healthyExtraPrice2;

	public HealthyBurger(String meat, double price) {
		super("Healthy", meat, price, "Brown rye");
	}

	public void addHealthAddition1() {
		this.healthyExtraName1 = name;
		this.healthyExtraPrice1 = price;

	}

	public void addHealthAddition2() {
		this.healthyExtraName2 = name;
		this.healthyExtraPrice2 = price;

	}

}
