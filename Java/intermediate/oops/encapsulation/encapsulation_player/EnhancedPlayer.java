package oops.encapsulation.player;

public class EnhancedPlayer {
	
		private String name;
		private int hitPoints = 100;
		private String weapons;
		
		
		public EnhancedPlayer(String name, int hitPoints, String weapons) {
			this.name = name;
			
			if(hitPoints >0 && hitPoints <= 100) {
				this.hitPoints = hitPoints;
			}
//			this.hitPoints = hitPoints;
			this.weapons = weapons;
		}
		
		public void loseHealth(int damage) {
			this.hitPoints = this.hitPoints - damage;
			if(this.hitPoints <= 0) {
				System.out.println("Player knocked out");
			}
		}
		
		public int getHealth() {
			return hitPoints;
		}

}
