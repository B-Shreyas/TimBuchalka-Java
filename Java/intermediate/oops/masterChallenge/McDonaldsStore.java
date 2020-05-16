package oops.masterChallenge;

public class McDonaldsStore {

	public static void main(String[] args) {

		Hamburger hamburger = new Hamburger("Basic", "Saucage", 400, "White");
		double price = hamburger.itemizeHamburger();
		hamburger.addHamburgerAddition1("Tomato Ketchup", 10);
		hamburger.addHamburgerAddition2("Periperi", 20);
		hamburger.addHamburgerAddition3("Lettuce", 60);
		hamburger.addHamburgerAddition4("Cheese", 20);

		System.out.println("Total hamburger price => Rs." + hamburger.itemizeHamburger());

		System.out.println("*************************************************************");

		HealthyBurger healthyBurger = new HealthyBurger("Bacon", 500);
		healthyBurger.itemizeHamburger();
		healthyBurger.addHamburgerAddition1("Egg", 20);
		healthyBurger.itemizeHamburger();
		healthyBurger.addHamburgerAddition2("Lentils", 40);
		healthyBurger.itemizeHamburger();
		System.out.println("Total healthy burger price is => " + healthyBurger.itemizeHamburger());

		System.out.println("*************************************************************");

		DeluxBurger deluxBurger = new DeluxBurger();
		deluxBurger.addHamburgerAddition3("Should not this", 350);
		deluxBurger.itemizeHamburger();

	}

}
