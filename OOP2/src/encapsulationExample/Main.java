package encapsulationExample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// Bad way of encapsulating
		
		
//		Player player = new Player();
//		player.fullName = "Prince";
//		player.health = 20;
//		player.weapon = "Sword";
//		
//		int damage = 10;
//		player.loseHealth(damage);
//		System.out.println("Remaining health = " + player.healthRemaining());
//		
//		damage = 11;
//		player.health = 200;
//		player.loseHealth(damage);
//		System.out.println("Remaining health = " + player.healthRemaining());

		
		
		// encapsulation example
		
		EnhancedPlayer player = new EnhancedPlayer("Prince", 50, "Sword");
		System.out.println("Initial health is " + player.getHealth());
	}

}
