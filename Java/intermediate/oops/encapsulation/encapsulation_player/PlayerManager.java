package oops.encapsulation.player;

public class PlayerManager {

	public static void main(String[] args) {

//		Player assassin = new Player();
//		assassin.name = "Shreyas";
//		assassin.health = 20;
//		assassin.weapon = "Sword";
//		
//		int damage = 40;
//		assassin.loseHealth(damage);
//		System.out.println("Remaining health = " + 	assassin.healthRemaining());
//
//		damage = 30;
//		assassin.health = 200;
//		assassin.loseHealth(damage);
//		System.out.println("Remaining health = " + 	assassin.healthRemaining());
		
		EnhancedPlayer player = new EnhancedPlayer("Shree", 200, "Sword");
		System.out.println("Initial health is " + player.getHealth());
		
	}

}
