package oops.masterChallenge;

public class DeluxBurger extends Hamburger {

	public DeluxBurger() {
		super("Deluxe", "Saucage & Bacon", 550, "white");
		super.addHamburgerAddition1("French Fries", 150);
		super.addHamburgerAddition2("Choco Lava Cake", 200);
	}

	@Override
	public void addHamburgerAddition1(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add additional items to a deluxe burger");
	}

	@Override
	public void addHamburgerAddition2(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add additional items to a deluxe burger");
	}

	@Override
	public void addHamburgerAddition3(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add additional items to a deluxe burger");
	}

	@Override
	public void addHamburgerAddition4(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add additional items to a deluxe burger");
	}

}
