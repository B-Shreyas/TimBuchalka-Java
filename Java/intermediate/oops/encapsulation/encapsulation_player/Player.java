package oops.encapsulation.player;

public class Player {

	public String fullName;
	public int health;
	public String weapon;

	public void loseHealth(int damage) {
		this.health = this.health - damage;
		if (this.health <= 0) {
			System.out.println("Player knocked out");
			// Reduces number of lives of remaining player.
		}
	}

	public int healthRemaining() {
		return this.health;
	}
}