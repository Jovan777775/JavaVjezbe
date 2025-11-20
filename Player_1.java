package Projekat4;

public class Player extends GameObject {
	

    private String name;
    private int health;

    

	public Player(double x, double y, Collidable collider, String name, int health) {
		super(x, y, collider);
		this.name = name;
		this.health = Math.max(0, Math.min(100, health));
    }
	
	public void decreaseHealth(int dmg) {
        health = Math.max(0, health - dmg);
    }

	 public int getHealth() { return health; }



	@Override
	public String getDisplayName() {
		// TODO Auto-generated method stub
		return "Player[" + name + "] HP=" + health;
	}

}
