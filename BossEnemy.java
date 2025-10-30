package aa;

public class BossEnemy extends Enemy{

	public BossEnemy(int x, int y, int width, int height, String type, int x2, int y2, int width2, int height2,
			int damage) {
		super(x, y, width, height, type, x2, y2, width2, height2, damage);
	}

	@Override
	public String toString() {
		return "BossEnemy [getType()=" + getType() + ", getX()=" + getX() + ", getY()=" + getY() + ", getWidth()="
				+ getWidth() + ", getHeight()=" + getHeight() + ", getDamage()=" + getDamage() ;
	}
	
	
	

}
